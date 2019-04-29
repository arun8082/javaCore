import java.util.*;

class FoodMenu 
{
	private int itemCount;
	private float totalPrice;
	
	public FoodMenu(){
		itemCount=0;
		totalPrice=0;
	}
	void addItem(int i,int price){
		itemCount=itemCount+i;
		totalPrice += price*i;
	}

	int getCount(){
		return itemCount;
	}
	float getPrice(){
		return totalPrice;
	}

	public static void main(String[] args){
		char ch='y';
		int choice;
		
		FoodMenu fm=new FoodMenu();
		Scanner scan = new Scanner(System.in);
		
		while(ch=='y' || ch=='Y'){
			System.out.println("Item list");
			System.out.println("1. Idli 20");
			System.out.println("2. Roasted Chiken 50");
			System.out.println("3. Poha 30");
			System.out.println("4. Display total\n");
			
			System.out.print("\nChoose valid option: ");
			choice=scan.nextInt();
			
			switch(choice){
				case 1:
					System.out.print("\nEnter quantity: ");
					int itemCount=scan.nextInt();
					fm.addItem(itemCount,20);
					break;
				case 2:
					System.out.print("\nEnter quantity: ");
					itemCount=scan.nextInt();
					fm.addItem(itemCount,50);
					break;
				case 3:
					System.out.print("\nEnter quantity: ");
					itemCount=scan.nextInt();
					fm.addItem(itemCount,30);
					break;
				case 4:
					System.out.println("Total Price: "+fm.getPrice());
					System.out.println("Total Items: "+fm.getCount());
					break;
				default:
					System.out.println("\nInvalid choice......\n");
					
			}
			System.out.print("\nAre You want to continue(y/n): ");
			ch=scan.next().charAt(0);
		}
		if(scan!=NULL){
			scan.close();
		}
	}
}