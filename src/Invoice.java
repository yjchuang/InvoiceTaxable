
public class Invoice {
	private double price;
	private boolean isTaxable;
	private double taxRate;

	public Invoice()
	{
		price = 0.0;
		isTaxable = false;
		taxRate = 0.0;
	}
	
	public Invoice(double _price, boolean _isTaxable, double _taxRate)
	{
		price = _price;
		isTaxable = _isTaxable;
		taxRate = _taxRate;
	}
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double _price)
	{
		price = _price;
	}
	
	public boolean getIsTaxable()
	{
		return isTaxable;
	}
	public void setIsTaxable(boolean _isTaxable)
	{
		isTaxable = _isTaxable;
	}
	
	public double getTaxRate()
	{
		return taxRate;
	}
	public void setTaxRate(double _taxRate)
	{
		taxRate = _taxRate;
	}
	
	public double calculateTotal(Invoice _invoice)
	{
		double total = 0.0;
		
		return total;
	}
}
