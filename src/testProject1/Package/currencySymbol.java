package testProject1.Package;

import java.util.Currency;
import java.util.Locale;
import java.util.Set;

public class currencySymbol {
	 public static void main(String args[]) {

	     // Create a currency for INR
	      Currency cur1 = Currency.getInstance("INR");

	      // Get and print the symbol of the currency
	      String symbol = cur1.getSymbol();
	      System.out.println("Currency symbol is = " + symbol); 
	      
	      
	   // Create a currency for GERMANY locale
	   //   Locale locale = Locale.GERMANY;
	      Locale locale = Locale.US;
	      Currency cur11 = Currency.getInstance(locale);

	      // Get and print the symbol of the currency
	      String symbol1 = cur11.getSymbol(locale);
	      System.out.println("Currency symbol is = " + symbol1);
	      
	      Set<Currency> c_set =  Currency.getAvailableCurrencies();
	      System.out.println("Available currencies:");
	      for(Currency c:c_set){
	        System.out.println(c);
	      }
	      
	   }
}
