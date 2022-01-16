import javax.swing.JOptionPane;
public class NumerosPrimosAPP {

	public static void main(String[] args) {
		String texto=JOptionPane.showInputDialog("Introduce un numero");
		int numero=Integer.parseInt(texto);
		if (primo(numero)) {
			System.out.println("El numero "+numero+" es primo");
		}else {
			System.out.println("El numero "+numero+" NO es primo");
		}
	}
	public static boolean primo (int numero) {
		if (numero<=1) {
			return false;
		}
		int cont=0;
		for (int divisor=(int)Math.sqrt(numero);divisor>1;divisor--) {
			if (numero%divisor==0) {
				cont+=1;
			}
		}
		if (cont>=1) {
			return false;
		}else {
			return true;
		}
	}
}
