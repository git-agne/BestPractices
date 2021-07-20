package prova.java.creational_patterns.singleton;

public enum SingletonEnum
{
    //Istanza statica di tipo SingletonEnum
    INSTANCE;

    private static int xyz = 0;

    public void cose() {
        System.out.println("Faccio cose " + xyz++);
    }

    public static void main(String[] args) {
        SingletonEnum.INSTANCE.cose();
        SingletonEnum.INSTANCE.cose();
        //xyz aumenta perchè è un singleton
        //Enum implicitamente statici
    }
}
