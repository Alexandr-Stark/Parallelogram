package com.company;

public class Parallelogram
{
    private int lenght;
    private int widht;
    private int height;
    private double cos;

    public Parallelogram(int lenght, int widht, int height, double cos) // конструктор
    {
        this.lenght = lenght;
        this.widht = widht;
        this.height = height;
        this.cos = cos;
    }

    public int getLenght() { // методи класу
        return lenght;
    }

    public int getWidht() { // методи класу
        return widht;
    }

    public double getCos() { // методи класу
        return cos;
    }

    public int getHeight() { // методи класу
        return height;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setCos(double cos) {
        this.cos = cos;
    }
//===========================================================================
    public int getArea(){
        return this.getLenght() * this.getHeight();
    }

    public int getPerimeter(){
        return 2 * (this.getWidht() + this.getLenght());
    }

    public int getHeightParallelo(){
        return this.getArea() / this.getLenght();
    }

    public double getDiagonal1(){
        double d1 = Math.sqrt(Math.pow(this.getLenght(), 2) + Math.pow(this.getWidht(), 2) + 2 *(this.getLenght()* this.getLenght())* Math.cos(this.getCos()));
        return (int) (d1);
    }

    public double getDiagonal2(){
        double d2 = Math.sqrt((2 * (Math.pow(this.getLenght(), 2))) + (2 * Math.pow(this.getWidht(), 2)) - Math.pow(this.getDiagonal1(), 2));
        return (int) (d2);
    }
}
