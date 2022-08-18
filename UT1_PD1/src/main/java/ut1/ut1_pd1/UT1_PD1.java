/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ut1.ut1_pd1;

/**
 *
 * @author Administrador
 */
public class UT1_PD1 {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion());
        Alumno.recorrer("cadena");
        Alumno.getValor();
        Alumno.getPrimerCaracter("Juan");
        Alumno.paraAString(0);
        Contador contador = new Contador();
        System.out.println("--------------------------");
        contador.showCount();
    }
}
