

package com.estudio.sprintjavam4;

import java.util.Scanner;

/**
 *  SPRINT JAVA M4
 * @author ETIAN PARRA
 */
public class App {

    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        
        contenedor.cargarSistema();
        Scanner scan = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("********************");
            System.out.println("                    ");
            System.out.println("-- MENU PRINCIPAL --");
            System.out.println("1. AGREGAR CLIENTE ");
            System.out.println("2. AGREGAR PROFESIONAL ");
            System.out.println("3. AGREGAR ADMINISTRATIVO ");
            System.out.println("4. AGREGAR CAPACITACION");
            System.out.println("5. ELIMINAR USUARIO");
            System.out.println("6. LISTAR USUARIOS");
            System.out.println("7. LISTAR TIPOS USUARIOS");
            System.out.println("8. LISTAR CAPACITACIONES");
            System.out.println("9. SALIR ");
            System.out.print("INGRESE SOLO NUMEROS 1-9 : ");
            
            while (!scan.hasNextInt()) {
                System.out.println("QUE PORFIADO...INGRESE SOLO NUMEROS");
                scan.next(); 
            }
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1:
                    // AGREGAR NUEVO CLIENTE
                    contenedor.crearCliente();
                    break;
                case 2:
                    // AGREGAR NUEVO PROFESIONAL
                    contenedor.crearProfesional();
                    break;
                case 3:
                    // CREAR ADMINISTRATIVO
                    contenedor.crearAdministrativo();
                    break;
                case 4:
                    // CREAR CAPACITACION
                    contenedor.crearCapacitacion();
                    break;
                case 5:
                    // ELIMINAR USUARIO
                    contenedor.buscarEliminar();
                    break;
                case 6:
                    // LISTAR USUARIOS
                    contenedor.listarUsuarios();
                    break;
                case 7:
                    // LISTAR USUARIOS POR TIPOS
                    contenedor.listarTipos();
                    break;
                case 8:
                    // LISTAR CAPACITACIONES
                    contenedor.listarCapacitaciones();
                    break;
                case 9:
                    System.out.println("                     ");
                    System.out.println("---------------------------------------");
                    System.out.println("S A L I E N D O O ...CHAO PESCAO.......");
                    System.out.println("---------------------------------------");
                    break;
                default:
                    System.out.println("                     ");
                    System.out.println("------------------------------------------");
                    System.out.println("OPCION NO ES VALIDA... METE BIEN LOS DEDOS");
                    System.out.println("------------------------------------------");
                    break;
            }
            System.out.println();
        } while (opcion != 9);

        scan.close();
    }
    }

