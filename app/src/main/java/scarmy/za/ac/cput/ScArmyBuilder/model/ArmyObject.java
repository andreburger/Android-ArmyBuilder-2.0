package scarmy.za.ac.cput.ScArmyBuilder.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Xeno on 2015/09/28.
 */
public class ArmyObject {
    Long id;
    String armyName;
    int armyPop;
    ArrayList<HashMap<String,String>> armyUnits = new ArrayList();
    String user;
    String race;

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getArmyName() {
        return armyName;
    }
    public void setArmyName(String armyName) {
        this.armyName = armyName;
    }

    public int getArmyPop() {
        return armyPop;
    }
    public void setArmyPop(int armyPop) {
        this.armyPop = armyPop;
    }

    public ArrayList<HashMap<String, String>> getArmyUnits() {
        return armyUnits;
    }
    public void setArmyUnits(ArrayList<HashMap<String, String>> armyUnits) {
        this.armyUnits = armyUnits;
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
}
