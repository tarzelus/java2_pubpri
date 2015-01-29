//package com.zubiri.eleccionesssssssssssssssssssrethjetjmr;
import java.util.Scanner;


public class Escuela {




// se definen como privadas por que el uso de las variables solo se va haver desde esta clase
		private int idEscuela;
		private String tipoEscuela;
		private String nombreEscuela;
		private String direccionEscuela;
	
		
//--------------------id escuela--------------------------------	
		public int getIdEscuela()
		{
			return idEscuela;
		}
		
		public void  setIdEscuela(int idEscuela1)
		{
			idEscuela = idEscuela1;
		}


//--------------------tipo de escuela--------------------------------

		public String getTipoEscuela()
		{
			return tipoEscuela;
		}
		
		public void  setTipoEscuela(String tipoEscuela1)
		{
			tipoEscuela=tipoEscuela1;
		}


//---------------------nombreEscuela-------------------------------

		public String getNombreEscuela()
		{
			return nombreEscuela;
		}
		
		public void  setNombreEscuela(String nombreEscuela1)
		{
	 		nombreEscuela = nombreEscuela1;
		}

//---------------------direccionescuela-------------------------------

		public String getDireccionEscuela()
		{
			return direccionEscuela;
		}
		
		public void  setDireccionEscuela(String direccionEscuela1)
		{
	 		direccionEscuela = direccionEscuela1;
		}

		//se podra acceder desde aqui y desde las clases heredadas
		protected void imprimir() {
			System.out.print("--- Escuela: ");
	        System.out.print("\nDireccionEscuela: " + getDireccionEscuela());
	        System.out.print("\nTipo: " + getTipoEscuela());
	        System.out.print("\nNombre: " + getNombreEscuela());
	    }




	

	
}
