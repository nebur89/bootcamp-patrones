package com.example.Builder;

public class Casa {
	
	//Attributes
	private String tipo;
	private int  numeroPlantas;
	private int numeroDormitorios;
	private int numeroBaños;
	private boolean tieneCochera;
	private String colorFachada;
	
	
	
	
	//Builder
	public Casa(String tipo, int numeroPlantas, int numeroDormitorios, int numeroBaños, boolean tieneCochera,
			String colorFachada) {
		super();
		this.tipo = tipo;
		this.numeroPlantas = numeroPlantas;
		this.numeroDormitorios = numeroDormitorios;
		this.numeroBaños = numeroBaños;
		this.tieneCochera = tieneCochera;
		this.colorFachada = colorFachada;
	}
	
	public Casa() {
		
	}
	
	
	//Get And Set

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroPlantas() {
		return numeroPlantas;
	}

	public void setNumeroPlantas(int numeroPlantas) {
		this.numeroPlantas = numeroPlantas;
	}

	public int getNumeroDormitorios() {
		return numeroDormitorios;
	}

	public void setNumeroDormitorios(int numeroDormitorios) {
		this.numeroDormitorios = numeroDormitorios;
	}

	public int getNumeroBaños() {
		return numeroBaños;
	}

	public void setNumeroBaños(int numeroBaños) {
		this.numeroBaños = numeroBaños;
	}

	public boolean isTieneCochera() {
		return tieneCochera;
	}

	public void setTieneCochera(boolean tieneCochera) {
		this.tieneCochera = tieneCochera;
	}

	public String getColorFachada() {
		return colorFachada;
	}

	public void setColorFachada(String colorFachada) {
		this.colorFachada = colorFachada;
	}

	@Override
	public String toString() {
		return "Casa [tipo=" + tipo + ", numeroPlantas=" + numeroPlantas + ", numeroDormitorios=" + numeroDormitorios
				+ ", numeroBaños=" + numeroBaños + ", tieneCochera=" + tieneCochera + ", colorFachada=" + colorFachada
				+ "]";
	}

	


	
	
	
	
	
	


}
