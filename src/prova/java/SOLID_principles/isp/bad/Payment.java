package prova.java.SOLID_principles.isp.bad;

import java.util.List;

public interface Payment
{
    void initiatePayment();
    String status();
    List<String> getPayments();
    //new features
    void initiateLoanSettlement();
    void initiateRePayment();
}
