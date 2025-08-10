package AbstractFactoryPattern;

import AbstractFactoryPattern.IngredientFactory.NYPizzaIngredientFactory;
import AbstractFactoryPattern.IngredientFactory.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String pizzaType) {
        Pizza pizza=null;
        PizzaIngredientFactory pizzaIngredientFactory=new NYPizzaIngredientFactory();

        if (pizzaType.equals("cheese")){
            pizza=new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese pizza");
        }
        else if(pizzaType.equals("clam")){
            pizza=new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New york style clam pizza");
        }
        else if(pizzaType.equals("mushroom")){
            pizza=new MushroomPizza(pizzaIngredientFactory);
            pizza.setName("New york style mushroom pizza");
        }
        return pizza;
    }

}
