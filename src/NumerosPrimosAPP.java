import javax.swing.JOptionPane;

public class NumerosPrimosAPP {

	public static void main(String[] args) {

		// ABREVIA EL PARSE INT
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe un primer numero"));

		System.out.println(comprovarPrimos(numero1));
	}

	public static boolean comprovarPrimos(int numero1) {
		if (numero1 <= 1) {
			return false;
		}
		for (int i = 2; i <= (numero1) / 2; i++) { // I = 2 XK X 1 TODOS SE DIVIDEN Y / 2 X SI LA MITAD DA DECIMAL
			if (numero1 % i == 0) {
				return false; // RETURN = APAGA Y VAMONOS
			}

		}
		return true;
	}

}
