package prova.java.structural_patterns.proxy;

public interface BusinessLogic
{
    void process();
}

class BusinessLogicSubject implements BusinessLogic
{
    @Override
    public void process() {

    }
}

class BusinessLogicProxy implements BusinessLogic
{
    private final BusinessLogic real = new BusinessLogicSubject();

    private String user;

    public BusinessLogicProxy(String user) {
        this.user = user;
    }

    @Override
    public void process() {
        // controllo accessi...
        if (user.equals("admin")) {
            real.process();
        }
        else {
            throw new RuntimeException("Invalid user");
        }

    }
}