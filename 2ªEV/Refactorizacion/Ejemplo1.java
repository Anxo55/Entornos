package Refactorizacion;

public class Ejemplo1 {
    private static float cuadrado(float num) {
        return num * num;
    }
   
    public static float algoritmoX(float b) {
        float a = cuadrado(b) + 1;
 
        for(int i=0;i<3;i++) {
            b = cuadrado(b);   
        }
        a += b;
        return a;
    
    }

    (String[] args) {
        System.out.println(algoritmoX(4));
        System.out.println(algoritmoX(-4));
        System.out.println(algoritmoX(0));
    }
 }

