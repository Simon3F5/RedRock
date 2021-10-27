import java.util.*;

public class Level3 {
    public static void main(String[] args){

        String[][] students =new String[10][2];

        int num2;

        do {
            System.out.println("学生信息系统\n1.输入学生信息   2.删除学生信息\n3.修改学生信息   4.查询学生信息\n5.按学号顺序输出学生信息\n（若输入错误则不会显示成功字样）");
            System.out.println("PS：目前可存储十名学生的信息");
            Scanner s1 = new Scanner(System.in);
            int num1 = s1.nextInt();

            switch (num1) {
                case 1: {
                    System.out.println("请输入学生的 学号 及 姓名");
                    Scanner sc1 = new Scanner(System.in);
                    Scanner sc2 = new Scanner(System.in);
                    String str1 = sc1.nextLine();
                    String str2 = sc2.nextLine();

                    for (int i = 0; i < students.length; i++) {
                        if (students[i][0] == null && students[i][1] == null) {
                            students[i][0] = str1;
                            students[i][1] = str2;
                            System.out.println(students[i][0] + students[i][1]);
                            System.out.println("成功");
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("请输入需要删除信息的学生学号：");
                    Scanner sc3 = new Scanner(System.in);
                    String str3 = sc3.nextLine();

                    for (int i = 0; i < students.length; i++) {
                        if(str3.equals(students[i][0])){
                            students[i][0]=null;
                            students[i][1]=null;
                            System.out.println("成功");
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("请输入需要修改信息的学生学号：");
                    Scanner sc4 = new Scanner(System.in);
                    String str4 = sc4.nextLine();

                    System.out.println("请输入修改后的 学号 与 姓名");
                    Scanner sc5 = new Scanner(System.in);
                    String str5 = sc5.nextLine();
                    Scanner sc6 = new Scanner(System.in);
                    String str6 = sc6.nextLine();

                    for (int i = 0; i < students.length; i++) {
                        if(str4.equals(students[i][0])){
                            students[i][0]=str5;
                            students[i][1]=str6;
                            System.out.println("成功");
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("请输入需要查询信息的学生学号：");
                    Scanner sc7 = new Scanner(System.in);
                    String str7 = sc7.nextLine();

                    for (int i = 0; i < students.length; i++) {
                        if(str7.equals(students[i][0])){
                            System.out.println(students[i][0]+students[i][1]);
                            System.out.println("成功");
                        }
                    }
                    break;
                }
                case 5:{
                    int N=0;

                    for(int n=0;n<students.length;n++){
                        if (students[n][0] != null && students[n][1] != null){
                                N++;
                        }
                    }//判断数组元素个数

                    String[][] stu=new String[N][2];//新建一个长度等于元素个数的数组
                    for(int n=0;n<stu.length;n++){
                        stu[n][0]=students[n][0];
                        stu[n][1]=students[n][1];
                    }

                    for(int i=1;i<stu.length;i++){//换序
                        for(int j=0;j<stu.length;j++){
                            int x=Integer.parseInt(stu[i][0]);
                            int y=Integer.parseInt(stu[j][0]);
                            if (x < y) {
                                String change1=stu[i][0];
                                String change2=stu[i][1];
                                stu[i][0]=stu[j][0];
                                stu[i][1]=stu[j][1];
                                stu[j][0]=change1;
                                stu[j][1]=change2;
                            }
                        }
                    }


                    for(int a=0;a<stu.length;a++){
                            System.out.println(stu[a][0]+"  "+stu[a][1]);//输出
                    }
                    System.out.println("成功");
                    break;
                }

                case 100:{
                    System.out.println(students[0][0] + students[0][1]);//测试
                    break;
                }

                default: {
                    System.out.println("未知错误");
                    break;
                }
            }

            System.out.println("是否继续操作？\n1.是   2.否");
            Scanner s2 = new Scanner(System.in);
            num2 = s2.nextInt();
        }while(num2==1);

        System.out.println("结束");
    }
}//不知道还有没有bug