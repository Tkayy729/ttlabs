package InterfaceSegregationPrinciple.voilates;

import java.util.List;

public interface Payment {
    void initiatePayments();
    Object status();
    List<Object> getPayments();

//additional interfaces added to pollute the interface
    void intiateLoanSettlement();
    void initiateRePayment();
}
