package neu.edu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Costco extends StoreAPI{

	public static void demo() {
		List<ItemAPI> itemList = new ArrayList<>();
		String[] itemStrings = {
				 "2,3.49,OJ,Tropicana Oriage Juice",
				 "1,2.49,Cheese,Provolone cheese",
				 "3,1.49,Milk,Almond Milk",
				 "4,0.89,Snack,Mounds chocolate bar",
				 "6,384.49,Treadmill,Voyager Pro Treadmill,98.3,kg",
				 "5,12.49,Chair,folding chair,2.89,Lbs",
				 "7,101.49,Mattress,Air Mattress,27.6,kg",
				 "8,6.89,Slippers,bath slippers,2.5,oz",
				
				
		};
		
		for(String inputData: itemStrings){
			String[] data= inputData.split(",");
			int iD= ConvertUtility.stringToInt(data[0]);
			double price=ConvertUtility.stringToDouble(data[1]);
			String name=data[2];
			String description= data[3];
			if(data.length>5){
				if(data.length==7) {
				String startTmeAndDate=data[4]; 
				String endTmeAndDate=data[5];
				String units= data[6];
				itemList.add(new Service(iD,price,name,description,startTmeAndDate,endTmeAndDate,units));
				}
				else{
					double weight=ConvertUtility.stringToDouble(data[4]); 
					String weightUnits=data[5];

					itemList.add(new Durable(iD,price,name,description,weight,weightUnits));
				}
			}
			else{
				itemList.add(new ItemAPI(iD,price,name,description));
			}
			
			
		}
		
		
		System.out.println("\n\nSort By ID");
		Collections.sort(itemList,(o1,o2)-> {return Integer.compare(o1.getId(), o2.getId());});
		for(ItemAPI i : itemList) System.out.println(i);
		System.out.println("\n\nSort By price");
		Collections.sort(itemList,(o1,o2)-> {return Double.compare(o1.getItemPrice(), o2.getItemPrice());});
		for(ItemAPI i : itemList) System.out.println(i);
		System.out.println("\n\nSort By Name");
		Collections.sort(itemList,(o1,o2)-> {return o1.getItemName().compareToIgnoreCase(o2.getItemName());});
		for(ItemAPI i : itemList) System.out.println(i);
		System.out.println("\n\nSort By Description");
		Collections.sort(itemList,(o1,o2)-> {return o1.getItemDescription().compareToIgnoreCase(o2.getItemDescription());});
		for(ItemAPI i : itemList) System.out.println(i);
		
	}
	
}
