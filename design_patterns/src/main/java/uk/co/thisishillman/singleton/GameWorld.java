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
package uk.co.thisishillman.singleton;

/**
 * Singleton object to handle restricting access to GameWorld instances
 * 
 * @author Michael Hillman
 * @version 1.0
 */
public class GameWorld {
    
    /**
     * Single allowed instance
     */
    private static GameWorld INSTANCE = null;
    
    /**
     * Disallow creation of new objects
     */
    private GameWorld() {
        // Do not allow new instances
    }
    
    /**
     * Return the restricted GameWorld instance
     * 
     * @return 
     */
    public static GameWorld getInstance() {
        if(INSTANCE == null) {
           INSTANCE = new GameWorld(); 
        }
        return INSTANCE;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Single GamneWorld Instance";
    }
    
}
//End of class