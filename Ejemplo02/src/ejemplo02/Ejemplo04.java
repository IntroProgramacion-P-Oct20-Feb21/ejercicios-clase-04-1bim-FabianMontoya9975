/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo02;

import java.util.Scanner;

/**
 *
 * @author josef
 */
public class Ejemplo04 {
    public static void main(String[] args) {
        //ingresar datos por teclado
        // uso de la clase Scanner
        Scanner entrada = new Scanner(System.in);
        String nombres;
        String apellidos;
        String ciudadnacimiento;
        String paisnacimiento;
        String añonacimiento;
        
        System.out.println("Por favor, ingrese sus nombres completos;");
        nombres = entrada.nextLine();
        
        System.out.println("Por favor, ingrese sus apellidos completos;");
        apellidos = entrada.nextLine();
        
        System.out.println("Por favor, ingrese su ciudad de nacimiento;");
        ciudadnacimiento = entrada.nextLine();
        
        System.out.println("Por favor, ingrese su país de nacimiento;");
        paisnacimiento = entrada.nextLine();
        
        System.out.println("Por favor, ingrese su año de nacimiento;");
        añonacimiento = entrada.nextLine();
        
        System.out.printf("Sus datos personales:\n%s %s\n%s-%s\n%s\n",
                nombres,
                apellidos,
                ciudadnacimiento,
                paisnacimiento,
                añonacimiento);
    }
}
