package designpat.bakery;

public class MultiLayerDecorator extends CakeDecorator{

    public MultiLayerDecorator(Cake cake){
        super(cake);
    }
    
    public int getCost(){
        return cake.getCost() + 5;
    }
    public String getDescription(){
        return "Multi-layered " + cake.getDescription();
    }
    
}
