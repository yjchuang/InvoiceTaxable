import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceTaxable {

	public static void main(String[] args) {
		boolean _isTaxable = false;
		String isTaxableToken = "", nextInvoice = "y";
		double taxableSubTotal = 0.0, untaxableSubTotal = 0.0;
		double grantTotal = 0.0, tax = 0.0;
		
		int i;
		
		ArrayList<Invoice> invoiceList = new ArrayList<Invoice> ();

		Scanner sc = new Scanner(System.in);
		
		

		while (nextInvoice.equalsIgnoreCase("y"))
		{
			System.out.print("\nEnter price: ");
			double _price = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("\nEnter Tax Rate: ");
			double _taxRate = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("\nIs this item taxable (y/n)?: ");
			isTaxableToken = sc.next();
			sc.nextLine();
			
			if(isTaxableToken.equalsIgnoreCase("y") == true)
			{
				_isTaxable = true;
			}
			else
			{
				_isTaxable = false;
			}
			
			invoiceList.add(new Invoice(_price, _isTaxable, _taxRate));
			
			System.out.print("Next invoice (y/n)? ");
			nextInvoice = sc.next();
			sc.nextLine();
		}
		
		for (i = 0; i < invoiceList.size(); i++)
		{
			if (invoiceList.get(i).getIsTaxable() == true)
			{
				taxableSubTotal += invoiceList.get(i).getPrice();
				tax += (invoiceList.get(i).getPrice()) * (invoiceList.get(i).getTaxRate());
			}
			else
			{
				untaxableSubTotal += invoiceList.get(i).getPrice();
			}
		}
	
		grantTotal = taxableSubTotal + untaxableSubTotal + tax;
		
		System.out.printf("\nTaxable subtotal: %.2f", taxableSubTotal);;
		System.out.printf("\nuntaxable subtotal: %.2f",  untaxableSubTotal);
		System.out.printf("\nTax: %.2f", tax);
		System.out.printf("\nGrant Total: %.2f", grantTotal);
		
		sc.close();

	}

}
