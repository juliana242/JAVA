import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String razonSocial;
    private String cuit;

    // Relación con Incidentes
    @OneToMany(mappedBy = "cliente")
    private List<Incidente> incidentes;

    // Getters y setters
}

@Entity
public class Técnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    // Relación con Incidentes
    @OneToMany(mappedBy = "técnicoAsignado")
    private List<Incidente> incidentes;

    // Otros atributos y métodos según necesidades
}

@Entity
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    private String servicio;
    private String descripcionProblema;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Técnico técnicoAsignado;

    private boolean resuelto;
    private int tiempoEstimado;

    // Otros atributos y métodos según necesidades
}
