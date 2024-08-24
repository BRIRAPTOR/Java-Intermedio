package cadenas;

import java.util.Scanner;

/**
 * @author brian
 */
public class GenerarCURP {

    public static void generarCURP() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Generador de CURP");

        System.out.print("Ingresa el apellido paterno: ");
        String apellidoPaterno = entrada.nextLine().toUpperCase();

        System.out.print("Ingresa el apellido materno: ");
        String apellidoMaterno = entrada.nextLine().toUpperCase();

        System.out.print("Ingresa el primer nombre: ");
        String primerNombre = entrada.nextLine().toUpperCase();

        System.out.print("Ingresa la fecha de nacimiento (formato AAAA-MM-DD): ");
        String fechaNacimiento = entrada.nextLine();

        System.out.print("Ingresa el sexo (Hombre o Mujer): ");
        String sexo = entrada.nextLine().toUpperCase();

        System.out.print("Ingresa el estado de nacimiento (por ejemplo, DISTRITO FEDERAL): ");
        String estadoNacimiento = entrada.nextLine().toUpperCase();

        char letraApellidoPaterno = apellidoPaterno.charAt(0);

        String primeraVocalApellidoPaterno = encontrarPrimeraVocal(apellidoPaterno);

        char letraApellidoMaterno = apellidoMaterno.charAt(0);

        char letraPrimerNombre = primerNombre.charAt(0);

        String añoNacimiento = fechaNacimiento.substring(2, 4);

        String mesNacimiento = fechaNacimiento.substring(5, 7);

        String diaNacimiento = fechaNacimiento.substring(8, 10);

        String claveSexo = (sexo.equals("HOMBRE")) ? "H" : "M";

        String claveEstadoNacimiento = obtenerClaveEstado(estadoNacimiento);

        // Generar la CURP
        String curp = letraApellidoPaterno + primeraVocalApellidoPaterno + letraApellidoMaterno + letraPrimerNombre
                + añoNacimiento + mesNacimiento + diaNacimiento + claveSexo + claveEstadoNacimiento;

        System.out.println("La CURP generada es: " + curp);
    }

    private static String encontrarPrimeraVocal(String texto) {
        String vocales = "AEIOU";
        for (char letra : texto.toCharArray()) {
            if (vocales.indexOf(letra) != -1) {
                return String.valueOf(letra);
            }
        }
        return "";
    }

    private static String obtenerClaveEstado(String estado) {
        String[] palabras = estado.split(" ");
        String clave = "";
        for (String palabra : palabras) {
            if (palabra.length() > 1) {
                clave += palabra.charAt(0);
            }
        }
        return clave;
    }
}
