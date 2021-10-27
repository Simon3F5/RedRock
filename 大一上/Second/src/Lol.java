import Equipment.Equipment;
import Player.*;
import Soldier.*;

import java.util.*;


public class Lol {
    public static void main(String[] args){

        Soldier so1=new Soldier("近战小兵",1800,120,30);
        Soldier so2=new Soldier("远程小兵",1200,200,5);
        Soldier so3=new Soldier("炮车",2500,250,50);
        Soldier so4=new Soldier("超级兵",3000,350,100);
        //设置小兵属性

        ArrayList<Soldier> arr=new ArrayList<Soldier>();
        arr.add(so1);
        arr.add(so2);
        arr.add(so3);
        arr.add(so4);
        //将小兵放入数组

        Player p=new Player("none",6000,600,40);//设置玩家属性

        Equipment e1=new Equipment("德拉克萨的暮刃（+400ATK）",0,400,0);
        Equipment e2=new Equipment("日炎圣盾（+600HP）",600,0,100);
        Equipment e3=new Equipment("渴血战斧（+100HP，+300ATK）",100,300,0);
        //设置装备

        ArrayList<Equipment> arr2=new ArrayList<Equipment>();
        arr2.add(e1);
        arr2.add(e2);
        arr2.add(e3);
        //将装备放入数组

        System.out.println(arr2.size());

        System.out.println("请输入您的名称（20字符以内）：");
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        p.setName(name);
        //设置名称

        System.out.println("您的属性为：");
        System.out.println("HP：" + p.getBlood());
        System.out.println("ATK：" + p.getAttack());
        System.out.println("DEF：" + p.getDefend());
        //展示属性


        int num=0;
        int times=2;//次数
        do{
            int j=0;
            System.out.println("请选择装备（至多两件）：");
            for(;j<arr2.size();j++) {
                System.out.println((j+1)+"."+arr2.get(j).getName());
            }//顺序输出装备
            Scanner sc=new Scanner(System.in);
            j=sc.nextInt();
            //选择
            if(j>0&&j<arr2.size()+1&&times>0) {
                p.setBlood(arr2.get(j-1).getBlood() + p.getBlood());
                p.setAttack(arr2.get(j-1).getAttack() + p.getAttack());
                p.setDefend(arr2.get(j-1).getDefend() + p.getDefend());
                //更改数据

                arr2.remove(j-1);//移除已选择的装备

                System.out.println("属性变更为：");
                System.out.println("HP：" + p.getBlood());
                System.out.println("ATK：" + p.getAttack());
                System.out.println("DEF：" + p.getDefend());
                //展示属性

                times--;//次数-1
            }else {
                System.out.println("输入错误！");
            }

            if(times<1){
                break;
            }//次数不足则退出

            System.out.println("是否继续选择？");
            System.out.println("1.是   2.否");
            Scanner sc1=new Scanner(System.in);
            num=sc1.nextInt();

        }while(num==1);


        System.out.println("请输入敌人数量：");
        System.out.println("（建议1~6）");
        Scanner s1=new Scanner(System.in);
        int i2=s1.nextInt();//敌人数量



        ArrayList<Soldier> array=new ArrayList<>();
        for(int j=0;j<i2;j++){
            Random r1 = new Random();//随机选择兵种
            int i1=r1.nextInt(4);//0~3兵种

            Soldier soldier=new Soldier(arr.get(i1).getName(),arr.get(i1).getBlood(),arr.get(i1).getAttack(),arr.get(i1).getDefend());
            array.add(soldier);//向新数组添加小兵
        }


        System.out.println("您将对战：");
        for(int j=0;j<array.size();j++) {
            System.out.println((j+1)+"."+array.get(j).getName());
        }//输出对战小兵
        System.out.println();



        System.out.println("战斗开始！");
        int time=3;//技能次数
        do {
            for (int j = 0; j < array.size(); j++) {
                System.out.print("第"+(j+1)+"个 ");
                p.attackPlayer(array.get(j).getAttack(), array.get(j).getName());
            }//小兵先手，顺序攻击玩家

            if(p.getBlood()<=0){
                break;
            }//玩家HP归零即结束


            System.out.println("敌方：");
            for(int j=0;j<array.size();j++){
                System.out.print((j+1)+"."+array.get(j).getName()+" HP："+array.get(j).getBlood()+"\n");
            }//输出敌方数据

            if(time>0){
            System.out.println("是否使用技能？（每局仅可使用3次）");
            System.out.println("1.是   2.否");//技能
            Scanner sc1=new Scanner(System.in);
            int n2=sc1.nextInt();

                if(n2==1) {
                    System.out.println("请选择技能：");
                    System.out.println("1.【回春术】增加1000HP\n2.【万箭齐发】对全体敌方造成500点伤害");
                    Scanner sc2 = new Scanner(System.in);
                    int n3 = sc2.nextInt();//选择

                    switch (n3) {
                        case 1:
                            p.skill1();//+1000HP
                            System.out.println("HP+1000");
                            break;
                        case 2:
                            System.out.println(p.getName() + " 发动了【万箭齐发】！");
                            for (int j = 0; j < array.size(); j++) {
                                array.get(j).skill2();
                            }
                            System.out.println("敌方数据变更：");
                            for (int j = 0; j < array.size(); j++) {
                                System.out.print((j + 1) + "." + array.get(j).getName() + " HP：" + array.get(j).getBlood() + "\n");
                            }
                            System.out.println();
                            break;
                    }
                    time--;//次数-1
                }else if(n2==2){
                    System.out.print("\n请选择平A对象:");//平A选择
                    Scanner s2 = new Scanner(System.in);
                    int num2 = s2.nextInt();

                    array.get(num2 - 1).attackSoldier(p.getAttack(), p.getName(), num2);//攻击
                }
            }else {
                System.out.print("\n请选择平A对象:");//平A选择
                Scanner s2 = new Scanner(System.in);
                int num2 = s2.nextInt();

                array.get(num2 - 1).attackSoldier(p.getAttack(), p.getName(), num2);//攻击
            }


            for(int j=0; j<array.size(); j++){
                if(array.get(j).getBlood()<=0){
                    System.out.println(array.get(j).getName()+" 死亡！");
                    array.remove(j);//判断PH<0则死亡，从数组删除
                }
            }


            if(array.size()==0){
                break;
            }//结束判定
        }while(true);


        System.out.println("战斗结束！");
        if(p.getBlood()>0) {
            System.out.println("胜利者是：" + p.getName()+"！");
        }else{
            System.out.println("胜利者是：小兵！");
        }
    }
}
