package Dodge;

import Enemy.Enemy;

public class DodgeLv1 extends Dodge {
    private static Dodge next;//dodgeLv2

    @Override
    public void dodgeEnemy(Enemy enemy) {
        if(3*DODGE<enemy.getATK()){
            System.out.println("波吉 润了！");//3倍判断
        }else{
            next.dodgeEnemy(enemy);//执行Lv2
        }
    }

    public void setNext(Dodge dodge) {
        next=dodge;
    }//为next赋值


}
