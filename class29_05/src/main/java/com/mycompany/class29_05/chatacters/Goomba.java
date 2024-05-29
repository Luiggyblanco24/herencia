package com.mycompany.class29_05.chatacters;

public class Goomba extends Characters {

    private String color;
    private boolean Wings;
    
    public Goomba( String name, int height, String power) {
        super(name, height, power);
        this.color = color;
        this.Wings = Wings;
    }
    
    @Override
    public void walk(){
        System.out.println("caminando despacio no tengo piernitas");
    }

    public String getColor() {
        return color;
    }

    public boolean isWings() {
        return Wings;
    }
    
}
