import java.util.Scanner;

public class Level1 {
    public static void main(String[] args){

        double d;
        int j = 0;
        String str="no";

        while(j==0){
            Scanner x=new Scanner(System.in);
            Scanner y=new Scanner(System.in);
            Scanner z=new Scanner(System.in);

            System.out.println("请分别输入 平时、期中、期末 三部分成绩：");

            int a= x.nextInt();
            int b= x.nextInt();
            int c= x.nextInt();

            d=a*0.2+b*0.3+c*0.5;
            if(d>60){
                System.out.println("就这？还没我卷");
            }else{
                System.out.println("勇敢俊枭，不怕困难");
            }

            System.out.println("是否要再玩一局？（输入yes或no）");

            Scanner i=new Scanner(System.in);
            String s=i.nextLine();

            boolean bool = (str.equals(s));

            if (bool) {
                break;
            }
        }
        System.out.println("结束");
    }
}
