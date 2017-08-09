/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.pkg5;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Proyecto15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char opc = 'x';
        Scanner Nez = new Scanner(System.in);
        DB obj = new DB();
        do
        {
            System.out.println("Que desea hacer?");
            System.out.println("a = normal a binario");
            System.out.println("b = binario a normal");
            System.out.println("z = salir");
            opc = Nez.next().charAt(0);
            switch(opc)
            {
                case 'a':
                    obj.db();
                    break;
                case 'b':
                    obj.bd();
            }
        }while(opc !=  'z');
         
    }
    
}
