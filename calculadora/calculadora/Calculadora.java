package calculadora;

public class Calculadora {
	
	public int sumar(int a, int b) {
		return a + b;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora calc = new Calculadora();
		System.out.println("Resultado de la suma: " +
		calc.sumar(5, 3));

	}

}
