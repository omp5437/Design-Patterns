

public interface PaymentHandler {
    void handle(Payment payment);
    void setNextHandler(PaymentHandler nextHandler);
}
