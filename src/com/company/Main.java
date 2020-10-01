package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here Абстракція - консентрація на потрібне та відкинання не потрібного.
        Parallelogram p1 = new Parallelogram(4,5, 6, 45.0);

        System.out.println("The Area of Perallelogram = " + p1.getArea() + " cm²;");
        System.out.println("The Perimeter of Perallelogram = " + p1.getPerimeter() + " cm;");
        System.out.println("The Height of Perallelogram = " + p1.getHeightParallelo() + " cm;");
        System.out.println("The Diagonal 1 of Perallelogram = " + p1.getDiagonal1() + " cm;");
        System.out.println("The Diagonal 2 of Perallelogram = " + p1.getDiagonal2() + " cm;");
    }
}
