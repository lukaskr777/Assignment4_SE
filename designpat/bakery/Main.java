package designpat.bakery;

/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();

        order.addCake(new TextDecorator(new VanillaCake(),"PLAIN"));
        order.addCake(new TextDecorator(new SprinklesDecorator(new VanillaCake()),"FANCY"));
        order.addCake(new TextDecorator(new TextDecorator(new MultiLayerDecorator(new SprinklesDecorator(new SprinklesDecorator(new StrawberryCake()))),"One of"),"EVERYTHING"));

        // Print the order
        order.printOrder();
    }
}
