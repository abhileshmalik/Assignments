package assignment1.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class q1 {

    public static void main(String[] args) {

        float sum = 0.0f;
        List<Float>  li = new ArrayList<Float>();
        Iterator<Float> itr = null;
        li.add(1.1f);
        li.add(2.1f);
        li.add(3.3f);
        li.add(4.4f);
        li.add(6.6f);
        itr = li.listIterator();
        while(itr.hasNext()){
           // System.out.println(itr.next());
            sum = sum + itr.next();
        }

        System.out.println("Sum of List = "+sum);
    }

}
