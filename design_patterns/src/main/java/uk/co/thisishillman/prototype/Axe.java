/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.thisishillman.prototype;

import uk.co.thisishillman.prototype.Weapon;

/**
 * Simple clonable Axe class with a variable for number of bits (axe heads)
 * 
 * @author Michael Hillman
 * @version 1.0
 */
public class Axe extends Weapon {

    /**
     * Current bits
     */
    private String bits;
    
    /**
     * Initialise a new Axe with the default single bitted type
     */
    public Axe() {
        this.bits = "Single";
    }
    
    /**
     * Copy constructor 
     * 
     * @param axe instance to copy 
     */
    public Axe(Axe axe) {
        this.bits = axe.getBits();
    }
    
    /**
     * Return current bits
     * 
     * @return 
     */
    public String getBits() {
        return bits;
    }
    
    /**
     * Set current bits
     * 
     * @param bits 
     */
    public void setBits(String bits) {
        this.bits = bits;
    }
    
    /**
     * Clones the current instance into a new Axe which is then returned
     * 
     * @return new Axe instance
     */
    @Override
    public Object clone() {
        return new Axe(this);
    }
    
    /**
     * Displayable name
     * 
     * @return 
     */
    @Override
    public String toString() {
        return bits + " Bitted Axe";
    }
    
}
//End of class.