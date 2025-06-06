/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package printing;

/**
 *
 * @author ivand
 */
import interfaces.Printer;
import config.ConfigurationManager;

public class ReportPrinter {
    private final Printer printer;

    public ReportPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printReport(String content) {
        System.out.println("Configuración: " + ConfigurationManager.getInstance().getPrinterType());
        printer.print(content);
    }
}