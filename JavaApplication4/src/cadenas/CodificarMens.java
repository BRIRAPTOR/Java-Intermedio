package cadenas;

import java.util.Scanner;

/**
 * @author brian
 */
public class CodificarMens {

    public static void codificar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el mensaje a codificar:");
        String mensaje = scanner.nextLine();
        String mensajeCodificado = codificarMensaje(mensaje);

        System.out.println("Mensaje codificado: " + mensajeCodificado);
    }

    private static String codificarMensaje(String mensaje) {
        //mensaje a mayúsculas
        mensaje = mensaje.toUpperCase();

        StringBuilder mensajeCodificado = new StringBuilder();

        for (char caracter : mensaje.toCharArray()) {
            if (Character.isLetter(caracter)) {

                if (caracter == 'Z') {
                    mensajeCodificado.append('A');
                } else {
                    char letraCodificada = (char) (caracter + 1);
                    mensajeCodificado.append(letraCodificada);
                }
            } else if (Character.isDigit(caracter)) {

                if (caracter == '9') {
                    mensajeCodificado.append('0');
                } else {
                    char digitoCodificado = (char) (caracter + 1);
                    mensajeCodificado.append(digitoCodificado);
                }
            } else {
                //otros caracteres sin cambios
                mensajeCodificado.append(caracter);
            }
        }

        return mensajeCodificado.toString();
    }
}
