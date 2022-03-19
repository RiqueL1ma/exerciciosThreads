package view;
import java.util.Random;
import controller.Threads;

public class Principal {

	public static void main(String[] args) {
		Random random = new Random();
		
		int [][] matriz  = new int [3][5];
		
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				int numero = random.nextInt(100);	
				matriz[i][j] = numero;
			}
			
		}
			for(int aux = 0; aux < 3; aux++) {
				Threads m = new Threads(matriz, aux);
				m.start();
			}

	}

}
