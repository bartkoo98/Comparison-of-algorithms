package bartkoo98;

import java.util.Random;

public class ContainerGenerator {
    public static OwnContainer generateRandomArray( int size)
    {
        Random rand = new Random();
        OwnContainer oc = new OwnContainer();
        for(int i = 0 ; i < size ; i ++)
        {
            oc.add(  rand.nextInt(10000) );
        }

        return oc;
    }


}
