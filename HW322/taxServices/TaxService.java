package taxServices;

import java.math.BigDecimal;

public abstract class TaxService {

    public abstract void payOut(BigDecimal taxAmount, String taxName);
}

