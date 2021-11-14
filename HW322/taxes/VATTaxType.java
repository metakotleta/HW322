package taxes;

import java.math.BigDecimal;

public class VATTaxType extends TaxType {
    private String taxName = "НДС";

    @Override
    public String getTaxName() {
        return taxName;
    }

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.20).setScale(4, BigDecimal.ROUND_HALF_UP));
    }
}
