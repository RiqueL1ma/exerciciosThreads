package view;

import javax.swing.JOptionPane; 

import controller.Threads;

public class Principal {

	public static void main(String[] args) {
		double percurso = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do percurso: "));
		
		for(int idfrog = 0; idfrog < 5; idfrog++) {
				Threads m = new Threads(idfrog, percurso);
				m.start();
			}
			
				
		
		}

	}
