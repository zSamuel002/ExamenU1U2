/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1u2;
import java.util.Scanner;
/**
 *
 * @author Samuel
 */
public class ExamenU1U2 {

    public static void main(String[] args) {
        //En una tienda de videojuegos esisten 3 productos pise nombre productos + precio original el primero 30%, el segundo 65% y el tercero 15%
        // 300 x 30 / 100
        String producto1, producto2, producto3;
        Double Pproducto1, Pproducto2, Pproducto3;
        Scanner Prod = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del primer producto: ");
        producto1 = Prod.nextLine();
        System.out.print("Ingrese el precio del producto: $");
        Pproducto1 = Prod.nextDouble();
        Pproducto1 = Pproducto1  * 30 / 100;
        
        Prod.nextLine();   
        System.out.println("");
        
        System.out.print("Ingrese el nombre del segundo producto: ");
        producto2 = Prod.nextLine();
        System.out.print("Ingrese el precio del producto: $");
        Pproducto2 = Prod.nextDouble();
        Pproducto2 = Pproducto2  * 65 / 100;
        
        Prod.nextLine();
        System.out.println("");
        
        System.out.print("Ingrese el nombre del tercer producto: ");
        producto3 = Prod.nextLine();
        System.out.print("Ingrese el precio del producto: $");
        Pproducto3 = Prod.nextDouble();
        Pproducto3 = Pproducto3  * 15 / 100;       
        
        Prod.close();
        
        System.out.println("");
        
        System.out.println("El precio final de " + producto1 + " es: $" + Pproducto1);
        
        System.out.println("El precio final de " + producto2 + " es: $" + Pproducto2);
        
        System.out.println("El precio final de " + producto3 + " es: $" + Pproducto3);
        
       
        
       
       
    }
    
}
