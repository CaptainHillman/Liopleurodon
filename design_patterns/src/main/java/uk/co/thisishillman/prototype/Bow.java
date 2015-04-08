/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.thisishillman.prototype;

import uk.co.thisishillman.prototype.Weapon;

/**
 * Simple clonable Bow class with a variable for type 
 * 
 * @author Michael Hillman
 * @version 1.0
 */
public class Bow extends Weapon {

    /**
     * Current type
     */
    private String type;
    
    /**
     * Initialise a new Bow with the default Short type
     */
    public Bow() {
        this.type = "Short";
    }
    
    /**
     * Copy constructor 
     * 
     * @param bow instance to copy 
     */
    public Bow(Bow bow) {
        this.type = bow.getType();
    }
    
    /**
     * Return current type
     * 
     * @return 
     */
    public String getType() {
        return type;
    }
    
    /**
     * Set current type
     * 
     * @param type 
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Clones the current instance into a new Bow which is then returned
     * 
     * @return new Bow instance
     */
    @Override
    public Object clone() {
        return new Bow(this);
    }
    
    /**
     * Displayable name
     * 
     * @return 
     */
    @Override
    public String toString() {
        return type + " Bow";
    }
    
}
//End of class.