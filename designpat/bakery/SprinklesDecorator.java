package designpat.bakery;

public class SprinklesDecorator extends CakeDecorator{

    public SprinklesDecorator(Cake cake){
        super(cake);
    }
    
    public int getCost(){
        return cake.getCost() + 2;
    }
    public String getDescription(){
        return cake.getDescription() + " with sprinkles";
    }
    
}
