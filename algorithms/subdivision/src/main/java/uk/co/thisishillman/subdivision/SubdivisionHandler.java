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

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import uk.co.thisishillman.subdivision.geometries.PolyhedronFactory;
import uk.co.thisishillman.subdivision.opengl.DrawingFrame;

/**
 * This class represents a <code>KeyListener</code> used to detect specific key presses on an Swing JFrame and run differing
 * subdivision algorithms depending on said key press codes.
 *
 * @author M Hillman
 * @version 1.0 (25/11/2013)
 */
public class SubdivisionHandler implements KeyListener {

    /**
     * DrawingFrame used to draw OpenGL objects.
     */
    private DrawingFrame frame;

    /**
     * Subdivision Algorithm to use for this instance.
     */
    private SubdivisionAlgorithm algorithm;

    /**
     * Initialises & stores a class variable containing the DrawingFrame.
     *
     * @param frame DrawingFrame used to show OpenGl Objects.
     * @param algorithm SubdivisionAlgorithm for use.
     */
    public SubdivisionHandler(DrawingFrame frame, SubdivisionAlgorithm algorithm) {
        this.frame = frame;
        this.algorithm = algorithm;
    }

    /**
     * Detects key presses & runs the relevant subdivision algorithm, passing the resulting Polyhedron back to the
     * DrawingFrame. Current key codes are:
     *
     * 1: Reset to Triangular-faced Unit Cube. 2: Reset to Square-faced Unit Cube. ENTER: Subdivide. ESCAPE: Kill program. D:
     * Toggle on-screen debug message.
     *
     * @param e KeyEvent fired when user presses key.
     */
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_1:
                frame.clearPolyhedrons();
                frame.addPolyhedron(PolyhedronFactory.getTriangleUnitCube());
                frame.drawString("");
                break;

            case KeyEvent.VK_2:
                frame.clearPolyhedrons();
                frame.addPolyhedron(PolyhedronFactory.getSquareUnitCube());
                frame.drawString("");
                break;

            case KeyEvent.VK_D:
                frame.toggleDebug();
                break;

            case KeyEvent.VK_ENTER:
                algorithm.subdivide(frame.getLastPolyhedron(), frame);
                break;

            case KeyEvent.VK_ESCAPE:
                System.exit(0);
                break;

            default:
                //Nothing!
                break;
        }
    }

    /**
     * Detects key types from the user. Currently unused.
     *
     * @param e KeyEvent fired when user types key.
     */
    @Override
    public void keyTyped(KeyEvent e) {
        //Unused!
    }

    /**
     * Detects key releases from the user. Currently unused.
     *
     * @param e KeyEvent fired when user releases key.
     */
    @Override
    public void keyReleased(KeyEvent e) {
        //Unused!
    }

}
//End of class.
