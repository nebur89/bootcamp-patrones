package singleton;

public class Persona {


	private String nombre;
	
	private Integer edad;
	
	private static Persona persona;
	
	
    private Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Mi nombre es: " + this.nombre + "y tengo " + this.edad);
    }

    
    public static Persona getSingletonInstance(String nombre, Integer edad) {
        if (persona == null){
        	persona = new Persona(nombre, edad);
        }
        else{
            System.out.println("No se puede crear este objeto "+ nombre + " porque ya existe un objeto de la clase persona");
        }
        
        return persona;
    }


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public static Persona getPersona() {
		return persona;
	}


	public static void setPersona(Persona persona) {
		Persona.persona = persona;
	}

    
    
    
	
}
