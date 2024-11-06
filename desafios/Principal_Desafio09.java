package AVformativa.desafios;

public class Principal_Desafio09 {

	public static void main(String[] args) {


		Motor_Desafio09 motor = new Motor_Desafio09("V10");
		Carro_Desafio09 carro = new Carro_Desafio09("Mercedes", motor);

		System.out.println("O Carro é: " + carro.getModelo() + "\nMotor: " + motor.getTipo());

	}



}

