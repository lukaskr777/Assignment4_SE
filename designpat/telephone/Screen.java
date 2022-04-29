package designpat.telephone;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 * System.out.println("hello");
 */
public class Screen {
    private final PhoneModel model;


    // interface for a custom Listener
    public interface Listener {

        public void update(PhoneModel model);    
    }

    // listener that, when notifies, print a now added digit
    static class DigitListener implements Listener{

        Screen screen;

        public DigitListener(Screen s){
            this.screen = s;
        }

        public void update(PhoneModel model){
            if(model.isCalling()) return;

            Integer digit = model.getDigits().get(model.getDigits().size() - 1);

            screen.print("Pressing: " + digit);
        }
    }

    // listener, when notified, prints who we are calling, IF we are calling
    static class DialListener implements Listener{  
        
        Screen screen;

        public DialListener(Screen s){
            this.screen = s;
        }

        public void update(PhoneModel model){
            if(!model.isCalling()) return;
            
            String number = "";
            for(Integer d : model.getDigits()){
                number += d;
            }    
            screen.print("Now dialing: " + number);
        }
    }

    public Screen(PhoneModel model) {
        this.model = model;
    }
    public void print(String info){
        System.out.println(info);
    }
}
