package com.company;

public class NewThread extends Thread {
    String[] arr;
    int leftBorder;
    int rightBorder;
    NewThread(String[] ARR,int lBorder,int rBorder){
        this.arr=ARR;
        this.leftBorder=lBorder;
        this.rightBorder=rBorder;
    }

    public void run()
    {
        for(int i = leftBorder; i < rightBorder ; i++) {
            for(int j = 0; j < JavaPojo.keywordArr.length; j++) {
                if( arr[i].equals(JavaPojo.keywordArr[j]) ) {
                    BackLight backLight=new AddTeg(new AddColor());
                    arr[i]=backLight.MakeBackLight(arr[i]);
                }
            }
        }
    }
}

