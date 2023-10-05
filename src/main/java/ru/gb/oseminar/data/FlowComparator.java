package ru.gb.oseminar.data;

import java.util.Comparator;

public class FlowComparator implements Comparator<Flow> {
    @Override
    public int compare(Flow o1, Flow o2) {
        int resultOfComparing = o1.getNumber().compareTo(o2.getNumber());
        if (resultOfComparing == 0) {
            resultOfComparing = Integer.compare(o1.getGroups().size(), o2.getGroups().size());
            return resultOfComparing;
        } else {
            return resultOfComparing;
        }
    }
}
