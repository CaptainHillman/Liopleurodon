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
package uk.co.thisishillman.object_pool.potions;

/**
 * A type of potion specifically for restoring health.
 * 
 * @author Michael Hillman
 */
public class HealthPotion extends Potion {

    /**
     * Consume the potion
     */
    @Override
    public void drink() {
        System.out.println("Health potion consumed!");
        empty = true;
        System.out.println(this);
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Health potion is currently " + ((empty) ? "empty." : "full.");
    }
    
}
//End of class.