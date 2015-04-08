/*
* Copyright (c) Michael Hillman (thisishillman.co.uk)
* 
* This project by Michael Hillman is free software: you can redistribute it and/or modify it under the terms
* of the GNU General Public License as published by the Free Software Foundation, either version 3 of the
* License, or (at your option) any later version. This project is distributed in the hope that it will be 
* useful for educational purposes, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
* or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License along with this project.
* If not, please see the GNU website.
*/
package uk.co.thisishillman.prototype;

/**
 * 
 * 
 * @author Michael Hillman
 * @version 1.0
 */
public class WeaponFactory {
    
    /**
     * Prototype sword
     */
    private final static Weapon PROTO_SWORD;
    
    /**
     * Prototype bow
     */
    private final static Weapon PROTO_BOW;
    
    /**
     * Prototype axes
     */
    private final static Weapon PROTO_AXE;

    /**
     * Static initialiser
     */
    static {
        PROTO_SWORD = new Sword();
        PROTO_BOW   = new Bow();
        PROTO_AXE   = new Axe();
    }
    
    /**
     * Create a new sword
     * 
     * @return 
     */
    public static Weapon createSword() {
        return (Weapon) PROTO_SWORD.clone();
    }
    
    /**
     * Create a new bow
     * 
     * @return 
     */
    public static Weapon createBow() {
        return (Weapon) PROTO_BOW.clone();
    }
    
    /**
     * Create a new axe
     * 
     * @return 
     */
    public static Weapon createAxe() {
        return (Weapon) PROTO_AXE.clone();
    }
    
}
//End of Interface.