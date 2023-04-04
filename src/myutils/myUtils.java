package myutils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class myUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String invertir(String cadena) {
        //Como se invierte una cadena?
        String resultado = "";
        if (cadena == null) {
            return null;
        }
        for (int i = 0; i < cadena.length(); i++) {

            resultado += cadena.charAt(cadena.length() - i - 1);

        }

        return resultado;

    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edad(int dia, int mes, int anyo) {
        int resultado = 0;

        if (dia > 31) {
            resultado = -2;
        } else if (mes > 12) {
            resultado = -2;
        } else if (anyo > 2023) {
            resultado = -2;
        }

        if (resultado != -2) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            String fechaActual = dtf.format(LocalDateTime.now());

            int anyoActual = Integer.parseInt(fechaActual.substring(0, 4));
            int mesActual = Integer.parseInt(fechaActual.substring(5, 7));
            int diaActual = Integer.parseInt(fechaActual.substring(8, 10));

            int edad = anyoActual - anyo;

            if (mesActual >= mes) {
                if (diaActual > dia) {
                } else {
                    edad--;
                }
            } else {
                edad--;
            }
            if (edad > 150) {
                resultado = -1;
            } else {
                resultado = edad;
            }
        }

        return resultado;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {

        if (numero == 0) {
            return 1;
        } else {
            if (numero < 0) {
                return -1;
            } else {
                int factorial = 1;
                for (int i = 2; i <= numero; i++) {
                    factorial *= i;
                }
                double resultado = factorial;
                return resultado;
            }

        }
    }
}
