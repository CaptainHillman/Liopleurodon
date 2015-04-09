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
package uk.co.thisishillman.factory;

/**
 * Example usage of the Factory design pattern.
 * 
 * @author Michael Hillman
 * @version 1.0
 */
public class BlackSmith {

    /**
     * Run Factory example
     * 
     * @param args command line arguments 
     */
    public static void main(String[] args) {
        BlackSmith smith = new BlackSmith();
        smith.makeGold();
    }
    
    /**
     * Creates new instances via a factory
     */
    public void makeGold() {
        Gold g1 = GoldFactory.smeltHumanGold();
        Gold g2 = GoldFactory.smeltElvishGold();
        
        System.out.println(g1);
        System.out.println(g2);
    }
    
}
//End of class