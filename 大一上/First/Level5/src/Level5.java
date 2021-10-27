import java.util.*;
import java.lang.*;

class MutableArrayList{
    private int size=2;
    private Object[] elementDate=new Object[size];//Object数组


    public void add1(Object obj){
        for(int i=0;i<elementDate.length;i++){
            if(elementDate[i]==null){
                elementDate[i]=obj;
                break;
            }//若有空位则填入
            if(i== elementDate.length-1){
                elementDate= Arrays.copyOf(elementDate,(elementDate.length+1));//长度+1
                elementDate[i+1]=obj;
                break;
            }//无空位则扩容
        }
        System.out.println("成功！");
    }//添加元素

    public void get(int index){
        if(index<elementDate.length){
            System.out.println(elementDate[index]);//输出
        }else {
            System.out.println("错误！");
        }
    }//获取元素

    public void remove1(int index){
        Object[] o = new Object[elementDate.length - 1];//新Object数组，长度比原数组-1
        for (int i = 0,j = 0; i < elementDate.length; i++) {
            if (i == index){
                continue;//二者相等时跳过j++，做到删除
            }
            o[j++] = elementDate[i];
        }
        elementDate= Arrays.copyOf(o,o.length);//数据转移

        System.out.println("成功！");
    }//移除元素

    public void remove2(Object obj){
        for(int i=0;i< elementDate.length;i++){
            if(obj.equals(elementDate[i])){
                for(int j=i;j< elementDate.length-1;j++) {
                    elementDate[j] = elementDate[j + 1];
                }
                elementDate=Arrays.copyOf(elementDate,elementDate.length-1);

                System.out.println("成功！");

                break;
            }
        }
    }//移除指定元素

    public void add2(int index,Object obj){
        Object[] o = new Object[elementDate.length + 1];
        for (int i = 0; i < elementDate.length; i++) {
            o[i]=elementDate[i];
        }
        for(int i=o.length-1;i>index;i--){
            o[i]=o[i-1];
        }
        o[index]=obj;

        elementDate=Arrays.copyOf(o,o.length);

        System.out.println("成功！");
    }//添加元素至指定位置

    public Object getSize() {
        return elementDate.length;//返回数组长度
    }//获取数组长度

    public void print(){
        for(int i=0;i<elementDate.length;i++) {
            System.out.println(elementDate[i]);//顺序输出
        }
    }
}


public class Level5 {
    public static void main(String[] args){
        int num1;

        MutableArrayList arr=new MutableArrayList();//new一个对象

        //dowhile循环以持续输入输出
        do {
            System.out.println("1.添加元素");
            System.out.println("2.插入元素");
            System.out.println("3.删除元素");
            System.out.println("4.删除指定元素");
            System.out.println("5.输出元素");
            System.out.println("6.输出数组长度");
            System.out.println("7.顺序输出数组");

            Scanner s=new Scanner(System.in);
            int num=s.nextInt();
            //利用num判断
            switch (num) {
                case 1:
                    System.out.println("请输入元素：");
                    Scanner s1=new Scanner(System.in);
                    String obj1=s1.nextLine();

                    arr.add1(obj1);//调用add1

                    break;
                case 2:
                    System.out.println("请分别输入元素位置与元素内容：（回车分割）");

                    Scanner s22=new Scanner(System.in);
                    Scanner s2=new Scanner(System.in);
                    int obj2=s2.nextInt();
                    String obj22=s22.nextLine();

                    arr.add2(obj2,obj22);//调用add2

                    break;
                case 3:
                    System.out.println("请输入需要删除的元素的位置：");

                    Scanner s3=new Scanner(System.in);
                    int obj3=s3.nextInt();

                    arr.remove1(obj3);//调用remove1

                    break;

                case 4:
                    System.out.println("请输入需要删除的元素：");

                    Scanner s44=new Scanner(System.in);
                    String obj44=s44.nextLine();

                    arr.remove2(obj44);//调用remove2

                    break;
                case 5:
                    System.out.println("请输入需要输出的元素位置：");

                    Scanner s4=new Scanner(System.in);
                    int obj4=s4.nextInt();

                    arr.get(obj4);//调用get

                    break;
                case 6:
                    System.out.println("数组长度为："+ arr.getSize());//调用getSize
                    break;
                case 7:
                    arr.print();//调用print
                    break;
                default:
                    System.out.println("错误！");
            }

            System.out.println("是否继续操作？\n1.是   2.否");

            Scanner s4=new Scanner(System.in);
            num1 = s4.nextInt();
        }while(num1==1);//判断是否继续
    }
}

//本来以为自己做不到
//结果写出来了
//果然还是要勇于尝试