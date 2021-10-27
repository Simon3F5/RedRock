import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Level2 {
    public static void main(String[] args){

        System.out.println("请分别输入 数字总个数 与 选择数字个数");

        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        int n= sc1.nextInt();
        int k= sc2.nextInt();

        long a=k,b=(n-k+1),c=k;
        for(;k>1;){
            a*=--k;
        }
        System.out.println(a);//分母累乘


        for(;c>1;){
            b*=(1 + n - (--c));
        }
        System.out.println(b);//分子

        BigDecimal x = new BigDecimal(a);
        BigDecimal y = new BigDecimal(b);

        BigDecimal z = x.divide(y,20,RoundingMode.HALF_UP);
        System.out.println("中奖概率为："+z.toPlainString());
    }
}
