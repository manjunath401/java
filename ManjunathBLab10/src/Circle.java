/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author s559391
 */
public class Circle extends Shape {// inherited the class from shape

    private double radius;// decleared the given variable

    public Circle() {// created the default class

    }
// writing the getter and setter methos

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double perimiter() {

        return 2 * getPi() * radius;

    }
    // creating the method for area

    @Override
    public double area() {

        return getPi() * radius * radius;
    }
// creating the method for perimeter

    @Override
    public double perimeter() {
        return getPi() * 2 * radius;
    }
// writing the toString method to return the values

    @Override
    public String toString() {
        return super.toString() + "Circle{" + "radius=" + radius + '}';
    }

}
