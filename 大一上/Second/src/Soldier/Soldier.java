package Soldier;

import Father.Father;

public class Soldier extends Father {

    public Soldier(String name, int blood, int attack, int defend) {
        super(name, blood, attack, defend);
    }

    public void attackSoldier(int attack, String name,int no){
        System.out.println(name +"向第"+no+"个"+this.getName()+ "发起了进攻！");
        this.setBlood(this.getBlood()-(attack-this.getDefend()));
        System.out.println("第"+no+"个"+this.getName()+" 的血量剩余："+this.getBlood());
    }

    public void skill2(){
        this.setBlood(this.getBlood()-(500-this.getDefend()));
    }//万箭
}


