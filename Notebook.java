package Heranca;

public class Notebook implements Dispositivo{

    private String modelo;
    private int bateria;
    private boolean conectado;

    public Notebook(String modelo, int bateria, boolean conectado) {

        setModelo(modelo);
        setBateria(bateria);
        setConectado(conectado);
    }
	
	@Override
	public boolean ligar() {
		return conectado == true || bateria > 10;
	}

	@Override
	public boolean desligar() {
		return ligar() == true;
	}

	@Override
	public String obterStatus() {
		return "Notebook: " + "\nModelo: " + modelo + "\nBateria: " + bateria + "\nConectado: " + conectado;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Modelo Invalido!!!");
		}
		this.modelo = modelo;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		if (bateria < 0 || bateria > 100) {
			throw new IllegalArgumentException("Bateria Invalida!!!");
		}
		this.bateria = bateria;
	}

	public boolean isConectado() {
		return conectado;
	}

	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}
	
}
