package AbstractFactoryPattern;

import AbstractFactoryPattern.IngredientFactory.ChicagoPizzaIngredientFactory;
import AbstractFactoryPattern.IngredientFactory.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (pizzaType.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }
        else if (pizzaType.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }
        else if (pizzaType.equals("mushroom")){
            pizza = new MushroomPizza(ingredientFactory);
            pizza.setName("Chicago Style Mushroom Pizza.");
        }
        return pizza;
    }
}
