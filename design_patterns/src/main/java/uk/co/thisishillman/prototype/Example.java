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
 * Example usage of the Prototype design pattern.
 * 
 * @author Michael Hillman
 * @version 1.0
 */
public class Example {
    
    /**
     * Run Prototype example
     * 
     * @param args command line arguments 
     */
    public static void main(String[] args) {
        Weapon sword = WeaponFactory.createSword();
        Weapon bow = WeaponFactory.createBow();
        Weapon axe = WeaponFactory.createAxe();
        
        System.out.println(sword.toString());
        System.out.println(bow.toString());
        System.out.println(axe.toString());
    }
    
}
//End of class