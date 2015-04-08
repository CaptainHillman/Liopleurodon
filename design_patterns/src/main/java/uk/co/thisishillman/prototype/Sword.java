/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.co.thisishillman.prototype;

import uk.co.thisishillman.prototype.Weapon;

/**
 * Simple clonable Sword class with a variable for material 
 * 
 * @author Michael Hillman
 * @version 1.0
 */
public class Sword extends Weapon {

    /**
     * Current material
     */
    private String material;
    
    /**
     * Initialise a new Sword with the default Iron material
     */
    public Sword() {
        this.material = "Iron";
    }
    
    /**
     * Copy constructor 
     * 
     * @param sword instance to copy 
     */
    public Sword(Sword sword) {
        this.material = sword.getMaterial();
    }
    
    /**
     * Return current material
     * 
     * @return 
     */
    public String getMaterial() {
        return material;
    }
    
    /**
     * Set current material
     * 
     * @param material 
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    
    /**
     * Clones the current instance into a new sword which is then returned
     * 
     * @return new sword instance
     */
    @Override
    public Object clone() {
        return new Sword(this);
    }
    
    /**
     * Displayable name
     * 
     * @return 
     */
    @Override
    public String toString() {
        return material + " Sword";
    }
    
}
//End of class.