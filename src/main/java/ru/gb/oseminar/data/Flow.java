package ru.gb.oseminar.data;

import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<StudentGroup>{
    private List<StudentGroup> groups;

    private String number;

    public Flow(String number, List<StudentGroup> groups) {
        this.groups = groups;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Flow{" +
               "students=" + groups +
               '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return groups.iterator();
    }
}
