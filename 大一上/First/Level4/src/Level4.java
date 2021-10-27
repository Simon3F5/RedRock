import java.util.Arrays;
import java.util.Scanner;

class Meal{
    String number;
    String name;
    String price;

    /*
    public Meal(){}
    public Meal(String number,String name,String price){
        this.
    }

    /*
    public String getName() {
        return name;
    }//返回菜名

    public String getPrice() {
        return price;
    }//返回价格



    public void order(String s){
        int i=Integer.parseInt(s);

        System.out.println("您选择了："+this.getName());
        System.out.println("总计 "+this.getPrice()+" 元");

    }//点餐

    */

}//菜单类

class Restaurant{
    String name;

    public void welcome(){
        System.out.println("欢迎光临"+name+"\n这是今天的菜单：");
    }//欢迎
}//饭店类

public class Level4 {

    public static void payMethod(){
        System.out.println("请选择支付方式\n1.支付宝\n2.微信\n3.人脸识别");
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        switch (i){
            case 1:
            case 2:
            case 3:
            System.out.println("支付成功！祝您用餐愉快！");
            break;
        }
    }//支付

    public static String[][][] sort(String[][][] string){
        String[][][] str2=new String[2][3][9];

        for(int x=0;x<2;x++){
            for(int y=0;y<3;y++){
                for(int z=0;z<9;z++){
                    if((x==0&&y==0&&z>=3)||(x==0&&y>0)) {
                        break;
                    }else{
                        str2[x][y][z]=string[x][y][z];
                    }

                }
            }
        }//数组复制

        for(int i=1;i<9;i++){
            for(int j=0;j<9;j++){
                if(Integer.parseInt(str2[1][2][j])<Integer.parseInt(str2[1][2][i])){
                    int temp1= Integer.parseInt(str2[1][2][i]);
                    str2[1][2][i]= str2[1][2][j];
                    str2[1][2][j]= String.valueOf(temp1);

                    String temp2= str2[1][1][i];
                    str2[1][1][i]= str2[1][1][j];
                    str2[1][1][j]=temp2;
                }
            }
        }//排序

        return str2;
    }

    public static String order1(String[] strings){
        int sum = 0;
        for(int i=0;i< strings.length;i++){
            if(strings[i].equals("1")){
                sum=sum+59;
            }
            if(strings[i].equals("2")){
                sum=sum+39;
            }
            if(strings[i].equals("3")){
                sum=sum+89;
            }
            if(strings[i].equals("4")){
                sum=sum+79;
            }
        }
        String s = Arrays.toString(new int[]{sum});
        return s;
    }

    public static String order2(String[] strings){
        int sum = 0;
        for(int i=0;i< strings.length;i++){
            if(strings[i].equals("1")){
                sum=sum+12;
            }
            if(strings[i].equals("2")){
                sum=sum+21;
            }
            if(strings[i].equals("3")){
                sum=sum+25;
            }
        }
        String s = Arrays.toString(new int[]{sum});
        return s;
    }

    public static String order3(String[] strings){
        int sum = 0;
        for(int i=0;i< strings.length;i++){
            if(strings[i].equals("1")){
                sum=sum+11;
            }
            if(strings[i].equals("2")){
                sum=sum+12;
            }
        }
        String s = Arrays.toString(new int[]{sum});
        return s;
    }

    public static void main(String[] args){

        Meal m1=new Meal();
        Meal m2=new Meal();
        Meal m3=new Meal();
        Meal m4=new Meal();
        Meal m5=new Meal();
        Meal m6=new Meal();
        Meal m7=new Meal();
        Meal m8=new Meal();
        Meal m9=new Meal();

        m1.number="1";
        m2.number="2";
        m3.number="3";
        m4.number="4";
        m5.number="5";
        m6.number="6";
        m7.number="7";
        m8.number="8";
        m9.number="9";

        m1.price="59";
        m2.price="39";
        m3.price="89";
        m4.price="79";
        m5.price="12";
        m6.price="21";
        m7.price="25";
        m8.price="11";
        m9.price="12";

        m1.name="糖醋排骨";
        m2.name="香酥里脊";
        m3.name="红烧狮子头";
        m4.name="蚝油杏鲍菇";
        m5.name="蛋炒饭";
        m6.name="烧猪蹄";
        m7.name="回锅肉";
        m8.name="羊肉粉(汤)";
        m9.name="羊杂粉(干拌)";

        Restaurant r1=new Restaurant();
        Restaurant r2=new Restaurant();
        Restaurant r3=new Restaurant();

        r1.name="国民饭店";
        r2.name="芙蓉大饭店";
        r3.name="罗记羊肉粉馆";

        String[][][] str={
                {{r1.name,r2.name,r3.name}},
                {
                    {m1.number,m2.number,m3.number,m4.number,   m5.number,m6.number,m7.number,   m8.number,m9.number},
                    {m1.name,m2.name,m3.name,m4.name,   m5.name,m6.name,m7.name,   m8.name,m9.name},
                    {m1.price,m2.price,m3.price,m4.price,   m5.price,m6.price,m7.price,   m8.price,m9.price},
                }
        };//三维数组

        System.out.println("今日菜单：");
        for (int y = 0,x = 0; y < 9; y++) {
            if(y==0||y==4||y==7){
                System.out.println();
                System.out.println(str[0][0][x]+"：");
                x++;
            }else {
                System.out.println();
            }
            for (int z = 1; z < 3; z++) {
                if((y==3&&z==3)||(y==7&&z==3)){
                    break;
                }
                System.out.print(str[1][z][y]);
            }
        }
        System.out.println("\n");


        System.out.println("是否按价格排序？\n1.是   2.否");
        Scanner s1=new Scanner(System.in);
        int num= s1.nextInt();
        if(num==1){
            String[][][] str2=sort(str);
            for(int i=0;i<9;i++) {
                System.out.print(str2[1][1][i]);
                System.out.println(str2[1][2][i]);
            }
        }


        System.out.println("请选择饭店：\n1."+r1.name+"\n2."+r2.name+"\n3."+r3.name);
        Scanner s2=new Scanner(System.in);
        int i= s2.nextInt();

        switch (i){
            case 1:
                r1.welcome();
                for(int j=0;j<4;j++){
                    System.out.println((j+1)+"."+str[1][1][j]+"  "+str[1][2][j]+"元");
                }

                Scanner scan1 = new Scanner(System.in);
                System.out.println("请点餐(使用空格分隔)：");
                String str3 = scan1.nextLine();
                String[] str4=str3.split(" ");

                String str5 = order1(str4);

                System.out.println("共计 "+str5+" 元");
                break;

            case 2:
                r2.welcome();
                for(int j=4;j< 7;j++){
                    System.out.println((j-3)+str[1][1][j]+"  "+str[1][2][j]+"元");
                }

                Scanner scan2 = new Scanner(System.in);
                System.out.println("请点餐(使用空格分隔)：");
                String str6 = scan2.nextLine();
                String[] str7=str6.split(" ");

                String str8 = order2(str7);

                System.out.println("共计 "+str8+" 元");
                break;

            case 3:
                r3.welcome();
                for(int j=7;j<9;j++){
                    System.out.println((j-6)+str[1][1][j]+"  "+str[1][2][j]+"元");
                }

                Scanner scan3 = new Scanner(System.in);
                System.out.println("请点餐(使用空格分隔)：");
                String str9 = scan3.nextLine();
                String[] str10=str9.split(" ");

                String str11 = order3(str10);

                System.out.println("共计 "+str11+" 元");
                break;
        }
        payMethod();
    }
}
