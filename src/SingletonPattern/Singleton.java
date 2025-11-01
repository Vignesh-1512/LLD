package SingletonPattern;

//Eager initialization (simplest)

//Creates the instance at class load time.

public class Singleton {
    private static Singleton instance;

    private Singleton() { /* private to prevent external instantiation */ }

    public static EagerSingleton getInstance() {
        if(instance==null{
            instance=new Singleton();  
        }
        return instance;
    }
}

