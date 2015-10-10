package scarmy.za.ac.cput.ScArmyBuilder.services;

import java.util.List;

/**
 * Created by Xeno on 2015/09/28.
 */
public interface ServiceAView<A> {
    public List<A> viewT();
    public List<A> viewP();
    public List<A> viewZ();
}
