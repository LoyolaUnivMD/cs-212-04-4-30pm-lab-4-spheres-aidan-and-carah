
/** Programmers: Carah and Aidan
 * Course:  CS 212
 * Due Date: Feb 18 2024
 * Lab Assignment: Spheres
 * Problem Statement: Make sphere calculations for 3 given coordinate sets
 * Data In: x2, y2, z2
 * Data Out: area, volume, distance
 * Credits: N/A
*/

import java.lang.Math;
import java.util.Scanner;
class Sphere {
    Scanner input = new Scanner(System.in);
    // Initialize necessary variables
    double xCoord1;
    double yCoord1;
    double zCoord1;
    double planetRadius;
    public double area;
    public double volume;
    public double distance;

    // Default constructor
    // Take in values from Main call instance
    public Sphere(double x, double y, double z, double radius) {
        xCoord1 = x;
        yCoord1 = y;
        zCoord1 = z;
        planetRadius = radius;
    }

    // Area method
    public double area() {
        // area = 4 * pi * r^2
        area = 4 * Math.PI * Math.pow(planetRadius,2);
        return area;
    }

    // Volume method
    public double volume() {
        // volume = (4/3) * pi * r^3
        volume = (double) (4/3) * Math.PI * Math.pow(planetRadius, 3);
        return volume;
    }

    // Distance method
    public double distance() {
        // Get second coords from user
        System.out.println("What is the second x point? ");
        double xCoord2 = input.nextDouble();

        System.out.println("What is the second y point? ");
        double yCoord2 = input.nextDouble();

        System.out.println("What is the second z point? ");
        double zCoord2 = input.nextDouble();

        // distance = sqrt((x1 - x2)^2 + (y1 - y2)^2 + (z1 - z2)^2)
        distance = Math.sqrt(Math.pow((xCoord1-xCoord2), 2) + Math.pow((yCoord1-yCoord2), 2) + Math.pow(zCoord1-zCoord2, 2));
        return distance;
    }
}
