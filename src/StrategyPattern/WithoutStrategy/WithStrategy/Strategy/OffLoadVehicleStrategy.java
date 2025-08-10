package StrategyPattern.WithoutStrategy.WithStrategy.Strategy;

public class OffLoadVehicleStrategy implements DriveStrategyInterface{
    @Override
    public void drive() {
        System.out.println("OffLoad Drive Capability");
    }
}
