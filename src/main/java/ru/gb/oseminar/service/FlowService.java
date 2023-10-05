package ru.gb.oseminar.service;

import ru.gb.oseminar.data.*;

import java.util.*;

public class FlowService {
    private final Map<String, Flow> flowMap;

    public FlowService() {
        this.flowMap = new HashMap<>();
    }

    public Collection<Flow> getAll(){
        return this.flowMap.values();
    }

    public void addFlow(String number, List<StudentGroup> groups) {
        if (!flowMap.containsKey(number))
            flowMap.put(number, new Flow(number, groups));
    }

    public List<Flow> getSortedFlows(){
        List<Flow> flows = new ArrayList<>(flowMap.values());
        flows.sort(new FlowComparator());
        return flows;
    }

    public List<StudentGroup> getStudentGroups(String flowNumber) {
        var flow = flowMap.values().stream().filter(f -> Objects.equals(f.getNumber(), flowNumber)).findFirst();
        if (flow.isPresent())
            return flow.get().getGroups();

        return new ArrayList<>();
    }
}
