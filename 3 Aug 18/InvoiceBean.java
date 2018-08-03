package git.Learning;

public class InvoiceBean {
	int invNumber;
	int qtyOfItems;
	int itemId;
	String VendorName;
	int vendorNumber;
	double amount;
	
	public InvoiceBean(int invNumber,int qtyOfItems,int itemId,String VendorName,int vendorNumber,double amount) {
		this.invNumber=invNumber;
		this.qtyOfItems=qtyOfItems;
		this.itemId=itemId;
		this.VendorName = VendorName;
		this.vendorNumber = vendorNumber;
		this.amount=amount;
	}
	public String display(){
		
		return "invNumber :"+this.invNumber+", qtyOfItems: "+this.qtyOfItems+", itemId: "+this.itemId+", VendorName: "+this.VendorName+", VendorNumber: "+this.vendorNumber+", Amount:"+this.amount;
	}
}
