package model;

public class Carro extends Veiculo {

	public Carro(String modelo, int ano, String placa) {
		super(modelo, ano, placa);
		
	}

	@Override
	public void acelerar() {
		System.out.println("vou acelerar o carro no p�");
		
		
		
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", ano=" + ano + ", placa=" + placa + "]";
	}
	
	

}
