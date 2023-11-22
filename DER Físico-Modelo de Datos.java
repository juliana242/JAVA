// Cliente.java
public class Cliente {
    private String razonSocial;
    private String cuit;
    // Otros atributos y métodos según necesidades
}

// Técnico.java
public class Técnico {
    private String nombre;
    private List<String> especialidades;
    // Otros atributos y métodos según necesidades
}

// Incidente.java
public class Incidente {
    private Cliente cliente;
    private String servicio;
    private String descripcionProblema;
    private Técnico técnicoAsignado;
    private boolean resuelto;
    // Otros atributos y métodos según necesidades
}
