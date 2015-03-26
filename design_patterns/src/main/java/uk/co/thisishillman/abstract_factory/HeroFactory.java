/**
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
package uk.co.thisishillman.abstract_factory;

/**
 * Interface representing a hero factory producing heroes of unknown race
 * 
 * @author Michael Hillman
 * @version 1.0
 */
public interface HeroFactory {
    
    /**
     * Create a new Warrior Hero
     * 
     * @return newly created warrior Hero
     */
    public Hero createWarrior();
    
    /**
     * Create a new Archer Hero
     * 
     * @return newly created archer Hero
     */
    public Hero createArcher();
    
    /**
     * Create a new Wizard Hero
     * 
     * @return newly created wizard Hero
     */
    public Hero createWizard();
    
}
//End of interface