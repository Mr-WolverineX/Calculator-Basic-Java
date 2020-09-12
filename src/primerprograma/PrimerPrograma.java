
package primerprograma;

import java.util.Scanner;


public class PrimerPrograma {

    public static void main(String[] args) {
        
        
        
        Scanner sc = new Scanner (System.in);
        
        int valor1, valor2,totalsuma,totalresta,totalmulti,totaldivi;
        char suma, resta, multiplicacion, divicion,operacion;
        
//        suma = " ( Ingrese 1 para [+] )  ";
//        resta = " ( Ingrese 2 para [-] ) ";
//        multiplicacion = " ( Ingrese 3 para [*] ) ";
//        divicion = " ( Ingrese 4 para [/] ) ";

        suma = '+';
        resta = '-';
        multiplicacion = '*';
        divicion = '/';
        
        
        
        System.out.println(" Ingrese el primer valor ");
        valor1 = sc.nextInt();
        
        System.out.println(" Ingrese el segundo valor ");
        valor2 = sc.nextInt();
        
        
        
        
        
        System.out.println(" Escoja la operacion a realizar "); 
        System.out.println(" ( Suma [+] ) ( Resta [-] ) ( Multiplicación [*] ) ( Divición [/]  ) ");
        
        operacion = sc.next().charAt(0);  // .charAt(0) devuelve el 1er valor y .charAt(1) devuelve el segundo valor y asi susesivamente
        
      
        
            
        while (!(operacion == suma || operacion == resta || operacion == multiplicacion || operacion == divicion)){
    
                System.out.println(" Error... solo simbolos Matematicos ");
                operacion = sc.next().charAt(0);
        }
        
        
        
        if (operacion == suma){
            totalsuma = valor1 + valor2;
            System.out.println(" El total de la suma es: " + totalsuma);
        }
        
        if (operacion == resta){
                totalresta = valor1 - valor2;
                System.out.println(" El total de la resta es: " + totalresta );
        }        
       
        if (operacion == multiplicacion){
                totalmulti = valor1 * valor2;
                System.out.println(" El total de la multiplicacion es: " + totalmulti );
        }
        
        if (operacion == divicion){
            
            
            while (valor2 == 0){
    
            System.out.println(" Error... El denominador no puede tener 0 ");
            valor2 = sc.nextInt();
        }
            
                totaldivi = valor1 / valor2;
                System.out.println(" El total de la divicion es: " + (float) totaldivi );
        }
        
        }
        
        
    }
    

