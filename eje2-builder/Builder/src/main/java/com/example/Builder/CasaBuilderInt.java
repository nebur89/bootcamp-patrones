package com.example.Builder;

public interface CasaBuilderInt {
	
	public CasaBuilderInt setNumeroPlantas(Integer numero_de_plantas);
	public CasaBuilderInt setNuemeroDormitorios(Integer numero_de_dormitorios);
	public CasaBuilderInt setTipo(String tipo);
	public CasaBuilderInt setNumeroBaños(Integer numero_de_baños);
	public CasaBuilderInt setTieneCochera(boolean tiene_cochera);
	public CasaBuilderInt setColorFachada(String color_de_fachada);	
	public CasaBuilderInt reset();
	public Casa build();

}
