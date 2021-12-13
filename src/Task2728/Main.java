package Task2728;

import org.apache.commons.io.FileUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Main implements Runnable {
    public static void main(String[] args) {
        Main image = new Main();
        int cores = Runtime.getRuntime().availableProcessors();
        ArrayList<Thread> threads = new ArrayList<>();
        for(int i = 0; i < cores; i++) {
            Thread thread = new Thread(image);
            thread.setName(String.valueOf(i));
            threads.add(thread);
        }
        for (Thread thread : threads){
            thread.start();
        }
    }

    @Override
    public void run() {
        resize(Integer.parseInt(Thread.currentThread().getName()));
    }

    private void resize(int i) {
        int cores =Runtime.getRuntime().availableProcessors();
        String source = "src/Practise27_28/images";
        String dest = "src/Practise27_28/new_images";

        File srcSource = new File("src/123");
        File srcDest = new File("src/Practise27_28/new_images");

        File srcDir = new File(source);

        long start = System.currentTimeMillis();

        File[] files = srcDir.listFiles();
        assert files != null;
        cores=files.length/cores;
        try {
            if (!Files.exists(Paths.get(dest))) {
                Files.createDirectories(Paths.get(dest));
            }
            for (int l=i;l<cores*(i+1);l++) {
                File file = files[l];
                BufferedImage image = ImageIO.read(file);
                if (image == null) {
                    continue;
                }

                int newWidth = image.getWidth() / 4;
                int newHeight = (int) Math.round(
                        image.getHeight() / (image.getWidth() / (double) newWidth)
                );
                BufferedImage newImage = new BufferedImage(
                        newWidth, newHeight, BufferedImage.TYPE_INT_RGB
                );

                int widthStep = image.getWidth() / newWidth;
                int heightStep = image.getHeight() / newHeight;

                for (int x = 0; x < newWidth; x++) {
                    for (int y = 0; y < newHeight; y++) {
                        int rgb = image.getRGB(x * widthStep, y * heightStep);
                        newImage.setRGB(x, y, rgb);
                    }
                }

                File newFile = new File(dest + "/" + file.getName());
                ImageIO.write(newImage, "jpg", newFile);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            FileUtils.copyDirectory(srcSource, srcDest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Время работы: " + (System.currentTimeMillis() - start));
    }
}