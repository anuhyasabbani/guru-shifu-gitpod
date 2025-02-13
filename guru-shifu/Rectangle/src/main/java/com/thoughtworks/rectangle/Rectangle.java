
package com.thoughtworks.rectangle;

public class Rectangle {
    final private double length;
    final private double breadth;

    
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public double area() {
        return this.length*this.breadth;
    }
     
    public double perimeter() {
        return 2 * (this.length + this.breadth);
    }
    
}
