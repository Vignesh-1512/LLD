package AbstractFactoryPattern;

import AbstractFactoryPattern.Cheese.Cheese;
import AbstractFactoryPattern.Dough.Dough;
import AbstractFactoryPattern.Pepperoni.Pepperoni;
import AbstractFactoryPattern.Sauce.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;

    abstract void prepare();

    void bake(){
        System.out.println("Bake for 15 mins");
    }

    void cut(){
        System.out.println("Cutting Pizza into diagonal slides");
    }

    void pack(){
        System.out.println("Pizza is ready !! Packing it...!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
