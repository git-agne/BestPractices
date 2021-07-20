package prova.java.SOLID_principles.isp.bad;

import java.util.List;

public class BankPayment implements Payment
{
    @Override
    public void initiatePayment() {

    }

    @Override
    public String status() {
        return null;
    }

    @Override
    public List<String> getPayments() {
        return null;
    }

    @Override
    public void initiateLoanSettlement() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void initiateRePayment() {
        throw new UnsupportedOperationException();
    }
}
