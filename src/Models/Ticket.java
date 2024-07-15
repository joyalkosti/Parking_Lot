package Models;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Ticket {
    private String Number;
    private Date Entry_Time;
    private Vehicle vehicle;
    private Parking_SLot parking_sLot;
    private Gate gate;
    private Operator operator;

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public Date getEntry_Time() {
        return Entry_Time;
    }

    public void setEntry_Time(Date entry_Time) {
        Entry_Time = entry_Time;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Parking_SLot getParking_sLot() {
        return parking_sLot;
    }

    public void setParking_sLot(Parking_SLot parking_sLot) {
        this.parking_sLot = parking_sLot;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
