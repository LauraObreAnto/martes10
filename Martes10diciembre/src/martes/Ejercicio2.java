package martes;
import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista=new ArrayList<Integer>();
		lista.add(5);
		lista.add(7);
		lista.add(3);
		lista.add(2);
		int mayor=0;
		for(int i=0;i<lista.size();i++) {
			if (mayor<lista.get(i)) {
				mayor=lista.get(i);}
		}
		System.out.println(mayor);

	}
}
			
		
				
			