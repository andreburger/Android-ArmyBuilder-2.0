package scarmy.za.ac.cput.ScArmyBuilder.services;

/**
 * Created by Xeno on 2015/09/28.
 */
public interface ServiceADelete<A> {
    public void deleteT(A entity);
    public void deleteP(A entity);
    public void deleteZ(A entity);
}
