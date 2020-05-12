package testProject1.Package;

import java.util.Currency;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class currencyCodes {
	

	 public Set<Currency> toret = new HashSet<Currency>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getAllCurrencies();
	}

    public static Set<Currency> getAllCurrencies()
    {
        Set<Currency> toret = new HashSet<Currency>();
        Locale[] locs = Locale.getAvailableLocales();

        for(Locale loc : locs) {
            try {
                Currency currency = Currency.getInstance( loc );

                if ( currency != null ) {
                    toret.add( currency );
                }
            } catch(Exception exc)
            {
                // Locale not found
            }
        }
        
        System.out.println(toret);
        return toret;
    }

     
}
