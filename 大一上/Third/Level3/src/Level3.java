import King.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Level3 {
    public static void main(String[] args){
        KingBoJi boJi=new KingBoJi();//创建波吉
        KingDaiDa daiDa=new KingDaiDa();//创建戴达

        List<King> kings = new ArrayList<>();
        kings.add(0,boJi);
        kings.add(1,daiDa);

        boJi.set();//设置初始的2个士兵
        daiDa.set();//3


        System.out.println("你是 ");
        System.out.println("1.波吉   2.戴达");
        Scanner s0=new Scanner(System.in);
        int i0=-1;
        i0=s0.nextInt()-1;
        do {
            switch (i0) {
                case 0:
                    System.out.println("你是 波吉。");
                    break;
                case 1:
                    System.out.println("你是 戴达。");
                    break;
                default:
                    System.out.println("没有这个国王！");
                    break;
            }

            if( i0>=0 && i0<=1 ){
                break;
            }else{
                System.out.println("请重新选择。");
            }
        }while(true);

        do{
            System.out.println("你现在有 "+ kings.get(i0).getSize() +" 个士兵。");
            System.out.println("你想做什么？");
            System.out.println("1.添加士兵");
            System.out.println("2.插入士兵");
            System.out.println("3.删除士兵");
            System.out.println("4.指定士兵回应");
            System.out.println("5.集体阅兵");


            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();//选择指令

            switch (n){
                case 1:
                    System.out.println("请决定该士兵阅兵时所说的话：");
                    Scanner scan1=new Scanner(System.in);
                    String str1=scan1.nextLine();

                    kings.get(i0).addSoldiers(kings.get(i0).getSize()+1, str1 );//添加

                    System.out.println("添加完成。");
                    break;

                case 2:
                    int i=100;
                    do {
                        System.out.println("请决定士兵插入的位置：");
                        Scanner scan2 = new Scanner(System.in);
                        i = scan2.nextInt();

                        if(i<= kings.get(i0).getSize()){
                            break;
                        }else {
                            System.out.println("这里无法插入，请重新决定。");
                        }
                    }while(true);

                    System.out.println("请决定该士兵阅兵时所说的话：");
                    Scanner scan3=new Scanner(System.in);
                    String str2=scan3.nextLine();

                    kings.get(i0).addSoldiers(i, str2 );//添加

                    System.out.println("添加完成。");
                    break;

                case 3:
                    System.out.println("请决定剔除第几个士兵：");
                    Scanner scan4=new Scanner(System.in);
                    int k=scan4.nextInt();

                    kings.get(i0).remove(k);//移除

                    System.out.println("剔除完成。");
                    break;

                case 4:
                    System.out.println("你想让第几个士兵回应？");
                    Scanner scan5=new Scanner(System.in);
                    int j=scan5.nextInt();

                    if(j<= kings.get(i0).getSize()) {
                        kings.get(i0).getSoldiers(j).response();//回应
                    }else{
                        System.out.println("你的士兵没那么多。");
                    }
                    break;

                case 5:
                    kings.get(i0).review();//阅兵
                    break;

                default:
                    System.out.println("错误的指令。");
                    break;
            }

            System.out.println("你还要发出指令码？");
            System.out.println("1.是   2.否");

            Scanner scanner=new Scanner(System.in);
            int num=scanner.nextInt();
            if(num==2){
                break;//判断是否结束
            }
        }while(true);
    }
}

//作业写了
//懂了，但没完全懂
