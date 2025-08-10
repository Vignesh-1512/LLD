package FactoryPattern;

public class PizzaStore {
    Pizza orderPizze(String pizzaType){
        Pizza pizza=null;

        if (pizzaType.equals("cheese")){
            pizza=new CheesePizza();
        }
        else if(pizzaType.equals("greek")){
            pizza=new GreekPizza();
        }
        else {
            throw new IllegalArgumentException("Unknown Pizze Type :"+pizzaType);
        }
        pizza.prepare();;
        pizza.bake();
        pizza.cut();
        pizza.pack();

        return pizza;
    }
    public static void main(String[] args) {
            PizzaStore pizza1=new PizzaStore();
            pizza1.orderPizze("cheese");

        PizzaStore pizza2=new PizzaStore();
        pizza2.orderPizze("greek");
        }
    }
