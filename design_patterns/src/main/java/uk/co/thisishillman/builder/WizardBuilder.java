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
package uk.co.thisishillman.builder;

/**
 * Core builder class used to illustrate the Builder design pattern, builds different 
 * wizards of set configurations.
 * 
 * @author Michael Hillman
 * @version 1.0
 */
public class WizardBuilder {
    
    /**
     * Creates a human healer type wizard
     * 
     * @return 
     */
    public Wizard buildHumanHealer() {
        Wizard wizard = new Wizard();
        wizard.setName("DAVE");
        
        wizard.setRace(Race.HUMAN);
        wizard.setMagic(Magic.HEALING);
        wizard.setWeapon(Weapon.WAND);
        wizard.setArmor(Armor.ROBES);
        return wizard;
    }
    
    /**
     * Creates an orcish warlock type wizard
     * @return 
     */
    public Wizard buildOrcishWarlock() {
        Wizard wizard = new Wizard();
        wizard.setName("BIFF");
        
        wizard.setRace(Race.ORC);
        wizard.setMagic(Magic.DESTRUCTIVE);
        wizard.setWeapon(Weapon.STAFF);
        wizard.setArmor(Armor.PLATE);
        return wizard;
    }
    
    /**
     * Creates an elvish illusionist wizard
     * 
     * @return 
     */
    public Wizard buildElvishIllusionist() {
        Wizard wizard = new Wizard();
        wizard.setName("FLIP");
        
        wizard.setRace(Race.ELF);
        wizard.setMagic(Magic.ILLUSION);
        wizard.setWeapon(Weapon.GLOVES);
        wizard.setArmor(Armor.LEATHER);
        return wizard;
    }
    
}
//End of class