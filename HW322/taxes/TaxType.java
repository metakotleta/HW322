package taxes;

import java.math.BigDecimal;

public abstract class TaxType {

    public abstract String getTaxName();
    public abstract BigDecimal calculateTaxFor(BigDecimal amount);
    }

