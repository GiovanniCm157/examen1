package gt.edu.url.examen1.api;

public class List
{
	private String[] Datos = new String[3];
	int size = 3;
	
	public void agregar(String ganador)
	{
		for(int i = 0;i < size;i++)
		{
			if(Datos[i]== "")
			{
				Datos[i] = ganador;
			}			
		}
		
	}
	
	public int Size()
	{
		return Datos.length;
	}
	
	public String VerElemento(int i)
	{
		return Datos[i];
	}
	


}
