package King;

import Soldier.Soldier;

import java.util.List;

public class KingBoJi extends King{
    public void set() {
        this.soldiers.add(0,() -> System.out.println("一号，波吉国王好！"));
        this.soldiers.add(1,() -> System.out.println("二号，波吉国王好！"));
    }

    public void addSoldiers(int i,String str){
        this.soldiers.add(i-1,() -> System.out.println(str));
    }

    public void remove(int i) {
        this.soldiers.remove(i-1);
    }

    public Soldier getSoldiers(int i) {
        return this.soldiers.get(i-1);
    }

    public int getSize(){
        return soldiers.size();
    }

     public void review() {
        for(int i=0;i<this.getSize();i++){
            this.getSoldiers(i+1).response();
        }
     }
}
