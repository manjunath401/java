/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author s559391
 */
// created the abstract class
public abstract class Shape {

    private final double pi = 3.14;

    public Shape() {// created the default constructor

    }
    
    // writing the getter method

    public double getPi() {

        return pi;
    }
// created abstract method for perimeter and area
    public abstract double perimeter();

    public abstract double area();

    @Override// writing the toString method to return the values
    public String toString() {
        return "Shape{" + "pi=" + pi + '}';
    }

}
