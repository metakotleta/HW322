package taxServices;

import java.math.BigDecimal;

public class TaxServiceVLG extends TaxService {

    private String tsName = "ФНС Поволжья";

    @Override
    public void payOut(BigDecimal taxAmount, String taxName) {
        System.out.format(tsName + ": Уплачен " + taxName + " налог в размере %.4f%n", taxAmount);
    }
}
