package Dodge;

import Enemy.Enemy;

public abstract class Dodge {
    final static int DODGE=100;//静态常量

    abstract void dodgeEnemy(Enemy enemy);
}//抽象类
