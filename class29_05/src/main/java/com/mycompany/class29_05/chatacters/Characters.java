package com.mycompany.class29_05.chatacters;

public class Characters {
    private String name;
    private int height;
    private String power;

    public Characters(String name, int height, String power) {
        this.name = name;
        this.height = height;
        this.power = power;
    }
    public void walk(){
        System.out.println("Personaje caminante");
    }
    public void atack(){
        System.out.println("Personaje atacante");
    }
    final public void die(){
        System.out.println("personaje puede morir");
    }
}
