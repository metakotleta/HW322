package taxes;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType {
    private String taxName = "Подоходный";

    @Override
    public String getTaxName() {
        return taxName;
    }

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.13).setScale(4, BigDecimal.ROUND_HALF_UP));
    }
}

