package King;

import Soldier.Soldier;

import java.util.ArrayList;
import java.util.List;

public abstract class King {
    List<Soldier> soldiers = new ArrayList<>();

    public abstract void set();

    public abstract void addSoldiers(int i, String str);

    public abstract void remove(int i);

    public abstract Soldier getSoldiers(int i) ;

    public abstract int getSize();

    public abstract void review();
}
