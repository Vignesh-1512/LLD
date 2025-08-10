package AbstractFactoryPattern;

import AbstractFactoryPattern.IngredientFactory.PizzaIngredientFactory;

public class MushroomPizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;
    public MushroomPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;

    }
    @Override
    void prepare() {

        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        pepperoni = pizzaIngredientFactory.createPepperoni();

    }
}
