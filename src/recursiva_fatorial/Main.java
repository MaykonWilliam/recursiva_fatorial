package recursiva_fatorial;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String input;
		int numero = -1;

		//Recebe o valor a ser fatorado e verifica se esta dentro do limite permitido.
        while(numero < 0 || numero > 12) {
        	input = JOptionPane.showInputDialog("Digite um número de 0 a 12:");
            numero = Integer.parseInt(input);
            
            if (numero < 0 || numero > 12) {
                JOptionPane.showMessageDialog(null, "Número inválido");
            }    
        }
         
        int resultado = Fatorial.fatorar(numero);
        JOptionPane.showMessageDialog(null, "O fatorial de " + numero + " é: " + resultado);
        
	}

}
