/** Programmers: Carah and Aidan
* Course:  CS 212
* Due Date: Feb 18 2024
* Lab Assignment: Spheres
* Problem Statement: Make sphere calculations for 3 given coordinate sets
* Data In: x2, y2, z2
* Data Out: area, volume, distance
* Credits: N/A
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Music of the Spheres\n");

        Sphere sun = new Sphere(0.0, 0.0, 0.0, 43.26);
        Sphere earth = new Sphere(26.0, 42.0, 79.0, 0.395);
        Sphere planetX = new Sphere(25.3, 43.1, 77.8, 1.4);

        System.out.println("Now calculating for... Sun.");
        System.out.println("Sun Area: " + sun.area() + "\nSun Volume: " + sun.volume() + "\nSun Distance: " + sun.distance());

        System.out.println("\nNow calculating for... Earth.");
        System.out.println("Earth Area: " + earth.area() + "\nEarth Volume: " + earth.volume() + "\nEarth Distance: " + earth.distance());

        System.out.println("\nNow calculating for... PlanetX.");
        System.out.println("PlanetX Area: " + planetX.area() + "\nPlanetX Volume: " + planetX.volume() + "\nPlanetX Distance: " + planetX.distance());

    }
}
