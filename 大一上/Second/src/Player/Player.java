package Player;

import Father.Father;

public class Player extends Father {

    public Player(String name, int blood, int attack, int defend) {
        super(name, blood, attack, defend);
    }


    public void attackPlayer(int attack,String name){
        System.out.println(name+" 发起了进攻！");
        super.setBlood(super.getBlood()-(attack-super.getDefend()));
        System.out.println(super.getName()+ " 的血量剩余："+super.getBlood());
    }

    public void skill1(){
        System.out.println(super.getName()+" 发动了【回春术】！");
        super.setBlood(super.getBlood()+1000);
    }//+1000HP

}
