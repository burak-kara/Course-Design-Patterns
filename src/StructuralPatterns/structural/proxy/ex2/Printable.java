package StructuralPatterns.structural.proxy.ex2;

/**
 * Created by sasakiumi on 3/4/14.
 */
public interface Printable {
    String getPrinterName();

    void setPrinterName(String name);

    void print(String string);
}
