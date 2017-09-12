package gt.edu.url.examen1.api;

public class Jugadores_Tenis  {

	    /**
	     *Lista que almacenara al ganador o valor neutro
	     */
	    public String[] miLista = new String[6];
	    
	    
	    public String calcularGanador(int a, int b) 
	    {
	                if(a > b)
	                {
	                if(a>5 && a<8 && b<5 && b>=0){
	                    IngresarGanador("A");
	                    return "A ganó el set";
	                
	                }
	                else if(a == 7)
	                {
	                    if(b == 5 || b ==6)
	                    {
	                        IngresarGanador("A");
	                        return "A ganó el set";
	                    }
	                    else{
	                        IngresarGanador("x");
	                        return "El resultado es inválido";
	                    }
	                }
	                else if(a >= 0 && a<=5 && b >= 0 && b<=5)
	                {
	                    IngresarGanador("x");
	                    return "El set todavía no termina";
	                }
	                else
	                {
	                    IngresarGanador("x");
	                    return "El resultado es inválido";
	                }
	            
	                }
	                else if(b>a)
	                {
	                if(b>5 && b<8 && a<5 && a>=0)
	                {
	                    IngresarGanador("B");
	                    return "B ganó el set";
	                }
	                else if(b == 7)
	                {
	                    if(a == 5 || a ==6)
	                    {
	                        IngresarGanador("B");
	                        return "B ganó el set";
	                    }
	                    else{
	                        IngresarGanador("x");
	                        return "El resultado es inválido";
	                    }
	                }
	                else if(b >= 0 && b<=5 && a >= 0 && a <= 5)
	                {
	                    IngresarGanador("x");
	                    return "El set todavía no termina";
	                }
	                else{
	                    IngresarGanador("x");
	                    return "El resultado es inválido";
	                }
	                }
	                else{
	                if(a == b && a+b <= 12 && a>=0 && b>=0)
	                {
	                    IngresarGanador("x");
	                    return "El set todavía no termina";                
	                }
	                else
	                {
	                    IngresarGanador("x");
	                    return "El resultado es inválido";
	                }
	            }
	        
	        
	    }

	    public String calcularCampeon() 
	    {
	        int ganadorA=0;
	        int ganadorB = 0;
	        for(int i =0; i<miLista.length;i++){
	            if(miLista[i] == "A"){
	                ganadorA++;
	            }
	            else if(miLista[i] == "B"){
	                ganadorB++;
	            }
	        }
	        if(ganadorA > ganadorB){
	            return "Campeón A";
	        }
	        else if(ganadorB > ganadorA){
	            return "Campeón B";
	        }
	        else{
	            return "No hay ganador";
	        }
	    }

	    
	    public String recordarGanador(int juego) 
	    {
	        
	        return miLista[juego-1];
	    }
	    
	    private void IngresarGanador(String ganador)
	    {
	        for(int i =0; i<miLista.length;i++){
	            if(miLista[i] != "A" || miLista[i] != "B" || miLista[i] != "C"){
	                miLista[i] = ganador;
	                break;
	            }
	        }
	            
	    }
	}



