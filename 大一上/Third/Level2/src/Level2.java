import Dodge.DodgeLv1;
import Dodge.DodgeLv2;
import Dodge.DodgeLv3;
import Dodge.DodgeLv4;
import Enemy.Enemy;

import java.util.Random;


public class Level2 {
    public static void main(String[] args){

        DodgeLv1 dodgeLv1=new DodgeLv1();
        DodgeLv2 dodgeLv2=new DodgeLv2();
        DodgeLv3 dodgeLv3=new DodgeLv3();
        DodgeLv4 dodgeLv4=new DodgeLv4();//创建对象

        dodgeLv1.setNext(dodgeLv2);
        dodgeLv2.setNext(dodgeLv3);
        dodgeLv3.setNext(dodgeLv4);//赋值

        Random r=new Random();
        int i=r.nextInt(400);//随机敌人攻击0~400
        System.out.println("敌人的攻击为："+i);
        Enemy enemy=new Enemy(i);//设置攻击

        enemy.attack(dodgeLv1);//敌人发动攻击
    }
}

/*
不知道怎么写出来的，
反正是写出来了。
就这样罢。
 */