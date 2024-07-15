package Models;

import Strategies.Billing_Strategy;
import Strategies.Parking_Allotment_Strategy;

import java.util.List;

public class Parking_Lot {


    private List<Parking_Floor> floorList;
    private List<Gate> gateList;
    private Parking_Lot_Status parking_lot_status;
    private Parking_Allotment_Strategy parking_allotment_strategy;
    private Billing_Strategy billing_strategy;

    public List<Parking_Floor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<Parking_Floor> floorList) {
        this.floorList = floorList;
    }

    public List<Gate> getGateList() {
        return gateList;
    }

    public void setGateList(List<Gate> gateList) {
        this.gateList = gateList;
    }

    public Parking_Lot_Status getParking_lot_status() {
        return parking_lot_status;
    }

    public void setParking_lot_status(Parking_Lot_Status parking_lot_status) {
        this.parking_lot_status = parking_lot_status;
    }

    public Parking_Allotment_Strategy getParking_allotment_strategy() {
        return parking_allotment_strategy;
    }

    public void setParking_allotment_strategy(Parking_Allotment_Strategy parking_allotment_strategy) {
        this.parking_allotment_strategy = parking_allotment_strategy;
    }

    public Billing_Strategy getBilling_strategy() {
        return billing_strategy;
    }

    public void setBilling_strategy(Billing_Strategy billing_strategy) {
        this.billing_strategy = billing_strategy;
    }
}
