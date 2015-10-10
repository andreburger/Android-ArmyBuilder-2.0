package scarmy.za.ac.cput.ScArmyBuilder.repositories;

/**
 * Created by Xeno on 2015/09/27.
 */
public interface RestCreateArmy<A> {
        String postT(A entity);
        String postP(A entity);
        String postZ(A entity);

}
