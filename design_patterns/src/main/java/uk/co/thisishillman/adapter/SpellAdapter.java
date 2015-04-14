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
 * Adapter that allows instance of the Tome class to be converted to the Scroll class expected by Scribe instances.
 * 
 * @author Michael Hillman
 */
public class SpellAdapter implements Scroll {

    /** 
     * Adapted tome instance
     */
    private Tome sourceTome;

    /**
     * Overwrite the current adaptee instance
     * 
     * @param tomeTitle
     */
    public void setTome(String tomeTitle) {
        sourceTome = new Tome(tomeTitle);
    }
    
    /**
     * Adapted method used to pull information from the apadtee class
     * 
     * @return 
     */
    @Override
    public String getTitle() {
        return sourceTome.getTomeTitle();
    }
    
}
//End of class.