// Main.java (puedes tener múltiples clases según la estructura de tu proyecto)
public class Main {
    public static void main(String[] args) {
        // Aquí puedes realizar instancias de tus clases y probar la funcionalidad
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

        // Asignar técnico, calcular tiempo estimado, etc.

        // Puedes continuar desarrollando tu lógica aquí
    }
}
