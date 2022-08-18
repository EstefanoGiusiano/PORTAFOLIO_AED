/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut1.ut1_pd1;
import java.lang.reflect.Field;

/**
 *
 * @author Administrador
 */
public class Alumno {

    private String nombre = "";

    public Alumno() {
        this.nombre = nombre; // El nombre no puede ser null ya que no se puede concatenar
    }

    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }

    
//} Esta llave no cierra acá ya que no pueden existir métodos por fuera de la clase.
public static int recorrer (String cadena) {
int res = 0;
for (int i = 1; i < cadena.length(); i++) { //El error es que se iba de rango en i
if (cadena.charAt(i) != ' ') {
res++;
}
}
return res;
}
public static int getValor() {
int vector[] = { 6, 16, 26,36,46,56,66,76 };
int idx = 7;// El problema es que con 8 se va de rango ya que el array arranca en 0 (0-7 = 8 elementos).
        //System.out.println(vector[idx]);
return vector[idx];
}
public static char getPrimerCaracter(String palabra) {
//String string[] = new String[5]; El string[1] está apuntando a null, ese es el error.
//Además hay que acceder a la posicion 0 para obtener el primero y no a la 1.
//System.out.print(palabra.charAt(0));
return (palabra.charAt(0));
}
public static String paraAString(int a) {
//Object x1 = new Integer(a);
System.out.println(String.valueOf(a));
return (String.valueOf(a)) ;//La idea es devolver el int en string, lo hice con este método
}
}
