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
 * Interface for the factory method pattern
 * 
 * @author Michael Hillman
 * @version 1.0
 */
public interface Tailor {
    
    /**
     * Makes (then returns) a new Clothing instance
     * 
     * @param type type of clothing enum
     * @return new clothing
     */
    public Clothing makeClothes(ClothingType type);
    
}
//End of interface