package scarmy.za.ac.cput.ScArmyBuilder.repositories;

/**
 * Created by Xeno on 2015/09/27.
 */
public interface RestAPI<U> {

    String get(U entity);
    String post(U entity);
   // String delete(U entity);
   // String put(U entity);

}
