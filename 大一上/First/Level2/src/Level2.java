public class Level2 {
    public static void main(String[] args){
        int score[]={25,98,42,13,7,64,99};

        System.out.println("原数组：25,98,42,13,7,64,99");

        for(int i = 1;i<score.length;i++){
            for(int j=0;j<score.length;j++){
                if(score[j]>score[i]){
                    int temp=score[j];
                    score[j]=score[i];
                    score[i]=temp;
                }
            }
        }

        System.out.println("冒泡排序(由小到大)：");
        for(int i=0;i<score.length;i++){
            System.out.print(score[i] +"  ");
        }


        for(int i=0;i<score.length;i++){
            for(int j=1;j<score.length;j++){
                if(score[j]>score[i]){
                    int temp=score[j];
                    score[j]=score[i];
                    score[i]=temp;

                }
            }
        }

        System.out.println("简单排序(由大到小)：");
        for(int i=0;i<score.length;i++){

        }
    }
}
