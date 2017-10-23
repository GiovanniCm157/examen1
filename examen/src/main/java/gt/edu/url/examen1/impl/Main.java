package gt.edu.url.examen1.impl;
import java.util.Scanner;

import gt.edu.url.examen1.api.Jugadores_Tenis;
import gt.edu.url.examen1.api.NumerosPi;

/**
 *
 * @author tuxtor
 */
public class Main {
    
    public static void main(String[] args) {
    	
        System.out.println("Examen 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Pi");
        System.out.println("2.Tennis");
        System.out.println("3.Power Ranger");
        String opcion = "";
        opcion = sc.nextLine();
        switch(opcion) 
        {
        case"1":
        {
        	NumerosPi miCalculo = new NumerosPi();
        	System.out.println("Numero es");
    		System.out.println(miCalculo.calcularPi(0));
        	
        	break;
        }
        case"2":
        {
        	Jugadores_Tenis jugadores = new Jugadores_Tenis();
        	int juegosGanadosA;
        	int juegosGanadosB;
        	System.out.println("Ingresar los juegos ganados de A");
        	juegosGanadosA= sc.nextInt();
        	System.out.println("Ingresar los juegos ganados de B");
        	juegosGanadosB = sc.nextInt();
        	String GanadorSet;
        	GanadorSet = jugadores.calcularGanador(juegosGanadosA, juegosGanadosB);
        	System.out.println(GanadorSet);
        	System.out.println("El Campeon es:");
        	System.out.println(jugadores.calcularCampeon());
        	opcion= sc.nextLine();
        	System.out.println("Desea recordal el ganador de algun juego?");
        	opcion = sc.nextLine();
        	if(opcion == "si")
        	{
        		System.out.println("Ingrese el numero de juego que desea recordar");
        		int juego;
        		juego = sc.nextInt();
        		System.out.println("El ganador del juego" + juego + "es:");
        		System.out.println(jugadores.recordarGanador(juego));
        	}
        	
        	
        	break;
        }
        case"3":
        {
        	Monstruo[] PilaMonstruos = new Monstruo[5];
        	for(int i = 0; i < PilaMonstruos.length; i++)
        	{
        		String nombre;
        		String elemento;
        		String edad;
        		String color;
        		System.out.println("Porfavor Ingrese el nombre del monstruo");
        		nombre = sc.nextLine();
        		System.out.println("Porfavor Ingrese el elemento del monstruo");
        		elemento = sc.nextLine();
        		System.out.println("Porfavor Ingrese la edad del monstruo");
        		edad = sc.nextLine();
        		System.out.println("Porfavor Ingrese el color del monstruo");
        		color = sc.nextLine();
        		PilaMonstruos[i].SetAtributos(nombre, elemento, edad, color);
        	}
        	
        	System.out.println("Ingrese el Monstruo que quiera desapilar y mostrar");
        	int MonstruoMostrar;
        	MonstruoMostrar = sc.nextInt();
        	System.out.println(PilaMonstruos[MonstruoMostrar].Desapilar_Mostrar());        	
        	break;
        }
        
        }
    }
    
    
}
    
        
