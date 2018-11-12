/*
 * 
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 *         Josué David Martínez García 18550360
 *         Brayan Salvador Saenz Prieto 18550339
 *         Oscar Aron Romero Camacho 18550377
 */
public class Vehiculo {
    
    //Atributos privados
    private int numeroRuedas;
    private String tipoTransmision;
    private int cantidadPasajeros;
    private int velocidad;
    private String texto;

    //Métodos get y set de cada uno de los atributos
    
    //Método get que muestra una cadena de texto con los valores que tiene el vehículo
    public String getTexto() {
        String cadena = "Cantidad de pasajeros: " + cantidadPasajeros + "\n Número de llantas: " + numeroRuedas
                + "\n Tipo de transmisión: " + tipoTransmision;
        return cadena;
        
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    //Método Acelerar.
    //Aumenta la velocidad de 10 en 10 cada vez que es llamado
    public void Acelerar(){
            velocidad = velocidad + 10;
            //Si la velocidad es mayor a 130, se iguala a 130, ya que es el límite de velocidad del vehículo
            if(velocidad > 130){
                velocidad = 130;
            }
        }
    
    //Método frenar.
    //Disminuye la velocidad de 10 en 10 cada vez que es llamado
    public void Frenar(){
            velocidad = velocidad - 10;
            
            //Si la velocidad llega a ser menor a 0, se igualará a 0
            if(velocidad < 0){
                velocidad = 0;
            }
    }
    
    //Método Acelerometro.
    public void Acelerometro(){
            //Si la velocidad es mayor a 0, muestra a que velocidad va el vehículo, cada vez que es llamado
            if(velocidad > 0){
                System.out.println("Vehículo en movimiento: a " + velocidad + " km/hr");
            }
            //Si la velocidad es menor o igual a 0
            //Se iguala a 0, y muestra que el vehículo a sido detenido
            else if (velocidad <= 0){
                velocidad = 0;
                System.out.println("Vehiculo detenido");
            }
        
    }
    
}
//Interfaz llamada Tunneable
interface Tunneable{
    
    //Métodos get y set de los atributos sonido y bocinas, que se establecen en la clase que la implementa, en este caso en la clase Sedan
    void setSonido(int sonido);
    int getSonido();
    
    void setBocinas(int bocinas);
    int getBocinas();
    
}

//Clase Sedan que hereda de Vehículo e implementa la interfaz Tunneable
class Sedan extends Vehiculo implements Tunneable{
    //Atributos
    private int sonido = 0;
    private int bocinas = 0;
    
    //Método get heredado de la clase Vehículo, el cual esta sobreescrito
    @Override
    public String getTexto(){
        String cadena = "Cantidad de pasajeros: " + getCantidadPasajeros() + "\nNúmero de llantas: " + getNumeroRuedas()
                + "\nTipo de transmisión: " + getTipoTransmision() + "\nWatts de potencia: " + sonido
                + "\nCantidad de bocinas: " + bocinas;
        return cadena;
    }

    //Métodos heredados y sobreescritos de la interfaz Tunneable
    @Override
    public void setSonido(int sonido) {
        this.sonido = sonido;
    }

    @Override
    public int getSonido() {
        return this.sonido;
    }

    @Override
    public void setBocinas(int bocinas) {
        this.bocinas = bocinas;
    }

    @Override
    public int getBocinas() {
        return this.bocinas;
    }
    
}

//Clase Motocicleta que hereda de Vehículo
class Motocicleta extends Vehiculo {
    
}

//Clase extra llamada tipoTransmisión para asignarle valores por defecto a la variable tipoTransmision
class tipoTransmision{
    public static final String Manual = "Manual";
    public static final String Automatico = "Automatico";
}