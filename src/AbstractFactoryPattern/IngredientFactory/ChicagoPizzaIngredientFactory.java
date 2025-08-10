package AbstractFactoryPattern.IngredientFactory;

import AbstractFactoryPattern.Cheese.Cheese;
import AbstractFactoryPattern.Cheese.MozzarellaCheese;
import AbstractFactoryPattern.Dough.Dough;
import AbstractFactoryPattern.Dough.ThickCrustDough;
import AbstractFactoryPattern.Pepperoni.Pepperoni;
import AbstractFactoryPattern.Pepperoni.SlicedPepperoni;
import AbstractFactoryPattern.Sauce.PlumTomatoSauce;
import AbstractFactoryPattern.Sauce.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

}
