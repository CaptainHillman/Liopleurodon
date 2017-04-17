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
 * A 3 dimensional vector that is represented by double-precision floating point x,y,z coordinates.
 *
 * @author M Hillman
 * @version 1.0
 */
public class Vector3D {

    /**
     * X, Y, Z coordinates for this vector
     */
    private double x, y, z;

    /**
     * Initialises a new 3 dimensional vector with no directional components
     */
    public Vector3D() {
        this(0.0f, 0.0f, 0.0f);
    }

    /**
     * Initialises a new 3 dimensional vector with the input directional components
     *
     * @param x desired X component.
     * @param y desired Y component.
     * @param z desired Z component.
     */
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Returns the X component for this vector.
     *
     * @return X component.
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the X component for this vector.
     *
     * @param x desired X component.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Returns the Y component for this vector.
     *
     * @return Y component.
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the Y component for this vector.
     *
     * @param y desired Y component.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Returns the Z component for this vector.
     *
     * @return Z component.
     */
    public double getZ() {
        return z;
    }

    /**
     * Sets the Z component for this vector.
     *
     * @param z desired Z component.
     */
    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Calculates and returns the angle (in degrees) between this vector instance and the input vector object.
     *
     * @param vector vector object to calculate angle between.
     * @return resulting angle in degrees.
     */
    public double angle(Vector3D vector) {
        double thisMagnitude = this.magnitude();
        double thatMagnitude = vector.magnitude();

        double numerator = (getX() * vector.getX()) + (getY() * vector.getY()) + (getZ() * vector.getZ());
        double denominator = thisMagnitude * thatMagnitude;

        if (denominator == 0) {
            return 0.0;
        }
        return Math.toDegrees(Math.acos(numerator / denominator));
    }

    /**
     * Returns the magnitude of this Vector3D instance.
     *
     * @return magnitude
     */
    public double magnitude() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    /**
     * Return the resulting vector when this vector is added to the input vector.
     *
     * @param vector Vector3D to add to this instance
     * @return vector resulting from addition.
     */
    public Vector3D addVector(Vector3D vector) {
        double newX = getX() + vector.getX();
        double newY = getY() + vector.getY();
        double newZ = getZ() + vector.getZ();
        return new Vector3D(newX, newY, newZ);
    }

    /**
     * Return the resulting vector when the input vector is subtracted from this instance
     *
     * @param vector Vector3D to subtract from this instance
     * @return vector resulting from subtraction.
     */
    public Vector3D subtractVector(Vector3D vector) {
        double newX = getX() - vector.getX();
        double newY = getY() - vector.getY();
        double newZ = getZ() - vector.getZ();
        return new Vector3D(newX, newY, newZ);
    }

    /**
     * Return the resulting vector when this instance is multiplied by a scalar factor.
     *
     * @param scalar scalar multiplication factor
     * @return vector resulting from scaling.
     */
    public Vector3D multiplyByScalar(double scalar) {
        double newX = getX() * scalar;
        double newY = getY() * scalar;
        double newZ = getZ() * scalar;
        return new Vector3D(newX, newY, newZ);
    }

    /**
     * Returns the resulting scalar value when the dot product for this vector and the input vector is calculated.
     *
     * @param vector vector to use with this instance for dot product calculation.
     * @return resulting dot product.
     */
    public double dotProduct(Vector3D vector) {
        double thisMagnitude = magnitude();
        double thatMagnitude = vector.magnitude();
        return (thisMagnitude * thatMagnitude) * Math.cos(angle(vector));
    }

    /**
     * Returns the resulting vector then the cross product for this vector and the input vector is calculated.
     *
     * @param vector vector to use with this instance for cross product calculation.
     * @return resulting cross product.
     */
    public Vector3D crossProduct(Vector3D vector) {
        double newX = (getY() * vector.getZ()) - (getZ() * vector.getY());
        double newY = (getZ() * vector.getX()) - (getX() * vector.getZ());
        double newZ = (getX() * vector.getY()) - (getY() * vector.getX());
        return new Vector3D(newX, newY, newZ);
    }

}
//End of class.
