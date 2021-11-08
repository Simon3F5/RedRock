package Dodge;

import Enemy.Enemy;

public class DodgeLv3 extends Dodge{
    private static Dodge next;//dodgeLv4

    @Override
    void dodgeEnemy(Enemy enemy) {
        if(DODGE<enemy.getATK()){
            System.out.println("波吉 闪避了！");
            enemy.attacked();
        }else{
            next.dodgeEnemy(enemy);//执行Lv4
        }
    }

    public void setNext(Dodge dodge) {
        next=dodge;
    }//为next赋值


}
