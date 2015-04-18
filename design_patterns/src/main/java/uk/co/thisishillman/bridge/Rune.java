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
 * Concrete class implementing the Symbol interface
 * 
 * @author Michael Hillman
 * @version 1.0
 */
public class Rune extends Symbol {

    /** 
     * Size of rune to draw
     */
    private final String size;
    
    /**
     * Page to draw rune on
     */
    private final int page;
    
    /**
     * Initialise new Rune instance
     * 
     * @param illusImp Rune drawing implementation
     * @param size Size of rune to draw
     * @param page Page to draw rune on
     */
    public Rune(String size, int page, Illustrator illusImp) {
        super(illusImp);
        this.size = size;
        this.page = page;
    }
    
    /**
     * Uses the current implementation to draw a Rune
     */
    @Override
    public void draw() {
        illusImp.drawRune(size, page);
    }
    
}
//End of class