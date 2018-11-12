
import java.util.Scanner;



/*
 * Clases de empleados solicitando sus datos y el salario base, calculando el salario Total de cada uno 
 */

/**
 *
 * @author Karla Pamela Cárdenas Leyva 18550338
 *         Josué David Martínez García 18550360
 *         Brayan Salvador Saenz Prieto 18550339
 *         Oscar Aron Romero Camacho 18550377
 */
public class Principal {
    public static double salario; //Método estático que imprime el salario

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); //Objeto de la clase Scanner que permite leer valores de entrada de varios tipos.
        
        System.out.println("Ingrese la opción de empleado que es: "
                + "\n 1)De Manufactura"
                + "\n 2)De Apoyo"
                + "\n 3)Jefe"); //Menú escrito en consola que muestra tres opciones al usuario
        int op = input.nextInt(); //Variable de tipo entero que permite guardar la respuesta que ingrese el usuario en el menú
        
        switch(op){ //Instrucción condicional switch que funciona dependiendo de lo que el usuario haya ingresado en el menú de opciones
            case 1: //Opción 1
                // Tipo de empleado --> Manufactura
                Manufactura mMan = new Manufactura("", "", 0, 0, 0); //Método de la clase Manufactura con parámetros
                //A continuación se muestran diferentes salidas de consolas en que se le pide al usuario ingresar valores
                System.out.println("Ingrese su nombre");
                mMan.setNombre(input.next());
                
                System.out.println("Ingrese su apellido");
                mMan.setApellido(input.next());
                
                System.out.println("Ingrese su edad");
                mMan.setEdad(input.nextInt());
                
                System.out.println("Ingrese las horas que trabaja por semana");
                mMan.setHoras(input.nextDouble());
                
                System.out.println("Ingrese su salario base");
                mMan.setSalarioBase(input.nextDouble());
                //Se muestra una cadena de texto dependiendo de lo que haya ingresado el usuario
                System.out.println("\nSUS DATOS SON:\n" + "Nombre: " + mMan.getNombre() + 
                        "\nApellido: " + mMan.getApellido() + "\nEdad: " + mMan.getEdad() + 
                        "\nHoras: " + mMan.getHoras());
                Principal.salario = mMan.getSalarioTotal(); //El método estático salario se iguala al salario total para que se muestre en consola
                System.out.println("Salario diario: " + Principal.salario);
                
                break; //Final de la primera opción
            case 2: //Opción 2
                Apoyo aApo = new Apoyo("", "", 0, 0, 0); //Método de la clase Apoyo con parámetros
                //A continuación se muestran diferentes salidas de consolas en que se le pide al usuario ingresar valores
                System.out.println("Ingrese su nombre");
                aApo.setNombre(input.next());
                
                System.out.println("Ingrese su apellido");
                aApo.setApellido(input.next());
                
                System.out.println("Ingrese su edad");
                aApo.setEdad(input.nextInt());
                
                System.out.println("Ingrese las horas que trabaja por semana");
                aApo.setHoras(input.nextDouble());
                
                System.out.println("Ingrese su salario base");
                aApo.setSalarioBase(input.nextDouble());
                //Se muestra una cadena de texto dependiendo de lo que haya ingresado el usuario
                System.out.println("\nSUS DATOS SON:\n" + "Nombre: " + aApo.getNombre() + 
                        "\nApellido: " + aApo.getApellido() + "\nEdad: " + aApo.getEdad() + 
                        "\nHoras: " + aApo.getHoras());
                Principal.salario = aApo.getSalarioTotal(); //El método estático salario se iguala al salario total para que se muestre en consola
                System.out.println("Salario diario: " + Principal.salario / 0.50);
                break; //Final de la segunda opción
            case 3: //Opción 3
                Jefe jJef = new Jefe("", "", 0, 0); //Método de la clase Jefe con parámetros
                //A continuación se muestran diferentes salidas de consolas en que se le pide al usuario ingresar valores
                System.out.println("Ingrese su nombre");
                jJef.setNombre(input.next());
                
                System.out.println("Ingrese su apellido");
                jJef.setApellido(input.next());
                
                System.out.println("Ingrese su edad");
                jJef.setEdad(input.nextInt());
                
                System.out.println("Ingrese su salario base");
                jJef.setSalarioBase(input.nextDouble());
                //Se muestra una cadena de texto dependiendo de lo que haya ingresado el usuario
                System.out.println("\nSUS DATOS SON:\n" + "Nombre: " + jJef.getNombre() + 
                        "\nApellido: " + jJef.getApellido() + "\nEdad: " + jJef.getEdad());
                Principal.salario = jJef.getSalarioBase();
                System.out.println("Salario diario: " + Principal.salario);//El método estático salario se iguala al salario total para que se muestre en consola
                break; //Final de la tercera opción
                
                default: //Cualquier número ingresado que no sea 1 0 3
                //Despliega un mensaje de error y termina el programa
                System.out.println("ERROR" + "\nTipo de empleado no valido");
        }
    }
}
//Clase Manufactura que extiende los atributos de la clase Empleados
class Manufactura extends Empleados{
    //Se declara un constructor sin parámetros para la clase Manufactura
    public Manufactura(){
        //Se asignan valores para los atributos
        nombre = "Alonso";
        apellido = "Rodriguez";
        edad = 35;
        salarioBase = 40;
    }
    //Se declara un constructor con parámetros para la clase Manufactura
    public Manufactura(String nombre, String apellido, int edad, double salario, double salarioTo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salarioBase = salario;
        this.salarioTotal = salarioTo;
    }    
}
//Clase Apoyo que extiende los atributos de la clase Empleados
class Apoyo extends Empleados{
    //Se declara un constructor sin parámetros para la clase Apoyo
    public Apoyo(){
        //Se asignan valores para los atributos
        nombre = "David";
        apellido = "Domínguez";
        edad = 29;
        salarioBase = 50;
    }
    //Se declara un constructor con parámetros para la clase Apoyo
    public Apoyo(String nombre, String apellido, int edad, double salario, double salarioTo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salarioBase = salario;
        this.salarioTotal = salarioTo;
    }
}
//Clase Jefe que extiende los atributos de la clase Empleados
class Jefe extends Empleados{
    //Se declara un constructor sin parámetros para la clase Jefe
    public Jefe(){
        //Se asignan valores para los atributos
        nombre = "Ernesto";
        apellido = "Evergreen";
        edad = 65;
        salarioBase = 5000;
    }
    //Se declara un constructor con parámetros para la clase Jefe
    public Jefe(String nombre, String apellido, int edad, double salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salarioBase = salario;
    }
}
//Clase abstracta Empleados que implementa los métodos getter y setter de la interfaz Capturando
abstract class Empleados implements Capturando{
    //Se declaran los atributos de esta clase 
    String nombre;
    String apellido;
    int edad;
    double salarioBase;
    double horas;
    double salarioTotal;
    
    //Se definen los métodos getter y setter de los atributos de la clase abstracta
    public double getSalarioTotal(){
        return salarioTotal = salarioBase * horas;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    //Se heredan y se sobreescriben los métodos de la interfaz
    @Override
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    @Override
    public String getNombre(){
        return this.nombre;
    }
    @Override
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    @Override
    public String getApellido(){
        return this.apellido;
    }
    @Override
    public void setEdad(int edad){
        this.edad = edad;
    }
    @Override
    public int getEdad(){
        return this.edad;
    }
    @Override
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    @Override
    public double getSalarioBase(){
        return this.salarioBase;
    }
}
//Interfaz llamada Capturando
interface Capturando{
    //Métodos getter y setter de los atributos nombre, apellido, edad y salario, que se establecen en las tres diferentes clases que los implementa
    void setNombre(String nombre);
    String getNombre();
    
    void setApellido(String apellido);
    String getApellido();
    
    void setEdad(int edad);
    int getEdad();
    
    void setSalarioBase(double salarioBase);
    double getSalarioBase();
}
