/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lsosab.a07;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPP2LSosaBA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dato;
        String[] num= {pedirD("1"),pedirD("2"),pedirD("3"),pedirD("4"),pedirD("5"),pedirD("6"),pedirD("7"),pedirD("8"),pedirD("9"),pedirD("10")};
        for(int i=0; i<num.length;i++){ System.out.println(num[impD()]);}
    }
    
static String pedirD(String dato){
    Scanner te= new Scanner(System.in);
      System.out.println("Ingresa el numero de telefono de la persona "+  dato);
      String pos;
      pos= te.nextLine();
      
      return pos;
}
static int impD(){
    Scanner te=new Scanner(System.in);
    System.out.println("Ingrese el número persona que quiere consultar (menos 1)");
    int posi;
    posi= te.nextInt();
    while (posi<0 || posi>9) {
			System.out.println("Posición no encontrada, ingrese un numero entre 0 y 9");
			posi = te.nextInt();
			}
    return posi;
    
}



}
 


    
    



