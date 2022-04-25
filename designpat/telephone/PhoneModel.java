package designpat.telephone;

import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();
    private List<Listener> listeners = new ArrayList<>();
    private boolean calling = false;

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyEveryone();
    }

    public boolean isCalling(){
        return this.calling;
    }

    public void call(){
        calling = true;
        notifyEveryone();
        calling = false;
    }

    public List<Integer> getDigits() {
        return digits;
    }

    public void addListener(Listener l){
        listeners.add(l);
    }

    public void notifyEveryone(){
        for(Listener l : listeners){
            l.update(this);
        }
    }
    

}
