package printing;

import interfaces.Printer;

public class ReportPrinter {
    private Printer printer;

    public ReportPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printReport(String reportContent) {
        printer.print(reportContent);
    }
}
