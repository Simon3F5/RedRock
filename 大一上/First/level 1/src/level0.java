public class level0 {
    public static void main(String[] args){
        System.out.println("乘法口诀表");

        int b=1;
        for(int a=1;a<9;a++){
            for(;b<10;b++){
                System.out.print(a +"*"+ b +"=" +(a*b)+"  ");
            }
            b++;
        }
    }
}
