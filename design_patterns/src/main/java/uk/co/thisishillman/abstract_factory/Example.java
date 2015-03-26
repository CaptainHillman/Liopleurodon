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

import uk.co.thisishillman.abstract_factory.elf.ElfHeroFactory;
import uk.co.thisishillman.abstract_factory.orc.OrcHeroFactory;

/**
 * Example usage of the Abstract Factory design pattern implemented in this package.
 * 
 * @author Michael Hillman
 * @version 1.0
 */
public class Example {
    
    /**
     * Run Abstract Factory example
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
       Example.spawnHeroes(new ElfHeroFactory());
       Example.spawnHeroes(new OrcHeroFactory());
    }

    /**
     * Creates a new hero of each type from the input factory and runs each
     * hero's battle cry.
     * 
     * @param factory HeroFactory used to generate heroes
     */
    private static void spawnHeroes(HeroFactory factory) {
        Hero warrior = factory.createWarrior();
        Hero archer = factory.createArcher();
        Hero wizard = factory.createWizard();
        
        warrior.battleCry();
        archer.battleCry();
        wizard.battleCry();
    }
    
}
//End of class