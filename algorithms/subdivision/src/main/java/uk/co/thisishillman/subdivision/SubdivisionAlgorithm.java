/*
* Liopleurodon Library - Misc projects, modules, and R&D in various languages.
* Copyright (c) Michael Hillman (thisishillman.co.uk)
* 
* This file is part of the larger, Algorithms project. The Algorithms project is 
* free software: you can redistribute it and/or modify it under the terms of the GNU General 
* Public License as published by the Free Software Foundation, either version 3 of the License, 
* or (at your option) any later version. This project is distributed in the hope that 
* it will be useful for educational purposes, but WITHOUT ANY WARRANTY; without even the implied 
* warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License along with the Algorithms project. 
* If not, see the gnu website.
*/
package uk.co.thisishillman.subdivision;

import uk.co.thisishillman.subdivision.geometries.Polyhedron;
import uk.co.thisishillman.subdivision.opengl.DrawingFrame;

/**
 * The interface represents an single instance of a generic subdivision algorithm.
 *
 * @author M Hillman
 * @version 1.0 (30/11/2013).
 */
public interface SubdivisionAlgorithm {

    /**
     * When implemented, this method should set the Polyhedron object for subdivision, specify the DrawingFrame the result
     * should be pushed to & finally start the subdivision procedure.
     *
     * @param polyhedron Polyhedron for subdivision.
     * @param frame DrawingFrame to push resulting Polyhedron to.
     */
    public void subdivide(Polyhedron polyhedron, DrawingFrame frame);

}
