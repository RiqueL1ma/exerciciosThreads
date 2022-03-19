package view;
import java.util.Random;

import javax.swing.JOptionPane;

import controller.Threads;

public class Principal {

	public static void main(String[] args) {
		int opc = 1;
		Random random = new Random();
		
		int [] vetor  = new int [1000];
		
		for (int i = 0; i < 1000; i++) {
				int numero = random.nextInt(100);	
				vetor[i] = numero;
			}	
		
		while (opc != 0) {
			int aux = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
			if(aux == 0) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado !!");
				opc = 0;
			} else {
				Threads m1 = new Threads(vetor, aux);
				m1.start();
			}
			
				
		
		}

	}

}
