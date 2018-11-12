
import java.util.Scanner;

/*
 * Clases sobre vehículos
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 *         Josué David Martínez García 18550360
 *         Brayan Salvador Saenz Prieto 18550339
 *         Oscar Aron Romero Camacho 18550377
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sedan sed = new Sedan(); //Objeto de la clase Sedan
        Motocicleta moto = new Motocicleta(); //Objeto de la clase Motocicleta
        Scanner input = new Scanner(System.in); //Se usa para introducir valores por teclado
        
        
        System.out.println("¿Con cual vehículo cuenta?"
                + "\n 1)Sedan"
                + "\n 2)Motocicleta");
        int op = input.nextInt(); //Se solicita una opción de las anteriores para ver con cual vehículo se harán las operaciones
        
        switch(op){ //Condicional Switch dependiendo de la opción seleccionada para ejecutar las instrucciones deacuerdo al tipo de vehículo
            
            case 1: //Opción uno
                //Sedan
                sed.setVelocidad(80); //Velocidad de Sedan en 80 km/h
                sed.setCantidadPasajeros(4); //Cantidad de pasajeros 4
                sed.setSonido(200); //La variable sonido tiene 200 watts de potencia
                sed.setBocinas(3); //Con tres bocinas
                sed.setNumeroRuedas(4); //Con 4 llantas
                sed.setTipoTransmision(tipoTransmision.Manual); //Su tipo de transmisón es Manual
                
                //Llama al método acelerar, el cual incrementa la velocidad de 10 en 10
                //En este caso acelera 40 km/h ya que se llama al método 4 veces
                sed.Acelerar();
                sed.Acelerar();
                sed.Acelerar();
                sed.Acelerar();
                
                //Se llama al método frenar, desacelera de 10 en 10
                sed.Frenar();
                //Acelera de nuevo 10 km/h
                sed.Acelerar();
                //Se llama al método estacionar, el cual solicita el argumento de que clase es (tipo de vehículo usado), y la velocidad
                //Muestra la velocidad previa, el tipo de vehículo y cuando el vehículo ha sido detenido
                estacionar(sed, sed.getVelocidad());
                //Muestra la cadena de texto de todos los atributos que se le asignaron al vehículo
                System.out.println(sed.getTexto());
                break; //Termina la primera opción
                
            case 2: //Opción dos
                //Motocicleta
                moto.setVelocidad(80); //Velocidad de la motocicleta en 80
                moto.setCantidadPasajeros(2); //Cantidad de pasajeros 2
                moto.setNumeroRuedas(2); //Numero de llantas 2
                moto.setTipoTransmision(tipoTransmision.Automatico); //Tipo de transmisión Automático
                
                //Se llama al método acelerar 3 veces, aumenta la velocidad de 10 en 10, en este caso sube 30 km/h
                moto.Acelerar();
                moto.Acelerar();
                moto.Acelerar();
                //Llama al método frenar, disminuye la velocidad de 10 en 10
                moto.Frenar();
                //Llama de nuevo al método acelerar, aumenta la velocidad 10km/h
                moto.Acelerar();
                //Se llama al método estacionar, el cual solicita el argumento de que clase es (tipo de vehículo usado), y la velocidad
                //Muestra la velocidad previa, el tipo de vehículo y cuando el vehículo ha sido detenido
                estacionar(moto, moto.getVelocidad());
                //Muestra la cadena de texto de todos los atributos que se le asignaron al vehículo
                System.out.println(moto.getTexto());
                break; //Termina la primera opción
                
            default: //Cualquier número ingresado que no sea 1 0 2
                //Despliega un mensaje de error y termina el programa
                System.out.println("ERROR" + "\nVehículo no disponible");
        }
           
    }
    
    //Método estacionar que acepta atributos de tipo Vehículo y entero
    public static void estacionar(Vehiculo arg, int velocidad) {
        String tipoVehi; //Variable para conocer el tipo de Vehículo
        
        arg.Acelerometro(); //Se llama al método Acelerometro
    
        if (arg instanceof Sedan){ //Si el argumento recibido es de tipo Sedan
            tipoVehi = "Vehículo tipo Sedan"; //La variable tipoVehi guarda el mensaje que es tipo Sedan
            System.out.println(tipoVehi); //Se despliega el mensaje almacenado en la variable tipoVehi
        }
    
        else { //Si el argumento no es tipo Sedan
            tipoVehi = "Vehículo tipo Motocicleta"; //La variable tipoVehi guarda el mensaje que es tipo Motocicleta
            System.out.println(tipoVehi); //Muestra el mensaje almacenado en la variable tipoVehi
        }
        while(arg.getVelocidad()!=0){ //Mientras que la velocidad sea distinta de 0
        arg.Frenar();} //Se frena de 10 en 10 hasta que la velocidad sea 0
        
        arg.Acelerometro(); //Se llama de nuevo al método Acelerometro
    }   
}
