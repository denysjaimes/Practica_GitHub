/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Windows Seven
 */
public class principal {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader entrada = new BufferedReader(isr);

    
    public principal() throws IOException {

        ArrayList coleccion_clientes = new ArrayList();
        int opcion;

        do {
            System.out.println("");
            System.out.println("");
            System.out.println("********* MENU ************");
            System.out.println("1. INSERTAR NUEVO CLIENTE");
            System.out.println("2. CREAR TIPO DE CUENTA");
            System.out.println("3. CREAR TIPO DE OPERACION");
            System.out.println("4. ABRIR CUENTA");
            System.out.println("5. OPERACIONES");
            System.out.println("6. CONSULTA/REPORTES");
            System.out.println("0. SALIR");
            try {
                opcion = Integer.parseInt(entrada.readLine());
            } catch (IOException | NumberFormatException e) {
                System.out.println("=====>  ERROR " + e.getMessage());
                opcion = 100;
            }

            switch (opcion) {
                case 0:
                    break;
                case 1:
                    insertar_cliente(coleccion_clientes);
                    break;
                case 2:
                    //consultar(coleccion);
                    break;
                case 3:
                    //listar(coleccion);
                    break;
                case 4:
                    //eliminar(coleccion);
                    break;
                case 5:
                    //eliminar(coleccion);
                    break;
                case 6:
                    principal_reporte();
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }

    public static void main(String[] args) {
        try {
            new principal();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
private void principal_reporte() throws IOException {

        ArrayList coleccion = new ArrayList();
        int opcion;

        do {
            System.out.println("");
            System.out.println("");
            System.out.println("********* MENU CONSULTA/REPORTE ************");
            System.out.println("1. CONSULTA DE USUARIO");
            System.out.println("2. CONSULTA DE CUENTA");
            System.out.println("3. REPORTE DE USUARIO");
            System.out.println("4. REPORTE DE CUENTA POR TIPO");
            System.out.println("5. REPORTE DE TIPO DE OPERACIONES");
            System.out.println("6. REPORTE DE TIPO DE CUENTA");
            System.out.println("0. SALIR");
            
            try {
                opcion = Integer.parseInt(entrada.readLine());
            } catch (IOException | NumberFormatException e) {
                System.out.println("=====>  ERROR " + e.getMessage());
                opcion = 100;
            }

            switch (opcion) {
                case 0:
                    break;
                case 1:
                    consulta_usuario(coleccion);
                    break;
                case 2:
                    consulta_cuenta(coleccion);
                    break;
                case 3:
                    listado_usuario(coleccion);
                    break;
                case 4:
                    listado_cuenta_tipo(coleccion);
                    break;
                case 5:
                    listado_operacion(coleccion);
                    break;
                case 6:
                    listado_cuenta(coleccion);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 0);
    }

    private void insertar_cliente(ArrayList coleccion_clientes) throws IOException {
        coleccion_clientes.add(Cliente.createCliente());
    }
    private void consulta_usuario(ArrayList coleccion) throws IOException {
        
    }
     private void consulta_cuenta(ArrayList coleccion) throws IOException {
        
    }
 private void listado_usuario(ArrayList coleccion) throws IOException {
        
    }
  private void listado_cuenta_tipo(ArrayList coleccion) throws IOException {
        
    }
 private void listado_operacion(ArrayList coleccion) throws IOException {
        
    }
  private void listado_cuenta(ArrayList coleccion) throws IOException {
        
    }
}
