package grocery;

public class GroceyShop{
 	private String itemName;
	private int itemId;
	private int quantity;
	private double factoryPrice;
	private double shopPrice;

public GroceyShop() {
	super();
}
public GroceyShop(String itemName,int itemId,int quantity,double factoryPrice,double shopPrice ) {
	super();
	this.itemName = itemName;
	this.itemId = itemId;
	this.quantity=quantity;
	this.factoryPrice = factoryPrice;
	this.shopPrice = shopPrice;
}
//setters and getters
 public String getItemName() {
		return itemName;
	}
 public void setItemName(String itemName) {
		this.itemName = itemName;
	}


 public int getItemId(){
	 return itemId;
 }
 public void setItemId(int itemId){
	 this.itemId=itemId;
 }

 public int getQuantity(){
	 return quantity;
 }
 public void setQuantity(int quantity){
	 this.quantity=quantity;
 }

 public double getFactoryPrice() {
		return factoryPrice;
	}
	public void setFactoryPrice(double factoryPrice) {
		this.factoryPrice = factoryPrice;
	}
	
	 public double getShopPrice() {
			return shopPrice;
		}
		public void setShopPrice(double shopPrice) {
			this.shopPrice = shopPrice;
		}

}
