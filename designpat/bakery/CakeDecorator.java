package designpat.bakery;

// General Cake Decorator, a custom one will implement this (abstract) class
public abstract class CakeDecorator extends Cake {
    
    protected Cake cake;

    public CakeDecorator(Cake cake){
        this.cake = cake;
    }

    
    

}
