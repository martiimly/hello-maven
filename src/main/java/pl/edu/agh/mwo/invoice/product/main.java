package pl.edu.agh.mwo.invoice.product;

import pl.edu.agh.mwo.invoice.Invoice;

import java.math.BigDecimal;

public class main {
    public static void main(String[] args){

        Product p1 = new DairyProduct("Maslanka ", new BigDecimal ("2.5"));
        Product p2 = new DairyProduct("Ser Kozi ", new BigDecimal ("13.4"));
        Product p3 = new TaxFreeProduct("Maskotki ", new BigDecimal("200"));
        Product p4 = new TaxFreeProduct("Kubek ", new BigDecimal("5"));
        Product p5 = new BottleOfWine("Prosecco ", new BigDecimal("100.0"));
        Product p6 = new BottleOfWine("Monte Verdi ", new BigDecimal("120.0"));
        Product p7 = new FuelCanister("Diesel ", new BigDecimal("350.0"));

        Invoice i = new Invoice();
        i.addProduct(p1,2);
        i.addProduct(p2,1);
        i.addProduct(p3, 6);
        i.addProduct(p4, 1);
        i.addProduct(p5, 4);
        i.addProduct(p6, 3);
        i.addProduct(p7, 1);

        PrintInvoice.printInvoice(i);
    }
}
