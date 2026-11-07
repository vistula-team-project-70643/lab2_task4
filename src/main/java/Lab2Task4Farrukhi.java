public class Lab2Task4Farrukhi {
    public static void main(String[] args) {
        double productCostFarrukhi = 9.99;
        double vatRateFarrukhi = 0.05;

        double singleVatFarrukhi = productCostFarrukhi * vatRateFarrukhi;
        System.out.println("Single unit VAT: " + singleVatFarrukhi);

        double totalNetSalesFarrukhi = 0;
        double totalVatFarrukhi = 0;
        double totalGrossFarrukhi = 0;

        for (int i = 0; i < 10000; i++) {
            totalNetSalesFarrukhi += productCostFarrukhi;
            totalVatFarrukhi += singleVatFarrukhi;
            totalGrossFarrukhi += (productCostFarrukhi + singleVatFarrukhi);
        }

        System.out.println("Total net sales value: " + totalNetSalesFarrukhi);
        System.out.println("Total VAT amount: " + totalVatFarrukhi);
        System.out.println("Total gross value: " + totalGrossFarrukhi);
    }
}