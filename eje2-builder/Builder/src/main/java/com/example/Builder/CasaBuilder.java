package com.example.Builder;

public class CasaBuilder implements CasaBuilderInt {

	//instancia de la clase casa
	private Casa casa;
	
	
	//Contructor de CasaBuilder
	public CasaBuilder() {
		this.reset();
	}


	//Contructor de instancia Casa
	@Override
	public Casa build() {
		Casa instan = this.casa;
		this.reset();
		return instan;
	}
	
	
	//Resetea las propiedades de la instancia casa
	@Override
	public CasaBuilderInt reset() {
		
		this.casa = new Casa();
		return this;
	}

	
	//Metodos de builder 
	
	@Override
	public CasaBuilderInt setNumeroPlantas(Integer numero_de_plantas) {
		this.casa.setNumeroPlantas(numero_de_plantas);
		return this;
		
	}


	@Override
	public CasaBuilderInt setNuemeroDormitorios(Integer numero_de_dormitorios) {
	
		this.casa.setNumeroDormitorios(numero_de_dormitorios);
		return this;
		
	}


	@Override
	public CasaBuilderInt setTipo(String tipo) {
		
		this.casa.setTipo(tipo);
		return this;
	}

	@Override
	public CasaBuilderInt setNumeroBaños(Integer numero_de_baños) {
		this.casa.setNumeroBaños(numero_de_baños);
		return this;
	}


	@Override
	public CasaBuilderInt setTieneCochera(boolean tiene_cochera) {
		
		this.casa.setTieneCochera(tiene_cochera);
		return this;
	}



	@Override
	public CasaBuilderInt setColorFachada(String color_de_fachada) {
		
		this.casa.setColorFachada(color_de_fachada);
		return this;
	}



	
	

}
