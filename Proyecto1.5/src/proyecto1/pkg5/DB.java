/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.pkg5;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class DB {
    void db()
    {
        int numero, exp, digito;
        double binario;
        Scanner sc = new Scanner(System.in);

        do{  
            System.out.print("Introduce un numero entero >= 0: ");
            numero = sc.nextInt();
        }while(numero<0);

        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;            
                binario = binario + digito * Math.pow(10, exp);   
                exp++;
                numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);
    }
    void bd()
    {
         int exponente;
     boolean esBinario;
        long numero, aux, digito, decimal;
     Scanner sc = new Scanner(System.in);
     do {
          System.out.print("Introduce un numero binario: ");
          numero = sc.nextLong();
          //comprobamos que sea un número binario es decir
          //que este formado solo por ceros y unos
          esBinario = true;
          aux = numero;
          while (aux != 0) {
                     digito = aux % 10; //última cifra del números
                     if (digito != 0 && digito != 1) { //si no es 0 ó 1
                          esBinario = false; //no es un número binario
                     }
                     aux = aux / 10; //quitamos la última cifra para repetir el proceso
           }
      } while (!esBinario); //se vuelve a pedir si no es binario

      //proceso para pasar de binario a decimal
      exponente = 0;
      decimal = 0; //será el equivalente en base decimal
      while (numero != 0) {
                //se toma la última cifra
                digito = numero % 10;
                //se multiplica por la potencia de 2 correspondiente y se suma al número
                decimal = decimal + digito * (int) Math.pow(2, exponente);
                //se aumenta el exponente
                exponente++;
                //se quita la última cifra para repetir el proceso
                numero = numero / 10;
      }
      System.out.println("Decimal: " + decimal);
    }
}
