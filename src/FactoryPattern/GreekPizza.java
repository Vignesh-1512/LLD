package FactoryPattern;

public class GreekPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Greek pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Greek pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Greek pizza");
    }

    @Override
    public void pack() {
        System.out.println("Packing Greek Pizza... ready to deliver");
    }
}
