package designpat.bakery;

public abstract class CakeDecorator extends Cake {
    
    protected Cake cake;

    public CakeDecorator(Cake cake){
        this.cake = cake;
    }

    
    

}
