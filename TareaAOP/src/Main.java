import adapters.PdfPrinterAdapter;
import adapters.ThermalPrinterAdapter;
import config.ConfigurationManager;
import interfaces.Printer;
import printers.PdfPrinter;
import printers.ThermalPrinter;
import printing.ReportPrinter;

public class Main {
    public static void main(String[] args) {

        // prueba Seccion 2

        Printer printer1 = new PdfPrinter();
        printer1.print("Factura digital generada");

        Printer printer2 = new ThermalPrinter();
        printer2.print("Ticket de compra generado");



        // Prueba seccion 1
        /* 
        ConfigurationManager config = ConfigurationManager.getInstance();

        // Prueba 1: Imprimir usando PDF
        config.set("printer", "pdf");
        ejecutarPrueba("Reporte de ventas", config);

        // Prueba 2: Imprimir usando Thermal
        config.set("printer", "thermal");
        ejecutarPrueba("Factura N°123", config);

        // Prueba 3: Valor inválido (debe manejarse con un mensaje)
        config.set("printer", "laser");  // Tipo no soportado
        ejecutarPrueba("Documento importante", config);
    }

    private static void ejecutarPrueba(String contenido, ConfigurationManager config) {
        Printer printer;
        String type = config.getPrinterType();

        if (type.equalsIgnoreCase("pdf")) {
            printer = new PdfPrinterAdapter();
        } else if (type.equalsIgnoreCase("thermal")) {
            printer = new ThermalPrinterAdapter();
        } else {
            System.out.println("[ERROR] Tipo de impresora '" + type + "' no soportado.\n");
            return;
        }

        ReportPrinter reportPrinter = new ReportPrinter(printer);
        reportPrinter.printReport(contenido);
        System.out.println();

        */

        

    }
}
