package com.company;
import java.util.Random;
public class AddColor extends Decorator {
    public AddColor(BackLight backLight) {
        super(backLight);
    }
    public AddColor() {
        super();
    }
    public String MakeBackLight(String word)
    {
        String color = "";
        Random random = new Random();
        for(int i = 0 ; i < 6 ; i++)
        {
            color += Integer.toHexString(random.nextInt(15));
        }
        //System.out.println(color);
        return "<font color=\"#" + color + "\">" + word + "</font>";
    }
}
