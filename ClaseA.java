import java.util.ArrayList;
import java.util.Date;

public class ClaseA implements BMWClaseA {
    private boolean encendido = false;
    private int temperatura = 22; // Temperatura inicial
    private int nivelVentilacion = 1;
    private String direccionFlujo = "Frontal";
    private boolean circulacionInterna = false;
    private boolean calefaccionRapida = false;
    private boolean desempañador = false;
    private boolean ionizador = false;
    private ArrayList<String> historialMantenimiento = new ArrayList<>();

    @Override
    public void encender() {
        encendido = true;
    }

    @Override
    public void apagar() {
        encendido = false;
    }

    @Override
    public void ajustarTemperatura(int incremento) {
        if (encendido) {
            temperatura += incremento;
        }
    }

    @Override
    public void activarModoAutomatico() {
        if (encendido) {
            int temperaturaExterna = 30; // Ejemplo de temperatura externa
            temperatura = temperaturaExterna > 25 ? 20 : 24;
        }
    }

    @Override
    public void ajustarNivelVentilacion(int nivel) {
        if (encendido) {
            nivelVentilacion = Math.min(Math.max(nivel, 1), 5);
        }
    }

    @Override
    public void cambiarDireccionFlujo(String direccion) {
        if (encendido) {
            direccionFlujo = direccion;
        }
    }

    @Override
    public void activarCirculacionInterna() {
        if (encendido) {
            circulacionInterna = !circulacionInterna;
        }
    }

    @Override
    public void ajustarCalefaccionAsientos(int nivel) {
        if (encendido) {
            System.out.println("Calefacción en los asientos ajustada al nivel " + nivel);
        }
    }

    @Override
    public void activarCalefaccionVolante(String nivel) {
        if (encendido) {
            System.out.println("Calefacción del volante activada con nivel " + nivel);
        }
    }

    @Override
    public void activarCalefaccionRapida() {
        if (encendido) {
            calefaccionRapida = true;
        }
    }

    @Override
    public void activarDesempañador() {
        if (encendido) {
            desempañador = !desempañador;
        }
    }

    @Override
    public void activarIonizador() {
        if (encendido) {
            ionizador = !ionizador;
        }
    }

    @Override
    public void autoIonizador(String nivel) {
        if (encendido) {
            System.out.println("Ionizador automático activado con nivel " + nivel);
        }
    }

    @Override
    public void ajustarIonizador(String nivel) {
        if (encendido) {
            System.out.println("Nivel del ionizador ajustado a " + nivel);
        }
    }

    @Override
    public void crearPerfil(String nombre) {
        if (encendido) {
            System.out.println("Perfil creado: " + nombre);
        }
    }

    @Override
    public String cicloIonizador() {
        if (encendido) {
            return "Calidad del aire: Buena";
        }
        return "Ionizador apagado";
    }

    @Override
    public void autoLimpiezaIonizador() {
        if (encendido) {
            System.out.println("Limpieza automática del ionizador activada");
        }
    }

    @Override
    public void reduceIonizador() {
        if (encendido) {
            System.out.println("Intensidad del ionizador reducida para ahorrar energía");
        }
    }

    @Override
    public void crearPerfil() {
        System.out.println("Nuevo perfil creado con configuraciones actuales");
    }

    @Override
    public void editarPerfil() {
        System.out.println("Perfil editado");
    }

    @Override
    public void elegirPerfil() {
        System.out.println("Perfil seleccionado");
    }

    @Override
    public boolean mantenimiento() {
        return !historialMantenimiento.isEmpty();
    }

    @Override
    public String historialMantenimiento() {
        return historialMantenimiento.toString();
    }

    @Override
    public void programarMantenimiento(Date fecha) {
        historialMantenimiento.add("Mantenimiento programado para: " + fecha);
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getNivelVentilacion() {
        return nivelVentilacion;
    }

    public void setNivelVentilacion(int nivelVentilacion) {
        this.nivelVentilacion = nivelVentilacion;
    }

    public ArrayList<String> getHistorialMantenimiento() {
        return historialMantenimiento;
    }

    public void setHistorialMantenimiento(ArrayList<String> historialMantenimiento) {
        this.historialMantenimiento = historialMantenimiento;
    }

    public boolean isCalefaccionRapida() {
        return calefaccionRapida;
    }

    public void setCalefaccionRapida(boolean calefaccionRapida) {
        this.calefaccionRapida = calefaccionRapida;
    }

    public String getDireccionFlujo() {
        return direccionFlujo;
    }

    public void setDireccionFlujo(String direccionFlujo) {
        this.direccionFlujo = direccionFlujo;
    }
}
