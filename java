// Clase Persona
public class Persona {
    protected int edad;
    protected String nombre;
    protected String telefono;
    
    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}

// Clase Cliente que hereda de Persona
public class Cliente extends Persona {
    private double credito;
    
    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }
    
    public double getCredito() {
        return credito;
    }
}

// Clase Trabajador que hereda de Persona
public class Trabajador extends Persona {
    private double salario;
    
    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
}

// Crear objeto de la clase Cliente
Cliente cliente = new Cliente(35, "Juan", "1234567890", 5000.0);
System.out.println("Edad: " + cliente.edad);
System.out.println("Nombre: " + cliente.nombre);
System.out.println("Teléfono: " + cliente.telefono);
System.out.println("Crédito: " + cliente.getCredito());

// Crear objeto de la clase Trabajador
Trabajador trabajador = new Trabajador(28, "María", "0987654321", 20000.0);
System.out.println("Edad: " + trabajador.edad);
System.out.println("Nombre: " + trabajador.nombre);
System.out.println("Teléfono: " + trabajador.telefono);
System.out.println("Salario: " + trabajador.getSalario());
