package adapters;

import interfaces.Printer;
import printers.PdfPrinter;

public class PdfPrinterAdapter implements Printer {
    private PdfPrinter pdfPrinter;

    public PdfPrinterAdapter() {
        this.pdfPrinter = new PdfPrinter();
    }

    @Override
    public void print(String content) {
        pdfPrinter.printPdf(content);
    }
}
