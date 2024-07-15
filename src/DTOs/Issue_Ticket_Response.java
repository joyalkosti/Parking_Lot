package DTOs;

import Models.Ticket;

public class Issue_Ticket_Response {
    private Ticket ticket;
    private Response_Status response_status;
    private String Message;

    public Issue_Ticket_Response(Ticket ticket, Response_Status response_status, String message) {
        this.ticket = ticket;
        this.response_status = response_status;
        Message = message;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Response_Status getResponse_status() {
        return response_status;
    }

    public void setResponse_status(Response_Status response_status) {
        this.response_status = response_status;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
