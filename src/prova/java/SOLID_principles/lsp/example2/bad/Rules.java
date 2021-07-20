package prova.java.SOLID_principles.lsp.example2.bad;

public class Rules {
    public static void main(String[] args) {
        testLsp(new A());
        testLsp(new B());
    }

    public static void testLsp(A a) {
        Number n = a.getNumber();

        try {
            a.signature();
        }
        catch (MyException e) {

        }
        a.test();
        // Si rompe il codice perchè x = 0 e non può dividere

        a.preconditions(50);

        int j = 42 / a.postconditions();
    }
}

class MyException extends Exception {

}

class A {
    protected int x = 0;

    public A() {
        x = 1;
    }

    public Number getNumber() {
        return 42.0;
    }

    public void signature() throws MyException {
        throw new MyException();
    }

    public void test() {
        int j = 42 / x;
    }

    public void preconditions(int k) {
        if(k < 0) {
            throw new IllegalArgumentException();
        }
    }

    public int postconditions() {
        return 1; // > 0
    }
}

class B extends A {
    public B() {
        this.x = 0;
    }

    @Override
    public Integer getNumber() {
        return 42;
    }

    // Posso togliere l'eccezione
    @Override
    public void signature() {

    }

    @Override
    public void preconditions(int k) {

    }

    @Override
    public int postconditions() {
        return 2;
    }
}
