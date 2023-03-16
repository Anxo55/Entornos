package Refactorizacion;

public class Shape {
    public String color;
    public void colorDefecto() {
        color = "negro";
    }
   
    public static void main(String[] arg) {
        Square cuadrado = new Square(20);
        System.out.println (cuadrado.area() );
    }
 }
 
 class Circle extends Shape{
    public double radio;
    public double area() {
        return Math.PI * radio * radio;
    }
    public Circle(double radio) {
        this.radio = radio;
    }
   
 }
 
 class Square extends Shape{
    public double lado;
    public double area() {
        return lado * lado;
    }
    public Square(double lado) {
        this.lado = lado;
    }
   
 }
 
 class RightTriangle extends Shape{
    public double base;
    private double altura;
    public double area() {
        return base * altura / 2;
    }
    public RightTriangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
   
 }
 