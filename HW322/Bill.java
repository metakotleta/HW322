import taxes.*;
import taxServices.*;
import java.math.*;

class Bill {
    private BigDecimal amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = BigDecimal.valueOf(amount);
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        BigDecimal taxAmount = taxType.calculateTaxFor(amount);
        taxService.payOut(taxAmount, taxType.getTaxName().toLowerCase());
    }
}