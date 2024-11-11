import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClaseA climatizador = new ClaseA();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Menú de Climatización BMW ---");
            System.out.println("1. Encender el sistema");
            System.out.println("2. Apagar el sistema");
            System.out.println("3. Ajustar temperatura");
            System.out.println("4. Activar modo automático");
            System.out.println("5. Ajustar nivel de ventilación");
            System.out.println("6. Cambiar dirección del flujo de aire");
            System.out.println("7. Activar circulación interna");
            System.out.println("8. Ajustar calefacción de los asientos");
            System.out.println("9. Activar calefacción del volante");
            System.out.println("10. Activar calefacción rápida");
            System.out.println("11. Activar desempañador");
            System.out.println("12. Activar ionizador");
            System.out.println("13. Configurar perfil");
            System.out.println("14. Ver ciclo del ionizador");
            System.out.println("15. Programar mantenimiento");
            System.out.println("16. Ver historial de mantenimiento");
            System.out.println("17. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    climatizador.encender();
                    System.out.println("Sistema encendido.");
                    break;
                case 2:
                    climatizador.apagar();
                    System.out.println("Sistema apagado.");
                    break;
                case 3:
                    System.out.print("Introduce el incremento de temperatura: ");
                    int incremento = scanner.nextInt();
                    climatizador.ajustarTemperatura(incremento);
                    System.out.println("Temperatura ajustada.");
                    break;
                case 4:
                    climatizador.activarModoAutomatico();
                    System.out.println("Modo automático activado.");
                    break;
                case 5:
                    System.out.print("Introduce el nivel de ventilación (1-5): ");
                    int nivelVentilacion = scanner.nextInt();
                    climatizador.ajustarNivelVentilacion(nivelVentilacion);
                    System.out.println("Nivel de ventilación ajustado.");
                    break;
                case 6:
                    System.out.print("Introduce la dirección del flujo de aire (e.g., 'Parabrisas', 'Pies'): ");
                    String direccion = scanner.nextLine();
                    climatizador.cambiarDireccionFlujo(direccion);
                    System.out.println("Dirección del flujo de aire cambiada.");
                    break;
                case 7:
                    climatizador.activarCirculacionInterna();
                    System.out.println("Circulación interna activada.");
                    break;
                case 8:
                    System.out.print("Introduce el nivel de calefacción para los asientos (1-5): ");
                    int nivelCalefaccion = scanner.nextInt();
                    climatizador.ajustarCalefaccionAsientos(nivelCalefaccion);
                    System.out.println("Calefacción ajustada.");
                    break;
                case 9:
                    System.out.print("Introduce el nivel de calefacción del volante ('Baja', 'Media', 'Alta'): ");
                    String nivelVolante = scanner.nextLine();
                    climatizador.activarCalefaccionVolante(nivelVolante);
                    System.out.println("Calefacción del volante activada.");
                    break;
                case 10:
                    climatizador.activarCalefaccionRapida();
                    System.out.println("Calefacción rápida activada.");
                    break;
                case 11:
                    climatizador.activarDesempañador();
                    System.out.println("Desempañador activado.");
                    break;
                case 12:
                    climatizador.activarIonizador();
                    System.out.println("Ionizador activado.");
                    break;
                case 13:
                    System.out.print("Introduce el nombre del perfil: ");
                    String nombrePerfil = scanner.nextLine();
                    climatizador.crearPerfil(nombrePerfil);
                    System.out.println("Perfil creado.");
                    break;
                case 14:
                    System.out.println("Ciclo del Ionizador: " + climatizador.cicloIonizador());
                    break;
                case 15:
                    climatizador.programarMantenimiento(new Date());
                    System.out.println("Mantenimiento programado.");
                    break;
                case 16:
                    System.out.println("Historial de mantenimiento: " + climatizador.historialMantenimiento());
                    break;
                case 17:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }
}
