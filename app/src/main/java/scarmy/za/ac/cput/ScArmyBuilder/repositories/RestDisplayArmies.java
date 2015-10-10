package scarmy.za.ac.cput.ScArmyBuilder.repositories;

import java.util.List;

import scarmy.za.ac.cput.ScArmyBuilder.model.ArmyObject;

/**
 * Created by Xeno on 2015/09/28.
 */
public interface RestDisplayArmies<A> {
    List<A> getArmyT();
    List<A> getArmyP();
    List<A> getArmyZ();
}
