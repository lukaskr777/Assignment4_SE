package designpat.bakery;

// decorator when we want the cake to have text
public class TextDecorator extends CakeDecorator{

    String text;

    public TextDecorator(Cake cake, String text){
        super(cake);
        this.text = text;
    }
    
    public String getDescription(){
        return cake.getDescription() + " with saying " + ("'" + text + "'");
    }
    
}
