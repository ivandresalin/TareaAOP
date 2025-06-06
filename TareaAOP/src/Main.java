/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivand
 */
import adapters.PdfPrinterAdapter;
import adapters.ThermalPrinterAdapter;
import config.ConfigurationManager;
import interfaces.Printer;
import printing.ReportPrinter;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.set("printer", "pdf");

        Printer printer;
        if (config.get("printer").equals("pdf")) {
            printer = new PdfPrinterAdapter();
        } else {
            printer = new ThermalPrinterAdapter();
        }

        ReportPrinter rp = new ReportPrinter(printer);
        rp.printReport("Este es el reporte generado.");
    }
}
