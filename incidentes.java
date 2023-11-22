import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cliente, técnico e incidente
        Cliente cliente = new Cliente();
        cliente.setRazonSocial("Empresa XYZ");
        cliente.setCuit("123456789");

        Técnico técnico = new Técnico();
        técnico.setNombre("Juan Técnico");
        técnico.setEspecialidades(Arrays.asList("SAP", "Windows"));

        Incidente incidente = new Incidente();
        incidente.setCliente(cliente);
        incidente.setServicio("SAP");
        incidente.setDescripcionProblema("Problema con SAP");

        // Asignar técnico y calcular tiempo estimado
        asignarTécnico(incidente, técnico);
        calcularTiempoEstimado(incidente);

        // Confirmar incidente y enviar notificación al técnico
        confirmarIncidente(incidente);

        // Resolver incidente y notificar al cliente
        resolverIncidente(incidente);

        // Puedes continuar desarrollando tu lógica aquí
    }

    // Método para asignar un técnico al incidente
    private static void asignarTécnico(Incidente incidente, Técnico técnico) {
        incidente.setTécnicoAsignado(técnico);
        System.out.println("Técnico asignado: " + técnico.getNombre());
    }

    // Método para calcular el tiempo estimado de resolución (simulado)
    private static void calcularTiempoEstimado(Incidente incidente) {
        // Lógica para calcular tiempo estimado (puede variar según tus necesidades)
        int tiempoEstimado = 3; // Ejemplo: 3 horas
        incidente.setTiempoEstimado(tiempoEstimado);
        System.out.println("Tiempo estimado de resolución: " + tiempoEstimado + " horas");
    }

    // Método para confirmar un incidente y enviar notificación al técnico
    private static void confirmarIncidente(Incidente incidente) {
        System.out.println("Incidente confirmado. Notificando al técnico...");
        notificarTécnico(incidente.getTécnicoAsignado(), "Nuevo incidente asignado");
    }

    // Método para resolver un incidente y notificar al cliente
    private static void resolverIncidente(Incidente incidente) {
        System.out.println("Incidente resuelto. Notificando al cliente...");
        notificarCliente(incidente.getCliente(), "Su incidente ha sido resuelto");
        incidente.setResuelto(true);
    }

    // Métodos simulados de notificación (pueden variar según la implementación real)
    private static void notificarTécnico(Técnico técnico, String mensaje) {
        System.out.println("Notificando al técnico (" + técn
