package Models;

import Strategies.Billing_Strategy;

import java.time.LocalDateTime;
import java.util.List;

public class Bill {
    private LocalDateTime Exit_Time;
    private Ticket ticket;
    private Float Bill_Amount;
    private Billing_Status billing_status;
    private List<Payments> payments;
    private Gate Exit_gate;
    private Operator operator;


    private Billing_Strategy billing_strategy;

    public LocalDateTime getExit_Time() {
        return Exit_Time;
    }

    public void setExit_Time(LocalDateTime exit_Time) {
        Exit_Time = exit_Time;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Float getBill_Amount() {
        return Bill_Amount;
    }

    public void setBill_Amount(Float bill_Amount) {
        Bill_Amount = bill_Amount;
    }

    public Billing_Status getBilling_status() {
        return billing_status;
    }

    public void setBilling_status(Billing_Status billing_status) {
        this.billing_status = billing_status;
    }

    public List<Payments> getPayments() {
        return payments;
    }

    public void setPayments(List<Payments> payments) {
        this.payments = payments;
    }

    public Gate getExit_gate() {
        return Exit_gate;
    }

    public void setExit_gate(Gate exit_gate) {
        Exit_gate = exit_gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Billing_Strategy getBilling_strategy() {
        return billing_strategy;
    }

    public void setBilling_strategy(Billing_Strategy billing_strategy) {
        this.billing_strategy = billing_strategy;
    }
}
