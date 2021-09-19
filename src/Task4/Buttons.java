package Task4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Buttons extends JFrame {
    JButton but1 = new JButton("Real Madrid");
    JButton but2 = new JButton("AC Milan");
    JLabel lbl = new JLabel(""+0+" : "+0);
    JButton but3 = new JButton("Ending match");
    JLabel lb2 = new JLabel("Last goal: ");
    int x = 0;
    int y = 0;
    public Buttons()
    {
        setLayout(null);

        lbl.setBounds(235, 20, 100, 100);
        lb2.setBounds(185, 40, 400, 100);
        but1.setBounds(5, 125, 235, 50);
        but2.setBounds(245, 125, 235, 50);
        but3.setBounds(10, 180, 465, 25);

        add(lbl);

        add(lb2);

        add(but1);

        add(but2);

        add(but3);

        setSize(500,250);
        but1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                x = x+1;
                lbl.setText(""+x+" : "+y);
                lb2.setText("Last goal: Real Madrid");
            }
        });
        but2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                y = y+1;
                lbl.setText(""+x+" : "+y);
                lb2.setText("Last goal: AC Milan");
            }
        });
        but3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae){
                try
                {
                    if (y>x)
                    {
                        JOptionPane.showMessageDialog(null, "AC Milan","Winner",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        if (x==y)
                        {
                            JOptionPane.showMessageDialog(null, "Draw","Winner",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Real Madrid","Winner",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }

                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Error inNumbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }
    public static void main(String[]args)
    {
        new Buttons().setVisible(true);
    }
}