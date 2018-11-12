
import java.util.Scanner;

/*
 * Clase captura de texto
 */

/**
 * @author Karla Pamela Cárdenas Leyva 18550338
 *         Josué David Martínez García 18550360
 *         Brayan Salvador Saenz Prieto 18550339
 *         Oscar Aron Romero Camacho 18550377
 */

public class Principal {

  
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        CadenaTexto ct=new CadenaTexto();
        //Solicitan valores para cada variable
            System.out.println("Escribe una palabra: ");
            ct.setCadena(Sc.nextLine()); //Palabra
            System.out.println("¿Cuántas veces quieres imprimir la palabra?");
            ct.setX(Sc.nextInt()); //Numero de veces
            System.out.println("Escoge una opción:");
            System.out.println("V.- Vertical");
            System.out.println("H.- Horizontal");
            ct.setOrientacion(Sc.next()); //Orientacion
            
            ct.imprimeCadena(); //Se llama al método para imprimir la palabra
	}
}
class Captura{
    //atributo
    private String cadena;
    //Constructor default
    public Captura(){
        this.cadena = "práctica";
    }
    //Constructos con parametros
    public Captura(String cadena) {
        this.cadena = cadena;
    }
    //Metodos get y set
    public void setCadena(String cadena)
    {
        this.cadena=cadena;
    }
    public String getCadena()
    {
        return cadena;
    }
}


class CadenaTexto extends Captura{
    //atributos
    private int x;
    private String Orientacion;
    //Constructor con parametros
    public CadenaTexto(int x, String Orientacion) {
        this.x = x;
        this.Orientacion = Orientacion;
    }
    //Constructor default
    public CadenaTexto() {
        this.x = 10;
        this.Orientacion = "H";
    }
    //Metodos get y set
    public void setX(int x)
    {
        this.x=x;
    }
    public int getX()
    {
        return x;
    }
    public void setOrientacion(String orientacion)
    {
        this.Orientacion=orientacion;
    }
    public String getOrientacion()
    {
        return Orientacion;
    }
    //Metodo para imprimir
    public void imprimeCadena(){
        //Si el valor ingresado en orientacion es igual a v o V
            if ("V".equals(Orientacion) || "v".equals(Orientacion))
            {
                setOrientacion("V"); //Se guarda V
            }
            //Si el valor ingresado en orientacion es igual a h o H
            else if("H".equals(Orientacion) || "h".equals(Orientacion))
            {
                setOrientacion("H"); //Se guarda H
            }
            switch(getOrientacion()) //Se usa la variable v o h para sentencia switch
            {
                //El primer caso si es H
                case "H": 
                    //Se repite en ciclo for hasta que sea igual al numero ingresado
                    for(int i=0; i<getX(); i++)
                          {
                              //Se muestra la cadena
                              getCadena();
                              System.out.print(getCadena());
                              System.out.print(" ");
                          }
                break; //Termina el primer caso
                //Segundo caso, si es V
                case "V": 
                    //Se repite en ciclo for hasta que sea igual al numero ingresado
                    for(int i=0; i<getX(); i++)
                          {
                              //Se muestra la cadena
                              getCadena();
                              System.out.print(getCadena());
                              System.out.print(" \n");
                          }
                break; //Termina segundo caso
                
                default: //Cualquier valor que no sean los de los primeros casos
                    System.out.println("caracter invalido"); //Muestra mensaje
                break; //Termina
            }
         
    }
}
    

