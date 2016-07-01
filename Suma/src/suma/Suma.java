/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package suma;

import java.util.Scanner;

/**
 *
 * @author andres
 */
public class Suma {
    public static void main(String[] arg){
        Scanner l= new Scanner(System.in);
	//Comentario

        int a;
        int b;
        int c;
        int d;
        int h;
        System.out.println("Ingrese un numero");
        a=l.nextInt();
        System.out.println("Ingrese un numeroh");
        b=l.nextInt();
        c=a+b;
        d=a-b;
        System.out.println("La suma es: gmlk"+c);
                System.out.println("La resta es: "+d);
    }
}
