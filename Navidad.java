import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Navidad {
	
	
	public static void main(String[] args) {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();  
		String fraseNoCifrada = null;

		do{
			try {
				
				fraseNoCifrada = bi.readLine();
		    	switch(fraseNoCifrada.charAt(0)){
			    	case ' ':  break;
			    	default: 
				    	switch(fraseNoCifrada){
					    	case "FIN": 
					    	break;
						    default: 
						    	for (int i = 0; i < fraseNoCifrada.length(); ++i) {
						    	    char c = fraseNoCifrada.charAt(i);
						    		switch(c){
							    		case 90: sb.append((char)(65)); break;
							    		case 32: sb.append((char)c); break;
							    		default: sb.append((char)(c+1)); break;
							    		}
							    }
						    sb.append('\n'); break;
				    	}; break;
		     }
		    	
			} catch (IOException e) {
			} 
			
		}while(!fraseNoCifrada.equals("FIN"));
		
		try {
    		System.out.print(sb);
		} catch (Exception e) {

		}
		
	}
}