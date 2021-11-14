import taxServices.*;
import taxes.*;

public class Main {

    public static void main(String[] args) {
        TaxService taxServiceMSK = new TaxServiceMSK();
        TaxService taxServiceVLG = new TaxServiceVLG();
        TaxType progressiveTaxType = new ProgressiveTaxType();
        TaxType vatTaxType = new VATTaxType();
        TaxType incomeTaxType = new IncomeTaxType();
        Bill[] payments = {
                new Bill(19315.50, incomeTaxType, taxServiceMSK),
                new Bill(150000, incomeTaxType, taxServiceVLG),
                new Bill(150000, progressiveTaxType, taxServiceMSK),
                new Bill(99999.99, progressiveTaxType, taxServiceVLG),
                new Bill(5555, vatTaxType, taxServiceMSK),
                new Bill(5556, vatTaxType, taxServiceVLG)
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
