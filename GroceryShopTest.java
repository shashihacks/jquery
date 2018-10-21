package grocery;
import java.util.*;

//import com.arraylist.GroceryShopTest;


 

 public class GroceryShopTest {

		static ArrayList <String> itemNameList=new ArrayList<String>();
		static ArrayList <Integer> itemIdList=new ArrayList<Integer>();
		static ArrayList <Integer> quantityList=new ArrayList<Integer>();
		static ArrayList <Double> factoryPriceList=new ArrayList<Double>();
		static ArrayList <Double> shopPriceList=new ArrayList<Double>();

		final int N=3;
		//input data
		public void inputData(){
			String itemName = new String();
			int itemId;
			int quantity;
			double factoryPrice;
			double shopPrice;
			GroceryShopTest groceryshoptest = new GroceryShopTest();
			if (itemNameList.size()>=N || itemIdList.size()>=N || quantityList.size()>=N || factoryPriceList.size()>=N || shopPriceList.size()>=N )	
			{
				System.out.println("Limit Exceeded  !!!! No item can be input");
				groceryshoptest.displayMenu();
			}
		
			Scanner obj=new Scanner(System.in);
			boolean inp=true;
			do{
				inp=true;
			System.out.println("Enter itemName	:");
			itemName=obj.nextLine();
			itemNameList.add(itemName);
			
			
			}while(!inp);
		
			do{
				inp=true;
				try{
					System.out.println("Enter itemId	:");
					itemId=obj.nextInt();
					
					if(itemId<1 || itemId>333){
						System.out.println("item Id cannot be less than 1 and greater than 333");
						inp=false;
					}
					itemIdList.add(itemId);
				}
				catch(InputMismatchException ex)
				{
					System.out.println("invalid input");
					groceryshoptest.displayMenu();
					
				}
			
			
			
			
			}while(!inp);
			
			
			do{
				inp=true;
			System.out.println("Enter itemQuantity	:");
			quantity=obj.nextInt();
			if(quantity<1 || quantity>1000){
				System.out.println("item quantity cannot be less than 1 and greater than 1000");
				inp=false;
			}
			quantityList.add(quantity);
			
			
			}while(!inp);
			
			int testvar=0;
			do{
				inp=true;
			System.out.println("Enter factoryPrice	:");
			factoryPrice=obj.nextDouble();
			if(factoryPrice<1){
				System.out.println("item price cannot be this");
				inp=false;
			}
			factoryPriceList.add(testvar,factoryPrice);
			testvar+=1;
			
			
			}while(!inp);
			
			
			do{
				inp=true;
			System.out.println("Enter shopPriceList	:");
			shopPrice=obj.nextDouble();
			if(shopPrice<1){
				System.out.println("item price cannot be this");
				inp=false;
			}
			shopPriceList.add(shopPrice);
			
			
			}while(!inp);
			 groceryshoptest.displayData();
			  groceryshoptest.displayMenu();
		
		}
	
		
	//Calculate Shop Price
		
	public void calculateShopPrice(){
		
		GroceryShopTest groceryshoptest = new GroceryShopTest();
		int count=itemNameList.size();
		  if(count<=0){//check count
				System.out.println("no data avilable to calculate");
				groceryshoptest.displayMenu();
			}
		double discount,newval;
		System.out.println("Enter discout..       ");
		Scanner obj=new Scanner(System.in);
		discount=obj.nextDouble();
		discount=discount/100;
		for(int i=0; i<shopPriceList.size(); i++){
			double x = shopPriceList.get(i);
			double y=x*discount;
			x=x-y;
			shopPriceList.set(i, x);
			
        }
//		 for (int i=0;i<shopPriceList.size();i++) {
//	        
//	          System.out.println(shopPriceList.get(i));
//	      }
		 
		 
		 System.out.println("\t Data in the Grocery Shop\n\n");
			System.out.println("Item Name\t Item Id\t Item Quantity\t  Factory Price\t\t Shop Price ");
			for(int i=0;i<itemNameList.size();i++){
				System.out.println(itemNameList.get(i)+"\t\t  " +itemIdList.get(i)+"\t\t  " +
			quantityList.get(i)+" \t\t\t"+"$"+factoryPriceList.get(i)+" \t\t\t"+"$"+shopPriceList.get(i));
			}
		 groceryshoptest.displayMenu();
	}
	
	
	//display All
	public void displayData(){
		
		GroceryShopTest groceryshoptest = new GroceryShopTest();
		int count=itemNameList.size();
		  if(count<=0){
				System.out.println("no data avilable to display");
				groceryshoptest.displayMenu();
			}
		System.out.println("\t Data in the Grocery Shop\n\n");
		System.out.println("Item Name\t Item Id\t Item Quantity\t  Factory Price\t\t Shop Price ");
		for(int i=0;i<itemNameList.size();i++){
			System.out.println(itemNameList.get(i)+"\t\t  " +itemIdList.get(i)+"\t\t  " +
		quantityList.get(i)+" \t\t\t"+"$"+factoryPriceList.get(i)+"\t\t\t"+"$"+shopPriceList.get(i));
		}

		
		  groceryshoptest.displayMenu();
	}
	
	//sell Item
   public void sellItem(){
	   GroceryShopTest groceryshoptest = new GroceryShopTest();
	   int count=itemNameList.size();
		  if(count<=0){//check count
				System.out.println("no items avilable to sell");
				groceryshoptest.displayMenu();
			}
	   Scanner obj=new Scanner(System.in);
	   System.out.println("Enter the item Id to sell");
	   int item = obj.nextInt();
	   int itemIndex;
	   if(itemIdList.contains(item)){
		   itemIndex=itemIdList.indexOf(item);
		   int quantityValue=quantityList.get(itemIndex);
		   if(quantityValue==0){
			   System.out.println("item is not in stock");
			   groceryshoptest.displayMenu();
		   }
		   for(int i=0;i<quantityList.size();i++){
			   
			   if(itemIndex==i){
				   quantityList.set(itemIndex,quantityValue-1);
				   System.out.println("item Sold ");
				   groceryshoptest.displayData();
			   }
			  
		   }
		   for(int i=0;i<quantityList.size();i++){
			   System.out.println(quantityList.get(i));
		   }
		  
	   }
	   else{
		   System.out.println("no item found with input Id");
		   groceryshoptest.displayMenu();
	   }
	   groceryshoptest.displayMenu();
   }

   
	
  public void sortFactoryPriceItems(){
	  GroceryShopTest groceryshoptest = new GroceryShopTest();
	  int count=itemNameList.size();
	  if(count<=0){//check count
			System.out.println("no data avilable to sort");
			groceryshoptest.displayMenu();
		}
	  ArrayList<Double> pricecopylist = new ArrayList<Double>();
	  HashMap<Double,ArrayList<Integer>> hm=new HashMap<Double,ArrayList<Integer>>();
	  pricecopylist.addAll(factoryPriceList);
	  for(int i=0;i<pricecopylist.size();i++)
	  { 
		  ArrayList<Integer> temp;
		  	if(!hm.containsKey(pricecopylist.get(i)))
		  	{
		  		temp=new ArrayList<Integer>();
		        temp.add(i);
		      hm.put(pricecopylist.get(i),temp);
		  	}
		  else
		  {
		     temp=hm.get(pricecopylist.get(i));
		     temp.add(i);
		     hm.put(pricecopylist.get(i),temp);
	
		  }
	  }
	  Collections.sort(pricecopylist);
	  ArrayList<Integer> indexlist = new ArrayList<Integer>(hm.get(pricecopylist.get(0)));
	  for( int i=0;i<indexlist.size();i++)
	  {
	  	System.out.println(indexlist.get(i));
	  }
	  
	  
	  System.out.println("\t Data in the Grocery Shop\n\n");
		System.out.println("Item Name\t Item Id\t Item Quantity\t  Factory Price\t\t Shop Price ");
		for(int i=0;i<indexlist.size();i++){
			i=indexlist.get(i);
			System.out.println(itemNameList.get(i)+"\t\t  " +itemIdList.get(i)+"\t\t  " +
				quantityList.get(i)+" \t\t\t"+"$"+factoryPriceList.get(i)+" \t\t\t"+"$"+shopPriceList.get(i));
		}

		
		  groceryshoptest.displayMenu();
	  }
	    
 
	// sort by name
  
  
  public void sortByName(){
	  GroceryShopTest groceryshoptest = new GroceryShopTest(); 
	  int count=itemNameList.size();
	  if(count<=0){//check count
			System.out.println("no data avilable to sort");
			groceryshoptest.main(null);
		}
	int temp[]=new int[count];
	String st[] = new String[count];
	for(int j=0;j<count;j++)
		st[j] = itemNameList.get(j);
	
	Arrays.sort(st);
	for(int j=0;j<count;j++){
		for(int i=0;i<count;i++){
			if(st[j].equals(itemNameList.get(i))){
				temp[j] = i;
				break;
			}
		}
	}

//	for(int i=0;i<itemNameList.size();i++)
//	{
//		System.out.println(itemNameList.get(temp[i]));
//	}
	System.out.println("\t Data in the Grocery Shop\n\n");
	System.out.println("Item Name\t Item Id\t Item Quantity\t  Factory Price\t\t Shop Price ");
	for(int i = itemNameList.size() - 1; i >= 0; i--){

		System.out.println(itemNameList.get(temp[i])+"\t\t  " +itemIdList.get(i)+"\t\t  " +
				quantityList.get(i)+" \t\t\t"+"$"+factoryPriceList.get(i)+" \t\t\t"+"$"+shopPriceList.get(i));
		}
	

	

	groceryshoptest.displayMenu();
	
	
	
	
}

  
  
  
  
	
	//display Meny
		
		public void displayMenu(){
			Scanner obj=new Scanner(System.in);
			GroceryShopTest groceryshoptest = new GroceryShopTest(); 
			System.out.println("\t\tGroceryShop");
			System.out.println("-----------------------------------------------------");
			System.out.println("1.Input & Validate data");
			System.out.println("2.calculateShopPrice");
			System.out.println("3.Display Data;");
			System.out.println("4.Sell Item ");
			System.out.println("5.sort factoryPrice:");
			System.out.println("6.sort by Name:");
			System.out.println("7.Exit");
			int flag=1;
			while(flag==1){
			System.out.println("\nEnter options(1-8)");
			int choice=0;
			try{
				choice=obj.nextInt();
				}
			catch(InputMismatchException ex){
				System.out.println("Please input choice as a number");
				groceryshoptest.displayMenu();
			}
			switch(choice){
			case 1:flag=0;groceryshoptest.inputData();break;
			case 2:flag=0;groceryshoptest.calculateShopPrice();break;
			case 3:flag=0;groceryshoptest.displayData();break;			
			case 4:flag=0;groceryshoptest.sellItem();break;
			case 5:flag=0;groceryshoptest.sortFactoryPriceItems();break;
			case 6:flag=0;groceryshoptest.sortByName();break;
			case 7:flag=0; System.out.println("Program has been terminated  ");System.exit(0);break;
			default:flag=1;System.out.println("Please enter correct choice");
			}
			}
			obj.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public boolean validateName(String name){
			 if(!name.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$")){
				 /*System.out.println("Not Integer============");
				 */return false;
				 }
			 if(name.length()>25  ){
				 /*System.out.println("Greater than 25================");
				 */return false;
			 }
			 int count=0;
			 for(int i = 0; i < name.length(); i++) {
		            if( name.charAt( i ) == (' ') ) {
		                count++;
		            }
		        }
			 if(count!=1){
				 /*System.out.println("spaces greater than requirement==============");
				 */return false;
			 }
			return true;
		}
	 
	 
		
	
		
		
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			GroceryShopTest groceryshoptest = new GroceryShopTest(); 
			groceryshoptest.displayMenu();
		}

	}