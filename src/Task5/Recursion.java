package Task5;
import java.util.Scanner;

public class Recursion {
   static int secondTask(int n,int i){
        if(i==n) {
            System.out.println(n);
            return 0;
        }
        i=i+1;
        return secondTask(n,i);
    }
   static int firstTask(int n,int k){
       if (k>n)
           return 0;
       for (int i = 1;i<=k;i++) {
           System.out.println(i);
       }
       k=k-1;
       return firstTask(n,k);
    }
    static int thirdTask(int a,int b,int i) {
        if (a < b) {
            if (i > b)
                return 0;
            System.out.println(i);
            i = i + 1;
            return thirdTask(a, b, i);
        } else {
            if (i < a)
                return 0;
            System.out.println(i);
            i = i - 1;
            return thirdTask(a, b, i);
        }
    }
    static int fourthTask(int len,int sum,int k,int s){
       if(len==k)
       {
           if(sum==s){
               return 1;
           }
           else{
               return 0;
           }
       }
       int c = (len==0?1:0);
       int res=0;
       for(int i=c;i<10;i++){
           res+=fourthTask(len+1,sum+i,k,s);
       }
       return res;
    }
    static int fifthTask(int n){
       if(n<10){
           return n;
       }
       else{
           return n%10+fifthTask(n/10);
       }
    }
    static boolean sixthTask(int n,int i){
       if(n<2){
           return false;
       }
       else if(n==2){
           return true;
       }
       else if(i<n/2){
           return sixthTask(n,i+1);
       }
       else{
           return true;
       }
    }
    static void seventhTask(int n,int k){
       if(k>n/2){
           System.out.println(n);
           return;
       }
       if(n%k==0){
           System.out.println(k);
           seventhTask(n/k,k);
       }
       else{
           seventhTask(n,++k);
       }
    }
    static String eightTask(String s){
       if(s.length()==1){
           return "YES";
       }
       else{
           if (s.substring(0, 1).equals((s.substring(s.length() - 1, s.length())))) {
               if(s.length()==2){
                   return "YES";
               }
               return eightTask(s.substring(1,s.length()-1));
           }else{
               return "NO";
           }
       }
    }
    static int ninethTask(int a,int b){
       if(a>b+1){
           return 0;
       }
       if(a==0||b==0){
           return 1;
       }
       return ninethTask(a,b-1)+ninethTask(a-1,b-1);
    }
    static int tenthTask(int n,int i){
       return (n==0)?i:tenthTask(n/10,i*10+n&10);
    }
    static int eleventhTask(){
       Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if(n==1){
            int m = in.nextInt();
            if(m==1){
                return eleventhTask()+n+m;
            }
            else{
                int k=in.nextInt();
                if (k == 1) {
                    return eleventhTask()+n+m+k;
                }else{
                    return n+m+k;
                }
            }
        }
        else{
            int m=in.nextInt();
            if(m==1){
                return eleventhTask()+n+m;
            }
            else{
                return n+m;
            }
        }
    }
    static void twelveTask(){
       java.util.Scanner in= new java.util.Scanner(System.in);
       int n=in.nextInt();
       if(n>0){
           if(n%2==1){
               System.out.println(n);
               twelveTask();
           }
           else{
               twelveTask();
           }
       }
    }
    static void threeteenthTask(){
       java.util.Scanner in = new java.util.Scanner(System.in);
       int n =in.nextInt();
       if(n>0){
           int m = in.nextInt();
           System.out.println(n);
           if(m>0){
               threeteenthTask();
           }
       }
    }
    static String fourteenthTask(int n){
       if(n<10){
           return Integer.toString(n);
       }
       else{
           return fourteenthTask(n/10)+" "+n%10;
       }
    }
    static int fifthteenthTask(int n) {
        if(n<10){
            return n;
        }
        else{
            System.out.println(n%10+" ");
            return fifthteenthTask(n/10);
        }
    }
    static void sixteenthTask(int max,int count){
       java.util.Scanner in = new java.util.Scanner(System.in);
       int n = in.nextInt();
       if(n>0){
           if(n>max){
               sixteenthTask(n,1);
           }
           else if(n==max){
               sixteenthTask(max,++count);
           }
           else{
               sixteenthTask(max,count);
           }
           }
       else {
           System.out.println(count);
       }
    }
    public static int seventeenthTask() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n= in.nextInt();
        if(n==0){
            return 0;
        }
        else {
            return Math.max(n,seventeenthTask());
        }
    }
    public static void main(String args[]){
       //1st task
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k=1;
        firstTask(n,k);
        //2nd task
        k=1;
        n=in.nextInt();
        in.close();
        secondTask(n,k);
        //3rd task
        int a,b;
        a=in.nextInt();
        b=in.nextInt();
        if (a<b)
            k=a;
        else k=b;
        thirdTask(a,b,k);
        //4th task
        int c;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        int d=in.nextInt();
        fourthTask(a,b,c,d);
        n=in.nextInt();
        fifthTask(n);
    }
}
