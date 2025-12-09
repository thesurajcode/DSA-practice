import javax.print.PrintService;
import javax.print.PrintServiceLookup;
public class ListPrinters {
    public static void main(String[] args){
        PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
        if(services.length == 0){
            System.out.println("No printer Found");
        }else{
            for(PrintService Service : services){
                System.out.println("Printer is Available" + Service.getName());
            }
        }

        //Now working for the default printer name 
        PrintService defaultPrinter = PrintServiceLookup.lookupDefaultPrintService();
        if(defaultPrinter != null){
            System.out.println(defaultPrinter.getName());
        }else{
            System.out.println("No default printer is found");
        }

    }
    
}
