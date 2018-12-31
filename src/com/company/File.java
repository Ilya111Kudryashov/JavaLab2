package com.company;

import java.io.*;

public class File implements Pojo {
    @Override
    public void printFunction(String[] arr) {
        try(FileWriter writer = new FileWriter("file.html", false)){
            for(int i = 0; i < arr.length; i++)
                writer.write(arr[i] + " ");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String[] keywordSelection(String[] arr) {
        return new String[0];
    }

    @Override
    public String[] Parser(String str) {
        return new String[0];
    }
}
