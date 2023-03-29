class Student{
    String name;
    int height;
}
//tipos primitivos (byte, int, long, boolean) se pasan por valor
//objetos por referencia
public class Optimizacion {
    static public void myFunction(int height, Student student) {
        height = 200;
        student.height=200;
    }

    public static void main(String[] args) {
        int laAtura = 180;
        Student manolo = new Student();
        manolo.height = 180;
        manolo.name = "Manolo";
        System.out.println(laAtura);
        System.out.println(manolo.height);

        myFunction(laAtura, manolo);
        
        System.out.println(laAtura); // 180 valor;
        System.out.println(manolo.height); //200 (ref) 

        
        

    }

}
