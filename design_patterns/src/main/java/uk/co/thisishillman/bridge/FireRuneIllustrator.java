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
package uk.co.thisishillman.bridge;

/**
 * Concrete bridge implementer class, implementing the Illustrator interface.
 * 
 * @author Michael Hillman
 * @version 1.0
 */
public class FireRuneIllustrator implements Illustrator {

    /**
     * Draw the fire rune at the input size on the input page
     * 
     * @param size size of rune to draw
     * @param page which page is the rune being drawn on
     */
    @Override
    public void drawRune(String size, int page) {
        System.out.println("Drawing a " + size + " Fire Rune on page " + page + ".");
    }
    
}
//End of class