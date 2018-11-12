
import java.util.Scanner;


/*
 * Fórmulas matemáticas
 * Calculo de distancia con fórmulas distintas
 */

/**
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
       Scanner input = new Scanner(System.in);
       
       //Muestra un pequeño menú para seleccionar la fórmula con la cual se realizará el cálculo
        System.out.println("Ingrese el número de fórmula que desee usar"
                + "\n             a x t^2"
                + "\n 1) Vo x t + --------"
                + "\n                 2"
                + "\n    (Vo + Vf)"
                + "\n 2) ---------  x t"
                + "\n        2"
                + "\n    (Vf - Vo)"
                + "\n 3) ---------"
                + "\n      2 x a");
        int op = input.nextInt(); //Variable donde se guarda la opción
        switch(op){ //condicional switch para ejecutar el programa dependiendo de la fórmula elegida
            case 1://Opción 1
                Formula1 for1 = new Formula1(); //Instancia de la clase Fromula1
                System.out.println("Distancia calculada con valores: Vo = 10, a = 16, t = 20");
                System.out.println(for1.CalcularDistancia()); //Muestra el método donde se cálcula la distancia con los valores por defecto
                
                //Se introducen los valores de las variables solicitadas
                System.out.println("Ingrese la Velocidad Inicial");
                for1.mov.setVo(input.nextDouble());
                System.out.println("Ingrese la Aceleración");
                for1.mov.setAceleracion(input.nextDouble());
                System.out.println("Ingrese el Tiempo");
                for1.mov.setTiempo(input.nextDouble());
                //Muestra el cálculo de la distancia con los valores ingresados
                System.out.println("Distancia: " + for1.mov.CalcularDistancia());
                break; //Fin de la opción 1
                
            case 2: //Opción 2
                Formula2 for2 = new Formula2(); //Instancia de la clase Fromula1
                System.out.println("Distancia calulada con valores: Vo = 10, Vf = 15, t = 20");
                System.out.println(for2.CalcularDistancia()); //Muestra el método donde se cálcula la distancia con los valores por defecto
                
                //Se introducen los valores de las variables solicitadas
                System.out.println("Ingrese la Velocidad Inicial");
                for2.mov.setVf(input.nextDouble());
                System.out.println("Ingrese la Velocidad Final");
                for2.mov.setVf(input.nextDouble());
                System.out.println("Ingrese el Tiempo");
                for2.mov.setTiempo(input.nextDouble());
                //Muestra el cálculo de la distancia con los valores ingresados
                System.out.println("Distancia: " + for2.mov.CalcularDistancia());
                break; //Fin de la opción 2
                
            case 3:
                Formula3 for3 = new Formula3();
                System.out.println("Distancia calulada con valores: Vo = 10, Vf = 15, a = 16");
                System.out.println(for3.CalcularDistancia()); //Muestra el método donde se cálcula la distancia con los valores por defecto
                
                //Se introducen los valores de las variables solicitadas
                System.out.println("Ingrese la Velocinada Inicial");
                for3.mov.setVo(input.nextDouble());
                System.out.println("Ingresa la Velocidad Final");
                for3.mov.setVf(input.nextDouble());
                System.out.println("Ingresa la Aceleración");
                for3.mov.setAceleracion(input.nextDouble());
                //Muestra el cálculo de la distancia con los valores ingresados
                System.out.println("Distancia: " + for3.mov.CalcularDistancia());
                break; //Fin de la opción 2
                
            default: //Si se ingresa cualquier otro número que no sean las opciones del menú se muestra un mensaje de Error
                System.out.println("ERROR"
                        + "\nOpción inválida");
        }
        
    }

}
//------------------------------------------------------ Fórmula 1--------------------------------------------------------
//Clase Formula1 que hereda de Movimiento
class Formula1 extends Movimiento{
    //Se llama al constructor Movimiento con los valores ingresados por el usuario
    Movimiento mov = new Movimiento(getVo(), getVf(), getAceleracion(), getTiempo()) {
        @Override
        public double CalcularDistancia() { //Método para calcular la distancia con los valores ingreados por el usuario
            double d = 0; 
            d = (getVo() * getTiempo()) + (((getAceleracion()*(getTiempo()*getTiempo()))/2)); //Fórmula
            return d; //Regresa el valor de la distancia calculada
        }
    };
    
    
    @Override
    public double CalcularDistancia() { //Método para calcular la distancia con los valores ya asignados por defecto
        double d = 0; 
        d = (getVo() * getTiempo()) + (((getAceleracion()*(getTiempo()*getTiempo()))/2)); //Fórmula
        return d;//Regresa el valor de la distancia calculada
    }
    
}
//------------------------------------------------------ Fórmula 2 -------------------------------------------------------
class Formula2 extends Movimiento{
    //Se llama al constructor Movimiento con los valores ingresados por el usuario
    Movimiento mov = new Movimiento(getVo(), getVf(), getAceleracion(), getTiempo()) {
        @Override
        public double CalcularDistancia() { //Método para calcular la distancia con los valores ingreados por el usuario
            double d = 0;
            d = ((getVo()+getVf())/2)*getTiempo();//Fórmula
            return d;//Regresa el valor de la distancia calculada
        }
    };

    @Override
    public double CalcularDistancia() { //Método para calcular la distancia con los valores ya asignados por defecto
        double d = 0;
        d = ((getVo()+getVf())/2)*getTiempo();//Fórmula
        return d;//Regresa el valor de la distancia calculada
    }

}
//------------------------------------------------------ Fórmula 3 -------------------------------------------------------
class Formula3 extends Movimiento{
    //Se llama al constructor Movimiento con los valores ingresados por el usuario
    Movimiento mov = new Movimiento(getVo(), getVf(), getAceleracion(), getTiempo()) {
        @Override
        public double CalcularDistancia() { //Método para calcular la distancia con los valores ingreados por el usuario
            double d = 0;
            d = (getVf()-getVo())/(2*getAceleracion());//Fórmula
            return d; //Regresa el valor de la distancia calculada
        }
            
    };

    @Override
    public double CalcularDistancia() { //Método para calcular la distancia con los valores ya asignados por defecto
        double d = 0;
        d = (getVf()-getVo())/(2*getAceleracion());//Fórmula
        return d; //Regresa el valor de la distancia calculada
    }

    
}
 
// Clase abstracta con implementacion de captura 
abstract class Movimiento implements Captura{
    //Atributos
    private double Vo;
    private double Vf;
    private double a;
    private double t;

    // Constructor sin parametros
    public Movimiento() {
        Vo = 10;
        Vf = 15;
        a = 16;
        t = 20;
    }
    // Constructor con parametros
    public Movimiento(double Vo, double Vf, double a, double t){
        this.Vo = Vo;
        this.Vf = Vf;
        this.a = a;
        this.t = t;
    }

    //Métodos get y set implementados de la interfaz
    @Override
    public void setVo(double Vo) {
        this.Vo = Vo;
    }

    @Override
    public double getVo() {
        return this.Vo;
    }

    @Override
    public void setVf(double vf) {
        this.Vf = vf;
        
    }

    @Override
    public double getVf() {
        return this.Vf;
    }

    @Override
    public void setAceleracion(double a) {
        this.a = a;
    }

    @Override
    public double getAceleracion() {
       return this.a;
    }

    @Override
    public void setTiempo(double t) {
       this.t = t;
    }

    @Override
    public double getTiempo() {
        return this.t;
    }
    //Método abstracto para calcular la distancia, es heredado por las clases
    abstract public double CalcularDistancia();

}

// Interfaz con los metodos get y set
 interface Captura {
    void setVo(double Vo);
    double getVo();
    
    void setVf(double vf);
    double getVf();
    
    void setAceleracion(double a);
    double getAceleracion();
    
    void setTiempo(double t);
    double getTiempo();
    
}  
 