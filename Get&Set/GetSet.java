
public class GetSet {

   
    public static void main(String[] args) {
        
        Alumno a1 = new Alumno("2022180126","Deivid","Matute Guerrero");
        Alumno a2 = new Alumno("2022204267","Stephanie","Matute Guerrero");
        a1.verDatos();
        a2.verDatos();
        
        System.out.println("Nombre alumno 1: "+a1.getNombre()); //Usando el get para obtener el nombre
        a1.setNombre("Antonio"); //Usando el set para asignar (en este caso reasignar) un nuevo valor a nombre
        System.out.println("Nuevo nombre alumno 1: "+a1.getNombre()); //Aqui ya tiene el nuevo nombre

    }
    
}
