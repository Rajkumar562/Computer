package Abstraction;
public abstract class Car
{
    public abstract void accelerate();
    public abstract void brake();
    public void honk()
    {
        System.out.println("Car is honking");
    }
}