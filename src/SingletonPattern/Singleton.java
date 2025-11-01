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

public class Main {
    public static void main(String[] args) {
        Singleton s=Singleton.getInstance();
        Singleton s1=Singleton.getInstance();
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s==s1);
    }
}
