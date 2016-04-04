/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keygamep3;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Ruben
 */
public class Barricade extends SpelElement {

    private int pincode;
    private Speler speler;
    private ImageIcon afbeelding;

    public Barricade(int pincode) {
        
        this.pincode = pincode;


    }
    
    public Speler getPincode() {
        return speler;
    }
    
    @Override
    public ImageIcon getAfbeelding() {
        
        this.afbeelding = new ImageIcon("Plaatjes/doors.png");
        return afbeelding;
    }

    /**
     *
     * @param pincode
     * @return
     */
    @Override
    public boolean isToegankelijk(int pincode) {
        
        if (pincode == speler.getSleutel()) {
            return true;
        } else {
            return false;
        }
    }
}
