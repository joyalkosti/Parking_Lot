package Models;

import java.util.List;

public class Parking_Floor {
    private int Floor_Number;
    private List<Parking_SLot> parkingSLots;

    public List<Parking_SLot> getParkingSLots() {
        return parkingSLots;
    }

    public void setParkingSLots(List<Parking_SLot> parkingSLots) {
        this.parkingSLots = parkingSLots;
    }

    public int getFloor_Number() {
        return Floor_Number;
    }

    public void setFloor_Number(int floor_Number) {
        Floor_Number = floor_Number;
    }
}
