import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClaseA climatizador = new ClaseA();
        boolean salir = false;

        while (!salir) {
            // Menú interactivo
            System.out.println("\n---- Menú de Opciones ----");
            System.out.println("1. Encender");
            System.out.println("2. Apagar");
            System.out.println("3. Ajustar temperatura");
            System.out.println("4. Activar modo automático");
            System.out.println("5. Ajustar nivel de ventilación");
            System.out.println("6. Cambiar dirección de flujo");
            System.out.println("7. Activar circulación interna");
            System.out.println("8. Ajustar calefacción en asientos");
            System.out.println("9. Activar calefacción del volante");
            System.out.println("10. Activar calefacción rápida");
            System.out.println("11. Activar desempañador");
            System.out.println("12. Activar ionizador");
            System.out.println("13. Ajustar ionizador");
            System.out.println("14. Crear perfil");
            System.out.println("15. Elegir perfil");
            System.out.println("16. Ver historial de mantenimiento");
            System.out.println("17. Programar mantenimiento");
            System.out.println("18. Salir");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    climatizador.encender();
                    break;
                case 2:
                    climatizador.apagar();
                    break;
                case 3:
                    System.out.print("Ingrese incremento de temperatura: ");
                    int incremento = scanner.nextInt();
                    climatizador.ajustarTemperatura(incremento);
                    break;
                case 4:
                    climatizador.activarModoAutomatico();
                    break;
                case 5:
                    System.out.print("Ingrese nivel de ventilación (1-5): ");
                    int nivelVentilacion = scanner.nextInt();
                    climatizador.ajustarNivelVentilacion(nivelVentilacion);
                    break;
                case 6:
                    System.out.print("Ingrese dirección del flujo de aire: ");
                    String direccion = scanner.nextLine();
                    climatizador.cambiarDireccionFlujo(direccion);
                    break;
                case 7:
                    climatizador.activarCirculacionInterna();
                    break;
                case 8:
                    System.out.print("Ingrese nivel de calefacción de asientos: ");
                    int calefaccion = scanner.nextInt();
                    climatizador.ajustarCalefaccionAsientos(calefaccion);
                    break;
                case 9:
                    System.out.print("Ingrese nivel de calefacción del volante: ");
                    String nivelVolante = scanner.nextLine();
                    climatizador.activarCalefaccionVolante(nivelVolante);
                    break;
                case 10:
                    climatizador.activarCalefaccionRapida();
                    break;
                case 11:
                    climatizador.activarDesempañador();
                    break;
                case 12:
                    climatizador.activarIonizador();
                    break;
                case 13:
                    System.out.print("Ingrese nivel de ionizador: ");
                    String nivelIonizador = scanner.nextLine();
                    climatizador.ajustarIonizador(nivelIonizador);
                    break;
                case 14:
                    System.out.print("Ingrese nombre del perfil: ");
                    String perfil = scanner.nextLine();
                    climatizador.crearPerfil(perfil);
                    break;
                case 15:
                    System.out.print("Ingrese nombre del perfil a elegir: ");
                    String perfilElegir = scanner.nextLine();
                    climatizador.elegirPerfil(perfilElegir);
                    break;
                case 16:
                    System.out.println(climatizador.historialMantenimiento());
                    break;
                case 17:
                    System.out.print("Ingrese fecha de mantenimiento (formato: YYYY-MM-DD): ");
                    String fechaStr = scanner.nextLine();
                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

                    try {
                        Date fecha = formato.parse(fechaStr);
                        climatizador.programarMantenimiento(fecha);
                    } catch (Exception e) {
                        System.out.println("Fecha inválida. Asegúrese de usar el formato correcto.");
                    }
                    break;
                case 18:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}