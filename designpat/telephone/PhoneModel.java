package designpat.telephone;

import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();

    // all the observers
    private List<Screen.Listener> listeners = new ArrayList<>();
    private boolean calling = false;

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyEveryone();
    }

    // check if we are calling
    public boolean isCalling(){
        return this.calling;
    }

    // pretend that we are calling
    public void call(){
        calling = true;
        notifyEveryone();
        calling = false;
    }

    public List<Integer> getDigits() {
        return digits;
    }

    // add a new listener
    public void addListener(Screen.Listener l){
        listeners.add(l);
    }

    // notifies all listeners
    public void notifyEveryone(){
        for(Screen.Listener l : listeners){
            l.update(this);
        }
    }
    

}
