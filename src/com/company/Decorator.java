package com.company;

import java.util.Random;

/*public class Decorator {

    public static String Decorator(String word) {

        String color = "";
        Random random = new Random();
        for(int i = 0 ; i < 6 ; i++)
        {
            color += Integer.toHexString(random.nextInt(15));
        }
        System.out.println(color);
        return "<i><b><font color=\"#" + color + "\">" + word + "</font></i></b>";

    }

}*/
public class Decorator implements BackLight{

    BackLight backLight;
    public Decorator(BackLight backLight)
    {
        this.backLight= backLight;
    }
    public Decorator(){}

    @Override
    public String MakeBackLight(String word) {
        return backLight.MakeBackLight(word);
    }
}
