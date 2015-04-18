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
 * Example usage of the Bridge design pattern. This example uses the concept of drawing different types of runes
 * to illustrate the bridge design pattern.
 * 
 * @author Michael Hillman
 */
public class Example {
    
    /**
     * Run Bridge example
     * 
     * @param args command line arguments 
     */
    public static void main(String[] args) {
        Symbol largeFireRune = new Rune("large", 10, new FireRuneIllustrator());
        Symbol smallIceRune  = new Rune("small", 20, new IceRuneIllustrator());
        
        largeFireRune.draw();
        smallIceRune.draw();
    }
    
}
//End of class