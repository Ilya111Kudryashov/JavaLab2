package com.company;
import java.util.concurrent.TimeUnit;

public class Main {
    public static int a=2000000;
    public static int b=5;
    public static void main(String[] args) {
        Pojo f = new File();
        JavaPojo words=new JavaPojo();
        String[] arr=new String[a];
        int j=0;
        for(int i = 0; i < a ; i++)
        {
            if(j==words.keywordArr.length)
            {
                j=0;
            }
            arr[i]=words.keywordArr[j];
            j++;
        }

        long totalTime=System.currentTimeMillis();
        NewThread[] thread1 = new NewThread[b];
        for(int i=0;i<b;i++) {
            thread1[i]=new NewThread(arr,(arr.length/b)*i,(arr.length/b)*(i+1));
            thread1[i].start();
        }
        for(int i = 0 ; i < b ; i++) {
            try {
                thread1[i].join();
            } catch (InterruptedException e) { }
        }
        System.out.println(System.currentTimeMillis() - totalTime);
        f.printFunction(arr);
    }
}
