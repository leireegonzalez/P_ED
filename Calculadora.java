
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

}
