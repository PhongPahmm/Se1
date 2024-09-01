package ex1;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMinIntList extends ArrayList<Integer> {
    public Integer min(){
        return Collections.min(this);
    }
    public Integer max(){
        return Collections.max(this);
    }

    public static void main(String[] args) {
        MaxMinIntList list = new MaxMinIntList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("List: "+ list);
        System.out.println("min: " + list.min());
        System.out.println("max: " + list.max());
    }
}
