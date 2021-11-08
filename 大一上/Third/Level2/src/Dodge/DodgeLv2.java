package Dodge;

import Enemy.Enemy;

public class DodgeLv2 extends Dodge{
    private static Dodge next;//dodgeLv3

    @Override
    void dodgeEnemy(Enemy enemy) {
        if(2*DODGE<enemy.getATK()){
            System.out.println("波吉 挡下了一击！");
            System.out.println("波吉 润了！");
        }else{
            next.dodgeEnemy(enemy);//执行Lv3
        }
    }

    public void setNext(Dodge dodge) {
        next=dodge;
    }//为next赋值



}
