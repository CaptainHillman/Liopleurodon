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
package uk.co.thisishillman.factory_method;

/**
 * Elvish clothing class
 * 
 * @author Michael Hillman
 * @version 1.0
 */
public class ElvishClothing implements Clothing {
    
    /**
     * Current clothing type
     */
    private final ClothingType type;
    
    /**
     * Initialises a new Elvish Clothing instance with the input clothing type
     * 
     * @param type ClothingType
     */
    protected ElvishClothing(ClothingType type) {
       this.type = type; 
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
       return "ELVISH " + type.toString(); 
    }
    
}
//End of class