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

import java.util.HashMap;
import java.util.Map;

/**
 * Object Pool class containing shared potion instances
 * 
 * @author Michael Hillman
 */
public class PotionMaster {
    
    /**
     * Store of shared potion instances
     */
    private static final Map<String, Potion> POTIONS = new HashMap<>();
    
    /**
     * Initialises pooled potion instances
     */
    static {
        POTIONS.put("Health",  new HealthPotion());
        POTIONS.put("Magic",   new MagicPotion());
        POTIONS.put("Stamina", new StaminaPotion());
    }
    
    /**
     * Withdraw a potion from the object pool
     * 
     * @param name name of potion to remove
     * @return 
     */
    public static Potion getPotion(String name) {
        Potion potion = POTIONS.get(name);
        
        if(potion != null) {
            POTIONS.remove(name);
        }
        
        return potion;
    }

    /**
     * Restore a potion to the object pool (refilling it first)
     * 
     * @param potion 
     */
    public static void returnPotion(Potion potion) {
        potion.refill();
        
        if(potion instanceof HealthPotion) {
            POTIONS.put("Health", potion);
            
        } else if(potion instanceof MagicPotion) {
            POTIONS.put("Magic", potion);
            
        } else if(potion instanceof StaminaPotion) {
            POTIONS.put("Stamina", potion);
        }
    }
    
    /**
     * Print a summary of the object pool
     */
    public static void printSummary() {
        for(Map.Entry<String, Potion> entry : POTIONS.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
    
}
//End of class