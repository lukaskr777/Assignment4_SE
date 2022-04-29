package designpat.bakery;


// decorator when we want the cake to be multilayered
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
