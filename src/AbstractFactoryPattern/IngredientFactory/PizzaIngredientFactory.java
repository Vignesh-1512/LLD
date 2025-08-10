package AbstractFactoryPattern.IngredientFactory;

import AbstractFactoryPattern.Cheese.Cheese;
import AbstractFactoryPattern.Dough.Dough;
import AbstractFactoryPattern.Pepperoni.Pepperoni;
import AbstractFactoryPattern.Sauce.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Pepperoni createPepperoni();
}
