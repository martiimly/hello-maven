package pl.edu.agh.mwo.invoice.product;
import pl.edu.agh.mwo.invoice.Invoice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


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
        System.out.println("Kwota brutto: " + invoice.getGrossTotal());
        System.out.println();
    }
    public static void printInvoice(Invoice i) {
        printHeading(i);
        printProducts(i);
        printFotter(i);
    }

}
