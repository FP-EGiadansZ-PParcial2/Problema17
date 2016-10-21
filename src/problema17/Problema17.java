/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema17;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2; //variables que guarden ambos numeros a pedir
        int r; //el mayor comun divisor 
        n1=getNum("mayor"); //obtiene el numero mayor
        n2=getNum("menor"); //obtiene el numero menor
        calcula(n1,n2); //calcula el mayor comun divisor de ambos y lo muestra
        
    }
    public static int getNum(String d){ //metodo para pedir ambos numeros por teclado
        int n;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el numero "+d);
        n=teclado.nextInt();
        return n;
    }
    public static void calcula(int numero1, int numero2){ /*Utilizamos el algoritmo
        de Euclides para calcular el Mayor comun divisor de ambos numeros y mostramos el
        resultado*/
        int r;
        r=numero1%numero2;
        if (numero2>numero1){
            System.out.println("Error, primero va el numero mayor");
            System.out.println("Correme de nuevo, esta vez con datos correctos");
        }else if (r==0){
            r=numero2;
            System.out.println("El mayor comun divisor es "+r);
        }else{
            System.out.println("El mayor comun divisor es "+r);
        }
        
    }
    
    
}
