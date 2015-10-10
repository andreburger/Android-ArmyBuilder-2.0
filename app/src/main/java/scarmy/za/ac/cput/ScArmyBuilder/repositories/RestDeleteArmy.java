package scarmy.za.ac.cput.ScArmyBuilder.repositories;

/**
 * Created by Xeno on 2015/09/28.
 */
public interface RestDeleteArmy<A> {
    void deleteT(A entity);
    void deleteP(A entity);
    void deleteZ(A entity);
}
