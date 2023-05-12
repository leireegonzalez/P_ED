
public class Calculadora {

	int num1;

	int num2;

	public Calculadora(int a, int b) {

		num1 = a;

		num2 = b;

	}

	public int multiplica() {

		int resul = num1 * num2;

		return resul;

	}

	public int divide() {

		int resul = num1 / num2;

		return resul;

	}

	public int suma() {

		int resul = num1 + num2;

		return resul;

	}

	public int resta() {

		int resul = num1 - num2;

		return resul;

	}

	public int suma2() {
		int suma2 = num2 + num1;
		return suma2;
	}

	public int resta2() {
		int resta2 = num2 - num1;
		return resta2;
	}

	public int division2() {
		int division2 = num2 / num1;
		return division2;
	}
}
