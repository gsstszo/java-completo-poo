package secao08.ex04;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double dollarToReal(double dollarPrice,
            double dollarQuantity) {
        return (dollarPrice * dollarQuantity + (dollarPrice * dollarQuantity * IOF));

    }

}
