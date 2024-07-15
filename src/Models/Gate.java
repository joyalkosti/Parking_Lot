package Models;

public class Gate {
    private int Gate_Number;
    private Gate_Type gateType;
    private Operator operator;

    public Gate_Status getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(Gate_Status gateStatus) {
        this.gateStatus = gateStatus;
    }

    public int getGate_Number() {
        return Gate_Number;
    }

    public void setGate_Number(int gate_Number) {
        Gate_Number = gate_Number;
    }

    public Gate_Type getGateType() {
        return gateType;
    }

    public void setGateType(Gate_Type gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    private Gate_Status gateStatus;

}
