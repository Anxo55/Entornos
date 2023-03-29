// // Tenemos 3 tipos de sanitarios ,
// // enfermeros, medicos de familia y cirujanos
// public class Sanitario {

//     private int numeroGuardias; // solo aplicable a los medicos de familia y cirujanos
//     private int numeroOperaciones; // Solo aplicable a los cirujanos
//     private Sanitario[] sanitariosACargo; // solo aplicable a los medicos de familia y cirujanos
//     private Sanitario jefe; // Aplicable a cualquier tipo de sanitario
//     private int inyeccionesSuministradas; // solo aplicable a los enfermeros
//     private int sueldo_bruto; // Aplicable a cualquier tipo de sanitario
 
//     Sanitario(int numeroGuardias, int numeroOperaciones, Sanitario[] sanitariosACargo, Sanitario jefe,
//             int inyeccionesSuministradas, int sueldo_bruto) {
//         this.numeroGuardias = numeroGuardias;
//         this.numeroOperaciones = numeroOperaciones;
//         this.sanitariosACargo = sanitariosACargo;
//         this.jefe = jefe;
//         this.inyeccionesSuministradas = inyeccionesSuministradas;
//         this.sueldo_bruto = sueldo_bruto;
//     }
//  }


class Enfermero extends Sanitario {
    private int inyeccionesSuministradas;
 
    public Enfermero(Sanitario jefe, int sueldoBruto, int inyeccionesSuministradas) {
        super(jefe, sueldoBruto);
        this.inyeccionesSuministradas = inyeccionesSuministradas;
    }
 }
 
 class Medico extends Sanitario {
    private int numeroGuardias;
    private Sanitario[] sanitariosACargo;
 
    public Medico(Sanitario jefe, int sueldoBruto, int numeroGuardias, Sanitario[] sanitariosACargo) {
        super(jefe, sueldoBruto);
        this.numeroGuardias = numeroGuardias;
        this.sanitariosACargo = sanitariosACargo;
    }
 }
 
 class MedicosFamilia extends Medico {
 
    public MedicosFamilia(Sanitario jefe, int sueldoBruto, int numeroGuardias, Sanitario[] sanitariosACargo) {
        super(jefe, sueldoBruto, numeroGuardias, sanitariosACargo);
    }
 }
 
 class Cirujanos extends Medico {
    private int numeroOperaciones;
 
    public Cirujanos(Sanitario jefe, int sueldo_bruto, int numeroGuardias, Sanitario[] sanitariosACargo,
            int numeroOperaciones) {
        super(jefe, sueldo_bruto, numeroGuardias, sanitariosACargo);
        this.numeroOperaciones = numeroOperaciones;
    }
 
 }
 
 public class Sanitario {
    private Sanitario jefe;
    private int sueldoBruto;
 
    public Sanitario(Sanitario jefe, int sueldo_bruto) {
        this.jefe = jefe;
        this.sueldoBruto = sueldo_bruto;
    }
 
 }
 
 
