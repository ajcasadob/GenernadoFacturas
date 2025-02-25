package org.acasado.appfacturas;

import org.acasado.appfacturas.modelo.*;


import java.util.Scanner;

public class EjemploFactura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Producto producto;

        //Optimizando el codigo, quitando las variables.
        /*String nombre;
        double precio;
        int cantidad;
        String desc;*/


        Cliente cliente = new Cliente();
        cliente.setNif("454633g");
        cliente.setNombre("Antonio");

        System.out.println("Ingresa la descripcion de la factura");

        Factura factura = new Factura( sc.nextLine(),cliente);




        System.out.println();

        for (int i = 0; i < 5; i++) {

            producto = new Producto();

            System.out.print("Ingrese producto nº"+producto.getCodigo()+": ");

            producto.setNombre(sc.nextLine());

            System.out.print("Ingrese el precio : ");


            producto.setPrecio(Double.parseDouble(sc.nextLine()));

            System.out.print("Ingrese la cantidad: ");

            factura.addItemFacturas(new ItemFactura(Integer.parseInt(sc.nextLine()),producto));

            System.out.println();
        }




        //System.out.println(factura.generarDetalle());
        System.out.println(factura);
        sc.close();
    }
}
