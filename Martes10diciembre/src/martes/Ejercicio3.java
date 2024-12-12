package martes;
import java.util.ArrayList;

public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<Integer> lista=new ArrayList<Integer>();
		lista.add(5);
		lista.add(7);
		lista.add(3);
		System.out.println(lista.reversed());
		for (int i=lista.size()-1;i>=0;i--) {
			
			System.out.println(lista.get(i));
			}
	}

}
