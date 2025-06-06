package printers;

public aspect PrinterAdapterAspect {
    declare parents: PdfPrinter implements Printer;
    declare parents: ThermalPrinter implements Printer;

    public void PdfPrinter.print(String message) {
        printToPdf(message);
    }

    public void ThermalPrinter.print(String message) {
        printToThermal(message);
    }
}
