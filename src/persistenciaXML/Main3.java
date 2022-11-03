package persistenciaXML;

import persistenciaXML.persistencia.Persistencia;

import persistenciaXML.model.*;
import javax.swing.*;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) throws IOException {
        //CARGAMOS LOS DATOS E LA TIENDA DESE NUESTRO ARCHIVO XML
        Tienda tienda = Persistencia.cargarRecursoTiendaXML();

        //EN ESTA PARTE EL PROGRAMA NOS PERMITIRA CREAR PRODUCTOS DE FORMA ILIMITADA
        //CON EL OBJETIVO DE VER COMO CADA VEZ QUE AGREGAMOS UNO NUEVO EL ARCHIVO CON EXTENSION: .XML
        //SE ACTUALIZARA.

        while (true) {
            Producto producto = new Producto();
            producto.setName(JOptionPane.showInputDialog("ingrese el nombre del producto"));
            tienda.getProductos().add(producto);
            JOptionPane.showMessageDialog(null, "Producto agregado");
            Persistencia.guardarRecursoBancoXML(tienda);
        }


    }
}
