package com.company;

public class AddTeg extends Decorator {
    public AddTeg(BackLight backLight)
    {
        super(backLight);
    }
    public String MakeBackLight(String word)
    {
        return "<b><i>"+super.MakeBackLight(word)+"</i></b>";
    }
}
