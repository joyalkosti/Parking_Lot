package Controllers;

import DTOs.Issue_Ticket_Request;
import DTOs.Issue_Ticket_Response;
import DTOs.Response_Status;
import Models.Ticket;
import Services.Ticket_Service;

public class Ticket_Controller {
    public static String TICKET_ISSUED_MESSAGE = "Ticket issued";


    private Ticket_Service ticket_service;

    public Issue_Ticket_Response issue_ticket_response(Issue_Ticket_Request issue_ticket_request){
        Ticket ticket=ticket_service.Issue_Ticket(ticket_service);

        // Generate the ticket response
        String ticket_Issueded_Message = "Ticket issued";
        return new Issue_Ticket_Response(ticket, Response_Status.SUCCESS, TICKET_ISSUED_MESSAGE);
    }
}
