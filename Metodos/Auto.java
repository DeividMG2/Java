public class Auto {
    //Creando atributos del auto
    String marca, color;
    int modelo;
    double precio;
    
    void arrancarAuto(String m){
        System.out.println("El auto "+m+" arranco"); //m parametro de marca
    }
    void apagarAuto(){
        System.out.println("El auto se detuvo");
    }
    void acelerarAuto(){
        System.out.println("El auto esta acelerando");
    }
    void frenarAuto(){
        System.out.println("El auto freno");
    }
}
