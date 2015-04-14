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
package uk.co.thisishillman.adapter;

/**
 * Client class in the adapter pattern example. Represents a scribe that desires to read a Scroll instance.
 * 
 * @author Michael Hillman
 */
public class Scribe {
    
    /**
     * Scroll currently being read
     */
    private Scroll currentScroll;
    
    /**
     * Set the currently read scroll.
     * 
     * @param newScroll 
     */
    public void setScroll(Scroll newScroll) {
        this.currentScroll = newScroll;
    }
    
    /**
     * Print scroll details to terminal
     */
    public void readScroll() {
        System.out.println("Currently Reading Scroll: ");
        System.out.println(currentScroll.getTitle()); 
        System.out.println("");
    }
    
}
//End of class.