public class Metodos {
    
    public static void main(String[] args){
        
        //Creando mis instancias, objetos
        
        Auto primerAuto = new Auto();
        primerAuto.marca = "Ferrari"; // Así establezco valor a ese atributo de la clase auto.
        
        String marcaAuto1 = primerAuto.marca;
        
        primerAuto.arrancarAuto(marcaAuto1);
        primerAuto.acelerarAuto();
        primerAuto.frenarAuto();
        primerAuto.apagarAuto();
        
    }
          
}
