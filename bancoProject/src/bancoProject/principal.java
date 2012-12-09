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
            System.out.println("6. REPORTES");
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
                    //eliminar(coleccion);
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

    private void insertar_cliente(ArrayList coleccion_clientes) throws IOException {
        coleccion_clientes.add(Cliente.createCliente());
    }
}
