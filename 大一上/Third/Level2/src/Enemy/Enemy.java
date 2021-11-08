package Enemy;

import Dodge.Dodge;
import Dodge.DodgeLv1;

public class Enemy {
    final int ATK;//攻击常量

    public Enemy(int aTK){
        this.ATK=aTK;
    }//设置攻击

    public int getATK(){
        return ATK;
    }//获取攻击


    public void attack(Dodge dodge){
        System.out.println("敌人 发动了 攻击！");
        new DodgeLv1().dodgeEnemy(new Enemy(ATK));
    }//攻击方法

    public void attacked(){
        System.out.println("波吉 发动了 反击！");
    }//反击方法
}
