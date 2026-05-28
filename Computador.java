package Heranca;

public class Computador implements Dispositivo{
	
    private String modelo;
    private boolean conectado;

    public Computador(String modelo, boolean conectado) {
        setModelo(modelo);
        setConectado(conectado);
    }

	@Override
	public boolean ligar() {
		return conectado == true;
	}

	@Override
	public boolean desligar() {
		return ligar() == true;
	}

	@Override
	public String obterStatus() {
		 return "Computador: " + "\nModelo: " + modelo + "\nConectado: " + conectado;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Modelo Invalido!!");
		}
		this.modelo = modelo;
	}

	public boolean isConectado() {
		return conectado;
	}

	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}
	
}
