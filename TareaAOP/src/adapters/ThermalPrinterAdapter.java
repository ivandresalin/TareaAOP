package adapters;

import interfaces.Printer;
import printers.ThermalPrinter;

public class ThermalPrinterAdapter implements Printer {
    private ThermalPrinter thermalPrinter;

    public ThermalPrinterAdapter() {
        this.thermalPrinter = new ThermalPrinter();
    }

    @Override
    public void print(String content) {
        thermalPrinter.printThermal(content);
    }
}
