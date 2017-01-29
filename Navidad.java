import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @author David Torralbo
 * 
 * Éste es el problema resuelto "Espionaje en Navidad" -Volumen 3, número 364-
 * 
 * www.aceptaelreto.com
 */

public class Navidad {
	
	
	public static void main(String[] args) {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();  
		String fraseNoCifrada = null;

		//Recorremos el bucle mientras que la entrada de texto no sea FIN
		do{
			try {
				//volcamos en la variable fraseNoCifrada la frase que entre el usuario
				fraseNoCifrada = bi.readLine();
				
				//comprobamos el primer carácter que ha entrado el usuario
		    	switch(fraseNoCifrada.charAt(0)){
		    		//si el usuario ha entrado un espacio al principio, salimos.
			    	case ' ':  break;
			    	default: 
			    		//comprobamos la frase entrada por el usuario
				    	switch(fraseNoCifrada){
				    		//si la frase es FIN, salimos.
					    	case "FIN": break;
						    default: 
						    	//recorremos el bucle tantas veces como carácteres tenga la frase
						    	for (int i = 0; i < fraseNoCifrada.length(); ++i) {
						    		//cogemos la posición de cada carácter
						    	    char c = fraseNoCifrada.charAt(i);
						    	    
						    		switch(c){
						    			//si la letra es Z (ASCII 90), lo cambiamos por una A (ASCII 65)
							    		case 90: sb.append((char)(65)); break;
							    		//si es un espacio (ASCII 32), lo dejamos intacto
							    		case 32: sb.append((char)c); break;
							    		//sumamos un valor al carácter, de forma que mostrará el siguiente carácter ASCII
							    		default: sb.append((char)(c+1)); break;
							    		}
							    }
						    	//después de cada línea, añadimos un espacio.
						    sb.append('\n'); break;
				    	}; break;
		     }
		    	
			} catch (IOException e) {
			} 
		}while(!fraseNoCifrada.equals("FIN"));
		
		//mostramos el resultado
		try {
    		System.out.print(sb);
		} catch (Exception e) {

		}
		
	}
}
