/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapters;

/**
 *
 * @author ivand
 */
import interfaces.Printer;
import external.PdfPrinterLib;

public class PdfPrinterAdapter implements Printer {
    private final PdfPrinterLib pdfPrinter = new PdfPrinterLib();

    @Override
    public void print(String content) {
        pdfPrinter.printToPDF(content);
    }
}
