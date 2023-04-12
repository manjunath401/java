
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author s559391
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter if share is Circle or Rectangle: ");
        Scanner scan = new Scanner(System.in);//created scanner class to read input from user
        String shape = scan.next();
        if (shape.equals("circle")) {// if shape is circle execute the below
            System.out.print("Enter the radius of the Circle: ");
            Circle c = new Circle(scan.nextDouble());
            System.out.println("The area of the circle is: " + c.area()
                    + "\nThe perimeter of the Circle is: " + c.perimeter()
                    + "\n-----To String Method Called---------\n" + c.toString());// printing the area, perimeter and to string method
        } else if (shape.equals("rectangle")) { // if shape is rectangle execute the below
            System.out.print("Enter the width of Rectangle: ");
            double w = scan.nextDouble();
            System.out.print("Enter the length of Rectangle: ");
            double l = scan.nextDouble();
            Rectangle t = new Rectangle(w, l);
            System.out.println("The area of the circle is: " + t.area()
                    + "\nThe perimeter of the Circle is: " + t.perimeter()
                    + "\n-----To String Method Called---------\n" + t.toString());// printing the area, parameter and tostring method
        } else {
            System.out.println("Invalid option");// else user enter wrong input print invalid option
        }
    }
}
