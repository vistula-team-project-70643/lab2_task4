import java.math.BigDecimal;

public class Lab2Task4Farrukhi {
    public static void main(String[] args) {
        double productCostFarrukhi = 9.99;
        double vatRateFarrukhi = 0.05;

        BigDecimal productCostBD = BigDecimal.valueOf(productCostFarrukhi);
        BigDecimal vatRateBD = BigDecimal.valueOf(vatRateFarrukhi);

        BigDecimal singleVatFarrukhi = productCostBD.multiply(vatRateBD);
        BigDecimal singleGrossFarrukhi = productCostBD.add(singleVatFarrukhi);
        System.out.println("Single unit VAT: " + singleVatFarrukhi);

        BigDecimal totalNetSalesFarrukhi = BigDecimal.ZERO;
        BigDecimal totalVatFarrukhi = BigDecimal.ZERO;
        BigDecimal totalGrossFarrukhi = BigDecimal.ZERO;

        for (int i = 0; i < 10000; i++) {
            totalNetSalesFarrukhi = totalNetSalesFarrukhi.add(productCostBD);
            totalVatFarrukhi = totalVatFarrukhi.add(singleVatFarrukhi);
            totalGrossFarrukhi = totalGrossFarrukhi.add(singleGrossFarrukhi);
        }

        System.out.println("Total net sales value: " + totalNetSalesFarrukhi);
        System.out.println("Total VAT amount: " + totalVatFarrukhi);
        System.out.println("Total gross value: " + totalGrossFarrukhi);
    }
}
