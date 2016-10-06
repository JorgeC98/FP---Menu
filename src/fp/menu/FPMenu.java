/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menu;
import java.util.*;
/**
 *
 * @author JorgeRicardo
 */
public class FPMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("La opción elegida es:"+menu());
        // TODO code application logic here
        
        //forma 1 
        /*
        int m;
        float a;
        m=menu();
        a=calculaAreas(m);
        muestraResultado(a,m);
        */
        
        //forma 2
        muestraResultado(calculaAreas(menu()));
    }
    
     public static void muestraResultado(float area){
         System.out.println("el area es" + area);
     }
    
    /*
     public static void muestraResultado(float area, int r){
        String figura;
        if (r == 1)  {figura="cudrado";} 
        else{
            if (r == 1)  {figura="circulo";} 
            else{
                figura = "triangulo";}
    
       
        System.out.println("el area del " + figura + "es igual a:" + area);
    }
    */
    
    public static int menu (){
        int opcion;
        do{
        Scanner entrada=new Scanner (System.in);
        System.out.println("****  Calculo de areas  ****");
        System.out.println("**** Menu: ****");
        System.out.println("Introducir la opción deseada");
        System.out.println("1. Area de cuadrados");
        System.out.println("2. Area de circulos");
        System.out.println("3. Area de triangulos");
        System.out.println("0. Salir");
        opcion= entrada.nextInt();
    }while (opcion<0 && opcion > 3);
        
    
    
    return opcion;
    
}
    public static float calculaAreas(int op){
        float area;
        switch (op){
            case 1:
                area = areaCuadrado();
                break;
            case 2:
                area = areaCirculo();
                break;
            case 3:
                area = areaTriangulo();
                break;
            default:
                mensajeSalida();
                area=0
        }
    
        return area;
    }
    public static float areaCuadrado()(return(float)1.000);
     public static float areaCirculo()(return(float)1.000);
      public static float areaTriangulo()(return(float)1.000);
}

