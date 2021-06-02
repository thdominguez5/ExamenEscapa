import Model.Ticket;

import java.util.Scanner;

public class Main {

    public static void main(String []args){

        Ticket miTicket = new Ticket();

        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("GESTIÓN DE COMPRA DE ARTICULOS: CIDEAD MODA \n");
            System.out.println("[1] Nuevo Artículo");
            System.out.println("[2] Lista Artículo");
            System.out.println("[3] Buscar Artículo");
            System.out.println("[4] Modificar Datos de un Artículo");
            System.out.println("[5] Eliminar un Articulo");
            System.out.println("[6] Salir\n");

            System.out.print("Introduzca opcion (1-6): ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    //TODO miTicket.ingresarArticulo();
                    break;
                case 2:
                    miTicket.listarArticulos();
                    break;
                case 3:
                    //TODO miTicket.buscarArticulos();
                    break;
                case 4:
                    //TODO miTicket.modificarArticulo();
                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Adios");
                    System.exit(0);
                    break;
            }
        } while (opcion != 7);
    }
}


