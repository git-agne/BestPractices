package prova.java.structural_patterns.proxy;

public class Main
{
    public static void main(String[] args) {
        BusinessLogic proxy = new BusinessLogicProxy("admin");
        foo(proxy);

    }

    public static void foo(BusinessLogic bl)
    {
        bl.process();
    }
}
