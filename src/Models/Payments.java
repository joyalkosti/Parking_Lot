package Models;

import java.time.LocalDateTime;

public class Payments {
    private Payment_Mode payment_mode;
    private Float Amount;
    private int Ref_Number;
    private LocalDateTime dateTime;
    private Payments_Status paymentsStatus;

    public Payment_Mode getPayment_mode() {
        return payment_mode;
    }

    public void setPayment_mode(Payment_Mode payment_mode) {
        this.payment_mode = payment_mode;
    }

    public Float getAmount() {
        return Amount;
    }

    public void setAmount(Float amount) {
        Amount = amount;
    }

    public int getRef_Number() {
        return Ref_Number;
    }

    public void setRef_Number(int ref_Number) {
        Ref_Number = ref_Number;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Payments_Status getPaymentsStatus() {
        return paymentsStatus;
    }

    public void setPaymentsStatus(Payments_Status paymentsStatus) {
        this.paymentsStatus = paymentsStatus;
    }
}
