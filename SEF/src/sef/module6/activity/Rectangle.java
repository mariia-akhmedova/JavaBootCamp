package sef.module6.activity;

public class Rectangle extends Shape {

    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle() {
        this.length = 5;
        this.breadth = 7;
    }


    public double calculateArea() {
        return length * breadth;
    }


    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }



}
