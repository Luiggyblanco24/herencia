package com.mycompany.class29_05;

import com.mycompany.class29_05.chatacters.Goomba;
import com.mycompany.class29_05.chatacters.Koopa;
import com.mycompany.class29_05.chatacters.Peach;

public class Class29_05 {

    public static void main(String[] args) {
        Peach peach = new Peach("princesa",140,"congelar");
        peach.longJump();
        
        Goomba goomba = new Goomba("goomba",50,"ninguno");
        goomba.walk();
        
        Koopa koopa = new Koopa("koopa",120,"escudo","espinas");
        koopa.walk();
        koopa.attack();
    }
}
