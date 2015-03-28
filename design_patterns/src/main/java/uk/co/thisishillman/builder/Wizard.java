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
 *
 * @author Michael Hillman
 * @version 1.0
 */
public class Wizard {
    
    /**
     * Wizard's name
     */
    private String name;
    
    /**
     * Wizard's race
     */
    private Race race;
    
    /**
     * School of magic
     */
    private Magic magic;
    
    /**
     * Current weapon
     */
    private Weapon weapon;
    
    /**
     * Current armor
     */
    private Armor armor;

    /**
     * @param name the name to set
     */
    protected void setName(String name) {
        this.name = name;
    }

    /**
     * @param race the race to set
     */
    protected void setRace(Race race) {
        this.race = race;
    }

    /**
     * @param magic the magic to set
     */
    protected void setMagic(Magic magic) {
        this.magic = magic;
    }

    /**
     * @param weapon the weapon to set
     */
    protected void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * @param armor the armor to set
     */
    protected void setArmor(Armor armor) {
        this.armor = armor;
    }
    
    /**
     * Builds textual representation of current wizard instance
     * 
     * @return
     */
    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        
        strBuilder.append("Name: ");
        strBuilder.append(name);
        strBuilder.append("\n");
        
        strBuilder.append("Race: ");
        strBuilder.append(race);
        strBuilder.append("\n");
        
        strBuilder.append("School: ");
        strBuilder.append(magic);
        strBuilder.append("\n");
        
        strBuilder.append("Weapon: ");
        strBuilder.append(weapon);
        strBuilder.append("\n");
        
        strBuilder.append("Armor: ");
        strBuilder.append(armor);
        strBuilder.append("\n");
        
        return strBuilder.toString();
    }
    
}
//End of class.