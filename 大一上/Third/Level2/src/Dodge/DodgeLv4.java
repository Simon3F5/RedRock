package Dodge;

import Enemy.Enemy;

public class DodgeLv4 extends Dodge{

    @Override
    void dodgeEnemy(Enemy enemy) {
        if(DODGE>=enemy.getATK()){
            enemy.attacked();
        }else{
            System.out.println(1);
        }
    }



}
