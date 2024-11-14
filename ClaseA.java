import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClaseA {

    private boolean encendido;
    private int temperatura;
    private boolean modoAutomatico;
    private int nivelVentilacion;
    private String direccionFlujo;
    private boolean circulacionInterna;
    private int calefaccionAsientos;
    private String calefaccionVolante;
    private boolean calefaccionRapida;
    private boolean desempañador;
    private boolean ionizador;
    private List<String> perfiles;
    private List<String> historialMantenimiento;

    // Constructor sin parámetros
    public ClaseA() {
        this.encendido = false;
        this.temperatura = 22;  // Temperatura predeterminada
        this.modoAutomatico = false;
        this.nivelVentilacion = 3;  // Nivel de ventilación predeterminado
        this.direccionFlujo = "Frontal";  // Dirección de flujo predeterminada
        this.circulacionInterna = false;
        this.calefaccionAsientos = 0;
        this.calefaccionVolante = "Desactivada";
        this.calefaccionRapida = false;
        this.desempañador = false;
        this.ionizador = false;
        this.perfiles = new ArrayList<>();
        this.historialMantenimiento = new ArrayList<>();
    }

    // Métodos de la clase

    public void encender() {
        encendido = true;
        System.out.println("Climatización encendida.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("Climatización apagada.");
    }

    public void ajustarTemperatura(int incremento) {
        temperatura += incremento;
        System.out.println("Temperatura ajustada a: " + temperatura + "°C.");
    }

    public void activarModoAutomatico() {
        modoAutomatico = true;
        System.out.println("Modo automático activado.");
    }

    public void ajustarNivelVentilacion(int nivel) {
        nivelVentilacion = nivel;
        System.out.println("Nivel de ventilación ajustado a: " + nivelVentilacion);
    }

    public void cambiarDireccionFlujo(String direccion) {
        direccionFlujo = direccion;
        System.out.println("Dirección de flujo cambiada a: " + direccionFlujo);
    }

    public void activarCirculacionInterna() {
        circulacionInterna = true;
        System.out.println("Circulación interna activada.");
    }

    public void ajustarCalefaccionAsientos(int nivel) {
        calefaccionAsientos = nivel;
        System.out.println("Calefacción en asientos ajustada al nivel: " + calefaccionAsientos);
    }

    public void activarCalefaccionVolante(String nivel) {
        calefaccionVolante = nivel;
        System.out.println("Calefacción del volante activada al nivel: " + calefaccionVolante);
    }

    public void activarCalefaccionRapida() {
        calefaccionRapida = true;
        System.out.println("Calefacción rápida activada.");
    }

    public void activarDesempañador() {
        desempañador = true;
        System.out.println("Desempañador activado.");
    }

    public void activarIonizador() {
        ionizador = true;
        System.out.println("Ionizador activado.");
    }

    public void autoIonizador(String nivel) {
        System.out.println("Ionizador ajustado automáticamente al nivel: " + nivel);
    }

    public void ajustarIonizador(String nivel) {
        System.out.println("Ionizador ajustado al nivel: " + nivel);
    }

    public void crearPerfil(String nombre) {
        perfiles.add(nombre);
        System.out.println("Perfil creado: " + nombre);
    }

    public String cicloIonizador() {
        System.out.println("Aumentando la ventilación...");
        return "Calidad del aire mejorada.";
    }

    public void autoLimpiezaIonizador() {
        System.out.println("Limpieza automática del ionizador activada.");
    }

    public void reduceIonizador() {
        System.out.println("Ionizador reducido para ahorrar energía.");
    }

    public void editarPerfil(String nombre) {
        if (perfiles.contains(nombre)) {
            System.out.println("Perfil " + nombre + " editado.");
        } else {
            System.out.println("Perfil no encontrado.");
        }
    }

    public void elegirPerfil(String nombre) {
        if (perfiles.contains(nombre)) {
            System.out.println("Perfil " + nombre + " seleccionado.");
        } else {
            System.out.println("Perfil no encontrado.");
        }
    }

    public boolean mantenimiento() {
        System.out.println("Realizando revisión de mantenimiento...");
        return true; // Suponemos que siempre necesita mantenimiento
    }

    public String historialMantenimiento() {
        return "Historial de mantenimiento: " + historialMantenimiento;
    }

    public void programarMantenimiento(Date fecha) {
        historialMantenimiento.add("Mantenimiento programado para: " + fecha.toString());
        System.out.println("Mantenimiento programado para: " + fecha.toString());
    }
}

