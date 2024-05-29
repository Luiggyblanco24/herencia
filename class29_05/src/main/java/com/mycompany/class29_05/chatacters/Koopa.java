package com.mycompany.class29_05.chatacters;

public class Koopa extends Characters{
    
    private String shellType;
    
 public Koopa(String name, int height, String power, String shellType) {
        super(name, height, power);
        this.shellType = shellType;
    }
 public void attack(){
     super.atack();
     System.out.println("Lanzar martillos");
 }
   
}
