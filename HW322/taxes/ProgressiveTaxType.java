package taxes;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    private String taxName = "Прогрессивный";

    @Override
    public String getTaxName() {
        return taxName;
    }

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return (amount.compareTo(BigDecimal.valueOf(100000)) == -1) ?
                amount.multiply(BigDecimal.valueOf(0.10).setScale(4, BigDecimal.ROUND_HALF_UP)) :
                amount.multiply(BigDecimal.valueOf(0.15).setScale(4, BigDecimal.ROUND_HALF_UP));
    }
}
