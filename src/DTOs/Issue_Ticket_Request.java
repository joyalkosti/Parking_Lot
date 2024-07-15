package DTOs;

import Models.Vehicle_Type;

public class Issue_Ticket_Request {
    private Vehicle_Type vehicle_type;
    private String Vehicle_Number;
    private String Owner;
    private Long gate_Id;
    private Long Parking_lot_Id;

    public Issue_Ticket_Request(Vehicle_Type vehicle_type, String vehicle_Number, String owner, Long gate_Id, Long parking_lot_Id) {
        this.vehicle_type = vehicle_type;
        Vehicle_Number = vehicle_Number;
        Owner = owner;
        this.gate_Id = gate_Id;
        Parking_lot_Id = parking_lot_Id;
    }

    public Vehicle_Type getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(Vehicle_Type vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public String getVehicle_Number() {
        return Vehicle_Number;
    }

    public void setVehicle_Number(String vehicle_Number) {
        Vehicle_Number = vehicle_Number;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public Long getGate_Id() {
        return gate_Id;
    }

    public void setGate_Id(Long gate_Id) {
        this.gate_Id = gate_Id;
    }

    public Long getParking_lot_Id() {
        return Parking_lot_Id;
    }

    public void setParking_lot_Id(Long parking_lot_Id) {
        Parking_lot_Id = parking_lot_Id;
    }
}
