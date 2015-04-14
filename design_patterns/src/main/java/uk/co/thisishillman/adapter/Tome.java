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
 * Adaptee class that could be used elsewhere in the project, but needs to be adapted into a scroll for use by the 
 * scribe instance.
 * 
 * @author Michael Hillman
 */
public class Tome {
   
    /**
     * Tome title
     */
    private final String title;
    
    /**
     * Initialise a new Tome with the input title.
     * @param title 
     */
    public Tome(String title) {
        this.title = title;
    }
    
    /**
     * Returns title content of tome
     * 
     * @return 
     */
    public String getTomeTitle() {
        return title;
    }
    
}
//End of class.