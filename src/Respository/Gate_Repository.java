package Respository;

import Models.Gate;

import java.util.HashMap;
import java.util.Map;
import Exception.GateNtFoundException;

public class Gate_Repository {
    Map<Long, Gate> gateMap=new HashMap<>();


    public Gate Find_gate_By_Id(Long gate_Id) throws GateNtFoundException {
        if(gateMap.containsKey(gate_Id)){
            return gateMap.get(gate_Id);
        }
        throw new GateNtFoundException();

//        return null;
    }
}
