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
package uk.co.thisishillman.subdivision.geometries;

/**
 * StraightLine2D - algorithms.utils.geometries Class description does here!
 *
 * @author M Hillman
 * @version 1.0
 */
public class StraightLine2D {

    /**
     * Flags determining line type
     */
    public static final int HORIZONTAL = -1;
    public static final int VERTICAL = 1;

    /**
     * Gradient of the line
     */
    private double gradient;

    /**
     * Y intercept of the line
     */
    private double intercept;

    /**
     * If horizontal or vertical, the absolute x or y value is stored here
     */
    private double absolute;

    /**
     * Flag for line type, 0 is default
     */
    private int lineType;

    /**
     * Creates a StraightLine2D object with the input gradient and Y intercept.
     *
     * @param gradient desired gradient.
     * @param intercept desired Y intercept.
     */
    public StraightLine2D(double gradient, double intercept) {
        this.gradient = gradient;
        this.intercept = intercept;
    }

    /**
     * Create a horizontal or vertical line with the input x or y absolute value.
     *
     * @param absolute absolute x or y value.
     * @param lineType flag determining horizontal (-1) or vertical (1);
     */
    public StraightLine2D(double absolute, int lineType) {
        this.absolute = absolute;
        this.lineType = lineType;
    }

    /**
     * Created a StraightLine2D object that passes through the two input points in 2D space.
     *
     * @param x1 X component of first point.
     * @param y1 Y component of first point.
     * @param x2 X component of second point.
     * @param y2 Y component of second point.
     */
    public StraightLine2D(double x1, double y1, double x2, double y2) {
        double yDiff = y2 - y1;
        double xDiff = x2 - x1;

        if (x1 == x2 && y1 == y2) {
            throw new IllegalArgumentException("Cannot generate a line between two points with the same coords.");
        }

        if (x1 == x2) {
            this.lineType = VERTICAL;
            this.absolute = x1;

        } else if (y1 == y2) {
            this.lineType = HORIZONTAL;
            this.absolute = y1;

        } else {
            this.gradient = yDiff / xDiff;
            this.intercept = (y1 - (gradient * x1));
        }
    }

    /**
     * Parses a standard straight line equation into a StraightLine2D object. Input equation must be in the form 'y = mx +
     * c'.
     *
     * Acceptable equations include: y = x + 0, y = 0.5, x = 2, y = 0.2, y = x, 2y = 3x + 7, 0.5y = 3.25x + 9.3, Y = 5X - 8
     *
     * Unacceptable equations include: 1/2y = x + 9, y = 1/2, x = y y/3 = x^2 + 8/3, y = 3 + x
     *
     * @param equation straight line equation for parsing.
     */
    public StraightLine2D(String equation) throws IllegalArgumentException {
        try {

            equation = equation.replaceAll(" ", "").toLowerCase();
            String lhs = equation.split("=")[0];
            String rhs = equation.split("=")[1];

            if (lhs.contains("x") && !rhs.contains("y")) {
                this.absolute = Double.parseDouble(rhs.split("x")[0].replaceAll("[^0-9.-]", ""));
                this.lineType = VERTICAL;
                return;
            } else if (lhs.contains("y") && !rhs.contains("x")) {
                this.absolute = Double.parseDouble(rhs.split("x")[0].replaceAll("[^0-9.-]", ""));
                this.lineType = HORIZONTAL;
                return;
            }

            if (rhs.length() == 1) {
                this.gradient = 1;
            } else {
                if (rhs.indexOf("x") == 0) {
                    this.gradient = 1;
                } else {
                    String gradientStr = rhs.split("x")[0].replaceAll("[^0-9.-]", "");
                    this.gradient = Double.parseDouble(gradientStr);
                }
            }

            if (rhs.length() == 1 || rhs.indexOf("x") == rhs.length() - 1) {
                this.intercept = 0;
            } else {
                String interceptStr = rhs.split("x")[1].replaceAll("[^0-9.-]", "");
                if (interceptStr.length() == 0) {
                    interceptStr = "1";
                }
                this.intercept = Double.parseDouble(interceptStr);
            }

            if (lhs.replace("y", "").length() > 0) {
                double scalar = Double.parseDouble(lhs.replaceAll("[^0-9.]", ""));
                this.gradient /= scalar;
                this.intercept /= scalar;
            }

        } catch (ArrayIndexOutOfBoundsException | NumberFormatException excep) {
            excep.printStackTrace(System.out);
            throw new IllegalArgumentException("Invalid straight line equation, must be in the standard format of "
                    + "'y = mx + c'");
        }
    }

    /**
     * Return the gradient of this straight line
     *
     * @return line gradient
     */
    public double getGradient() {
        return gradient;
    }

    /**
     * Returns the Y axis intercept of this straight line instance
     *
     * @return
     */
    public double getIntercept() {
        return intercept;
    }

    /**
     * Returns the absolute x or y value of this line (assuming it's either a horizontal or vertical line).
     *
     * @return absolute x or y value.
     */
    public double getAbsolute() {
        return absolute;
    }

    /**
     * Returns the line type for this straight line
     *
     * 0 = gradient line -1 = horizontal line 1 = vertical line
     *
     * @return line type
     */
    public int getLineType() {
        return lineType;
    }

}
//End of class.
