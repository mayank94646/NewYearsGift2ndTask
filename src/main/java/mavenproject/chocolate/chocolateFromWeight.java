package mavenproject.chocolate;

import java.util.Comparator;

public class chocolateFromWeight implements Comparator<chocolate> {
    @Override
    public int compare(chocolate c1, chocolate c2) {
        if(c1.getWeight() < c2.getWeight())
            return  -1;
        else
            return 1;

    }
}

