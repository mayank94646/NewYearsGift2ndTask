package mavenproject.chocolate;

import java.util.Comparator;

public class chocolateFromPrice implements Comparator<chocolate> {
    @Override
    public int compare(chocolate c1, chocolate c2) {
        if(c1.getPrice() < c2.getPrice())
            return  -1;
        else
            return 1;

    }
}
