package pl.edu.agh.mwo.invoice.product;
import pl.edu.agh.mwo.invoice.Invoice;
import pl.edu.agh.mwo.invoice.product.Product;

import javax.swing.*;
import javax.swing.text.Position;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class PrintInvoice {
    public static void printHeading(Invoice invoice){
        System.out.println("Numer faktury: " + invoice.getNumber());
        System.out.println();
    }
    public static void printProducts(Invoice invoice) {

        Iterator<Product> iteratorProduct = invoice.getIteratorProduct();
        while (iteratorProduct.hasNext()) {
           Product product = iteratorProduct.next();
            System.out.println("Nazwa: " + product.getName() + "Cena jednostkowa: " + product.getPrice() + " zł "+"  Ilość: " );
        }

    }
    public static void printFotter(Invoice invoice){
        System.out.println("Liczba pozycji " + invoice.getNumber());
        System.out.println();
    }
    public static void printInvoice(Invoice i) {
        printHeading(i);
        printProducts(i);
        printFotter(i);
    }

}
