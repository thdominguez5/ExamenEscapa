package Model;


import Validaciones.Validar;

import java.util.ArrayList;

public class Ticket {

    ArrayList<Articulo> miTicket = new ArrayList<>();

    public void ingresarArticulo(Articulo articulo){
        if (Validar.validarArticulo()){
        //TODO ingresar articulo a la lista miticket
        } else {
            System.out.println("no se ha podido ingresar tu artículo");
        }
    }

     public void listarArticulos(){
        if (!miTicket.isEmpty()){
            //TODO ordenar lista por primary key
            System.out.println("Elementos de tu ticket:");
            for (Articulo articulo : miTicket) {
                System.out.println(articulo);
            }
        } else {
            System.out.println("tu ticket está vacío");
        }
    }

    public void buscarArticulos(int num){
        if (Validar.validarBusqueda(num)){
            //TODO buscar por id primario lambda
        }else {
            System.out.println("no se ha encontrado el artículo");
        }
    }

    public void modificarArticulo(int id,Articulo articulo){
        //TODO Podríamos reutilizar la funcionalidad de buscar articulo, y aplicarla a modificar
        if (Validar.validarBusqueda(id)){

        }else {
            System.out.println("no se ha encontrado el artículo");
        }
    }

    public void EliminarArticulo(int id,Articulo articulo){
        //TODO Podríamos reutilizar la funcionalidad de buscar articulo, y aplicarla a modificar
        if (Validar.validarBusqueda(id)){

        }else {
            System.out.println("no se ha encontrado el artículo");
        }
    }






}
