package taxServices;

import java.math.BigDecimal;

public class TaxServiceMSK extends TaxService {

    private String tsName = "ФНС Москвы";

    public void payOut(BigDecimal taxAmount, String taxName) {
        System.out.format(tsName + ": Уплачен " + taxName + " налог в размере %.4f%n", taxAmount);
    }
}
