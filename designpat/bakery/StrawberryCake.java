package designpat.bakery;

public class StrawberryCake extends Cake {


    @Override
    public int getCost(){
        return getCost()*2;
    }

    @Override
    public String getDescription() {
        
        return "Strawberry Cake";
    }
    
    
}
