package prova.java.creational_patterns.singleton;

public class SingletonLazySafe
{
    private static SingletonLazySafe instance;

    private SingletonLazySafe() {

    }

    // synchronized per multithread
    public static synchronized SingletonLazySafe getInstance() {
        if(instance == null) {
            instance = new SingletonLazySafe();
        }
        return instance;
    }
}
