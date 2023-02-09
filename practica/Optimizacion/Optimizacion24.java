public class Optimizacion24 {
    
    public class ejemplo24 {
        void ejemplo24SinOptimizar() {
        Alumno pepe = new Alumno();
        // trabajo con pepe
        Profesor juan = new Profesor();
        // trabajo con juan
} 

        void ejemplo24Optimizado() {
        Alumno pepe = new Alumno();
        // trabajo con pepe
        pepe=null;
        Profesor juan = new Profesor();
        // trabajo con juan
        juan=null;
        }
        }
        class Alumno{
        }
        class Profesor{
        

    }
}
