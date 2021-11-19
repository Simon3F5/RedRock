import Calculation.Add;
import Calculation.Div;
import Calculation.Mul;
import Calculation.Sub;

import java.math.BigDecimal;
import java.util.*;

public class Calculator {
    public static boolean isStrNum(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }//判断字符串是否可以转换为数字

    public static void main(String[] args){


        System.out.println("*注：");
        System.out.println("1.支持输入多项式，如：1 + 3 + 5 + 9 ");
        System.out.println("2.仅能"+"\033[33;4m"+"从左往右"+"\033[0m"+"计算，如：1 + 2 / 3 = 1 ");
        System.out.println("3."+"\033[33;4m" + "不支持" + "\033[0m"+"括号优先级，如：1 + (3 + 1) ");
        System.out.println("4.复数请打括号，如：(-3)\n");

        System.out.println("请输入表达式（如1+1）：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        ArrayList<String> array = new ArrayList<>();//创建数组


        do {
            try {
                for (int j = 0; j < str.length(); j++) {
                    if(String.valueOf(str.charAt(j)).equals("(")){
                        String temp=str.substring(str.indexOf("(")+1,str.indexOf(")"));
                        array.add(temp);
                        j+=temp.length()+1;
                    }else {
                        array.add(String.valueOf(str.charAt(j)));
                    }
                }//将输入的字符串拆分放入数组
                if(array.size()==0){
                    throw new Exception("表达式不符合规范");
                }//未输入则抛出异常

                int num=0;
                for(int i=0;i<array.size();i++){
                    if(array.get(i).equals("+") || array.get(i).equals("-") || array.get(i).equals("*") || array.get(i).equals("/")){
                        num++;
                    }
                    if(array.get(i).equals("(")){
                        num--;
                    }
                }

                for(int i=0;i<array.size();i++){
                    int time=0;
                    if(isStrNum(array.get(i))) {
                        String temp = "";
                        for (int j = i; j < array.size(); j++) {
                            if (isStrNum(array.get(j))) {
                                temp =temp + array.get(j);
                                time++;
                            }else {
                                break;
                            }
                        }
                        if(time>0) {
                            array.add(i, temp);
                            for (int k = 0; k < time; k++) {
                                array.remove(i + 1 );
                            }
                        }
                    }
                }//数字合并


                boolean bool=false;

                for (int i = 0; i < str.length(); i++) {
                    int ascii=str.charAt(i);
                    switch (ascii) {
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 45:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            break;
                        default:
                            bool = true;
                            break;
                    }
                }//判断输入的字符是否为数字与计算符号

                for(int i=0;i< array.size();i++){
                    if( i%2==0 ){
                        if(!isStrNum(array.get(i))){
                            bool=true;
                            break;
                        }
                    }else {
                        if(isStrNum(array.get(i))){
                            bool=true;
                            break;
                        }
                    }
                }//判断是否合法

                if(bool){
                    throw new Exception("表达式不符合规范");
                }//抛出异常

                break;//若一路顺风则出循环

            }catch (Throwable e){//捕获
                array.clear();

                System.out.println(e);
                System.out.println("请重新输入：");
                Scanner scanner1 = new Scanner(System.in);
                str = scanner1.nextLine();
            }//重新输入
        }while(true);


        for(int i=0;array.size()!=1;){//计算
            switch (array.get(i)) {
                case "+" -> {
                    BigDecimal result = Add.myAdd(new BigDecimal(array.get(i - 1)), new BigDecimal(array.get(i + 1)));
                    array.remove(i + 1);
                    array.remove(i);
                    array.remove(i - 1);
                    array.add(0, String.valueOf(result));
                }
                case "-" -> {
                    BigDecimal result = Sub.mySub(new BigDecimal(array.get(i - 1)), new BigDecimal(array.get(i + 1)));
                    array.remove(i + 1);
                    array.remove(i);
                    array.remove(i - 1);
                    array.add(0, String.valueOf(result));
                }
                case "*" -> {
                    BigDecimal result = Mul.myMul(new BigDecimal(array.get(i - 1)), new BigDecimal(array.get(i + 1)));
                    array.remove(i + 1);
                    array.remove(i);
                    array.remove(i - 1);
                    array.add(0, String.valueOf(result));
                }
                case "/" -> {
                    BigDecimal result = Div.myDiv(new BigDecimal(array.get(i - 1)), new BigDecimal(array.get(i + 1)));
                    array.remove(i + 1);
                    array.remove(i);
                    array.remove(i - 1);
                    array.add(0, String.valueOf(result));
                }
                default -> i++;
            }
        }

        System.out.println("结果为："+array.get(0));//输出
    }
}

//感觉四个类没用上。
//就这样罢。
