/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen1.impl;

/**
 *
 * @author Giovanni Cordón
 */
public class  Monstruo 
{
	private String Nombre = "";
	private String ElementoPrimario = "";
	private String Edad="";
	private String Color="";
	private String AbilidadEspecial = "";
	
	public String Agigantarse()
	{
		return "Agigantadome";
	}
	public String CaminarLento()
	{
		return"Caminando lento";
	}
	public String Golpear() 
	{
	   return "Golpeando";	
	}
	
	public String AbilidadEspecial()
	{
		if(ElementoPrimario == "aire")
		{
			AbilidadEspecial = "volar";
		}
		else if(ElementoPrimario == "fuego")
		{
			AbilidadEspecial = "quemar";
		}
		return AbilidadEspecial;
	}
	
	public void SetAtributos(String nombre, String elemento, String edad, String color)
	{
		this.Nombre = nombre;
		this.ElementoPrimario = elemento;
		this.Edad = edad;
		this.Color = color;
	}
	
	public String Desapilar_Mostrar()
	{
		return "Soy " + Nombre +"soy de tipo " + ElementoPrimario + "tengo " + Edad + "años " + "y soy de color " + Color ;
	}
	
    
}
