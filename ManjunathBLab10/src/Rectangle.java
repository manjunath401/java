/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author s559391
 */
public class Rectangle extends Shape {// inherited the class from shape

    private double width;
    private double height;

    public Rectangle() {// created the default constructor

    }

    public Rectangle(double width, double height) {// created the overload constructor

        this.height = height;
        this.width = width;

    }
// writing the getter and setter methods
    public double getHeight() {

        return height;
    }

    public double getWidth() {

        return width;
    }
    

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {

        this.width = width;
    }
// created the method for area
    @Override
    public double area() {
        return width * height;
    }
// created the method for parimeter
    @Override
    public double perimeter() {
        return 2 * (height + width);
    }

    // writing the toString method to return the values
    @Override
    public String toString() {
        return super.toString() + "Rectangle{" + "width=" + width + ", height=" + height + '}';
    }

}
