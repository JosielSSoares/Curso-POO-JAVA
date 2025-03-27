public class CurrencyConverter {

    public double dolar, dolarComprado;

    public static double IOF = 0.06;

    public static double dolarToReal( double dolar, double dolarComprado){

            return dolar * dolarComprado * (1.0 + IOF);

    }    
}
