package AbstractFactoryPattern.IngredientFactory;

import AbstractFactoryPattern.Cheese.Cheese;
import AbstractFactoryPattern.Cheese.ReggianoCheese;
import AbstractFactoryPattern.Dough.Dough;
import AbstractFactoryPattern.Dough.ThinCrustDough;
import AbstractFactoryPattern.Pepperoni.Pepperoni;
import AbstractFactoryPattern.Pepperoni.SlicedPepperoni;
import AbstractFactoryPattern.Sauce.MarinaraSauce;
import AbstractFactoryPattern.Sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

}
