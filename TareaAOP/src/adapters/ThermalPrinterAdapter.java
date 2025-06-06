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
import external.ThermalPrinterLib;

public class ThermalPrinterAdapter implements Printer {
    private final ThermalPrinterLib thermalPrinter = new ThermalPrinterLib();

    @Override
    public void print(String content) {
        thermalPrinter.thermalPrint(content);
    }
}
