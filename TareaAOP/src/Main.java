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
import printing.ReportPrinter;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager.getInstance().setPrinterType("Térmica");

        ReportPrinter printer1 = new ReportPrinter(new ThermalPrinterAdapter());
        printer1.printReport("Reporte de Ventas");

        ConfigurationManager.getInstance().setPrinterType("PDF");
        ReportPrinter printer2 = new ReportPrinter(new PdfPrinterAdapter());
        printer2.printReport("Reporte Financiero");
    }
}
