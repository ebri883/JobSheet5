/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

import java.util.Scanner;
/**
 *
 * @author GokuJawa
 */
public class InputMismatchException {
    public static void main(String[] args) 
    {
        int a=100;
        int b=4;
        int c=2;
        
        System.out.println("Masukkan nilai a");
        Scanner console = new Scanner(System.in);
        a = console.nextInt();
     
        System.out.println("Masukkan nilai b");
	b = console.nextInt();
        System.out.println("Masukkan nilai c");
        c = console.nextInt();
        double res=b/c;
        System.out.println(" Hasilnya adalah : "+res);  
    }
}
