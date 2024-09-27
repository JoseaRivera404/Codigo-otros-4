package com.generation;

import java.util.Scanner;

public class Codigo4 {
//	Se agregó el método main 
	static public void main(String[] args) {
//		Se agrega la libreria de Scanner y se agrega un input
		Scanner s = new Scanner(System.in);
		
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
// 		Se cambio jugador 1 por jugador 2	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
//	    Se agrega un input
	    Scanner s2 = new Scanner(System.in);
	    String j2 = s.nextLine();
//	    Se quitó un paréntesis y se utilizó equals
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    } else {
	    	int g = 2;
	    	switch(j1) {
	        	case "piedra":
		          if (j2.equals("tijeras")) {
		            g = 1;
		          }
//		Se agregó un break
		          break;
		        case "papel":
		          if (j2.equals("piedra")) {
		            g = 1;
//		Se cerró la llave y se agregó un break
		          }
		          break;
//		Se cambio tijera por tijeras
		        case "tijeras":
		          if (j2.equals("papel")) {
		            g = 1;
		          }
//		Se agregó un break
		          break;
		        default:
		      }
	      System.out.println("Gana el jugador " + g);
	    }
//	    Se cierran los escaners
	    s.close();
	    s2.close();
	}
}
