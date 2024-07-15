package Models;

public class Parking_SLot {

    private Vehicle_Type vehicleType;
    private Parking_Floor parkingFloor;
    private Parking_Status parkingStatus;
    private int Number;


    public Vehicle_Type getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicle_Type vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Parking_Floor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(Parking_Floor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public Parking_Status getParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(Parking_Status parkingStatus) {
        this.parkingStatus = parkingStatus;
    }


    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }
}
