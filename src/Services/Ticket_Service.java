package Services;

import Models.Ticket;
import Respository.Gate_Repository;

import java.util.Date;

public class Ticket_Service {
    private Gate_Repository gate_repository;

    public Ticket Issue_Ticket(Ticket_Service issue_ticket_request) {

        // 1. Set entry time
        Ticket ticket=new Ticket();
        ticket.setEntry_Time(new Date());

        // Get gate details
        gate_repository.Find_gate_By_Id(issue_ticket_request.getGateId());

        return null;

    }
}
