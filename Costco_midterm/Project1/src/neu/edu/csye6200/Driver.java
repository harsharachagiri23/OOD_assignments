package neu.edu.csye6200;

public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Midterm.demo();

	}

}



 /* *********Output**********
  * neu.edu.csye6200.Midterm.main()...

	 demoAbstraction...

	 demoEncapsulation...
snacks

	 demoInheritance...

	 demoPolymorphism...
Override toString() method to demonstrate polymorphism
Durable [weight=27.6, units=kg, getId()=7, getItemPrice()=101.49, getItemName()=Mattress, getItemDescription()=Air Mattress, toString()=ItemAPI [ID=7, Item Price=101.49, Item Name=Mattress, Item Description=Air Mattress], getClass()=class neu.edu.csye6200.Durable, hashCode()=483422889]

	 demoStaticData...
Printing the value of static variable count 
-49
-48
-47
-46
-45
-44
-43
-42
-41
-40

	 demoImmutableData...
Immutable data before changing it's value:0
Immutable data after changing it's value:0


Sort By ID
ItemAPI [ID=1, Item Price=2.49, Item Name=Cheese, Item Description=Provolone cheese]
ItemAPI [ID=2, Item Price=3.49, Item Name=OJ, Item Description=Tropicana Oriage Juice]
ItemAPI [ID=3, Item Price=1.49, Item Name=Milk, Item Description=Almond Milk]
ItemAPI [ID=4, Item Price=0.89, Item Name=Snack, Item Description=Mounds chocolate bar]
Durable [weight=2.89, units=Lbs, getId()=5, getItemPrice()=12.49, getItemName()=Chair, getItemDescription()=folding chair, toString()=ItemAPI [ID=5, Item Price=12.49, Item Name=Chair, Item Description=folding chair], getClass()=class neu.edu.csye6200.Durable, hashCode()=1239731077]
Durable [weight=98.3, units=kg, getId()=6, getItemPrice()=384.49, getItemName()=Treadmill, getItemDescription()=Voyager Pro Treadmill, toString()=ItemAPI [ID=6, Item Price=384.49, Item Name=Treadmill, Item Description=Voyager Pro Treadmill], getClass()=class neu.edu.csye6200.Durable, hashCode()=557041912]
Durable [weight=27.6, units=kg, getId()=7, getItemPrice()=101.49, getItemName()=Mattress, getItemDescription()=Air Mattress, toString()=ItemAPI [ID=7, Item Price=101.49, Item Name=Mattress, Item Description=Air Mattress], getClass()=class neu.edu.csye6200.Durable, hashCode()=1134712904]
Durable [weight=2.5, units=oz, getId()=8, getItemPrice()=6.89, getItemName()=Slippers, getItemDescription()=bath slippers, toString()=ItemAPI [ID=8, Item Price=6.89, Item Name=Slippers, Item Description=bath slippers], getClass()=class neu.edu.csye6200.Durable, hashCode()=985922955]
startTime=3/12/22, endTime=3/18/22, timeUnits=dates, Id9, ItemPrice=596.89, ItemName=Vacation, ItemDescription=Tropical Hawaii Vacation Package
startTime=3:30pm, endTime=4:00pm, timeUnits=hours, Id10, ItemPrice=35.0, ItemName=Lessons, ItemDescription=Guitar Lessons


Sort By price
ItemAPI [ID=4, Item Price=0.89, Item Name=Snack, Item Description=Mounds chocolate bar]
ItemAPI [ID=3, Item Price=1.49, Item Name=Milk, Item Description=Almond Milk]
ItemAPI [ID=1, Item Price=2.49, Item Name=Cheese, Item Description=Provolone cheese]
ItemAPI [ID=2, Item Price=3.49, Item Name=OJ, Item Description=Tropicana Oriage Juice]
Durable [weight=2.5, units=oz, getId()=8, getItemPrice()=6.89, getItemName()=Slippers, getItemDescription()=bath slippers, toString()=ItemAPI [ID=8, Item Price=6.89, Item Name=Slippers, Item Description=bath slippers], getClass()=class neu.edu.csye6200.Durable, hashCode()=985922955]
Durable [weight=2.89, units=Lbs, getId()=5, getItemPrice()=12.49, getItemName()=Chair, getItemDescription()=folding chair, toString()=ItemAPI [ID=5, Item Price=12.49, Item Name=Chair, Item Description=folding chair], getClass()=class neu.edu.csye6200.Durable, hashCode()=1239731077]
startTime=3:30pm, endTime=4:00pm, timeUnits=hours, Id10, ItemPrice=35.0, ItemName=Lessons, ItemDescription=Guitar Lessons
Durable [weight=27.6, units=kg, getId()=7, getItemPrice()=101.49, getItemName()=Mattress, getItemDescription()=Air Mattress, toString()=ItemAPI [ID=7, Item Price=101.49, Item Name=Mattress, Item Description=Air Mattress], getClass()=class neu.edu.csye6200.Durable, hashCode()=1134712904]
Durable [weight=98.3, units=kg, getId()=6, getItemPrice()=384.49, getItemName()=Treadmill, getItemDescription()=Voyager Pro Treadmill, toString()=ItemAPI [ID=6, Item Price=384.49, Item Name=Treadmill, Item Description=Voyager Pro Treadmill], getClass()=class neu.edu.csye6200.Durable, hashCode()=557041912]
startTime=3/12/22, endTime=3/18/22, timeUnits=dates, Id9, ItemPrice=596.89, ItemName=Vacation, ItemDescription=Tropical Hawaii Vacation Package


Sort By Name
Durable [weight=2.89, units=Lbs, getId()=5, getItemPrice()=12.49, getItemName()=Chair, getItemDescription()=folding chair, toString()=ItemAPI [ID=5, Item Price=12.49, Item Name=Chair, Item Description=folding chair], getClass()=class neu.edu.csye6200.Durable, hashCode()=1239731077]
ItemAPI [ID=1, Item Price=2.49, Item Name=Cheese, Item Description=Provolone cheese]
startTime=3:30pm, endTime=4:00pm, timeUnits=hours, Id10, ItemPrice=35.0, ItemName=Lessons, ItemDescription=Guitar Lessons
Durable [weight=27.6, units=kg, getId()=7, getItemPrice()=101.49, getItemName()=Mattress, getItemDescription()=Air Mattress, toString()=ItemAPI [ID=7, Item Price=101.49, Item Name=Mattress, Item Description=Air Mattress], getClass()=class neu.edu.csye6200.Durable, hashCode()=1134712904]
ItemAPI [ID=3, Item Price=1.49, Item Name=Milk, Item Description=Almond Milk]
ItemAPI [ID=2, Item Price=3.49, Item Name=OJ, Item Description=Tropicana Oriage Juice]
Durable [weight=2.5, units=oz, getId()=8, getItemPrice()=6.89, getItemName()=Slippers, getItemDescription()=bath slippers, toString()=ItemAPI [ID=8, Item Price=6.89, Item Name=Slippers, Item Description=bath slippers], getClass()=class neu.edu.csye6200.Durable, hashCode()=985922955]
ItemAPI [ID=4, Item Price=0.89, Item Name=Snack, Item Description=Mounds chocolate bar]
Durable [weight=98.3, units=kg, getId()=6, getItemPrice()=384.49, getItemName()=Treadmill, getItemDescription()=Voyager Pro Treadmill, toString()=ItemAPI [ID=6, Item Price=384.49, Item Name=Treadmill, Item Description=Voyager Pro Treadmill], getClass()=class neu.edu.csye6200.Durable, hashCode()=557041912]
startTime=3/12/22, endTime=3/18/22, timeUnits=dates, Id9, ItemPrice=596.89, ItemName=Vacation, ItemDescription=Tropical Hawaii Vacation Package


Sort By Description
Durable [weight=27.6, units=kg, getId()=7, getItemPrice()=101.49, getItemName()=Mattress, getItemDescription()=Air Mattress, toString()=ItemAPI [ID=7, Item Price=101.49, Item Name=Mattress, Item Description=Air Mattress], getClass()=class neu.edu.csye6200.Durable, hashCode()=1134712904]
ItemAPI [ID=3, Item Price=1.49, Item Name=Milk, Item Description=Almond Milk]
Durable [weight=2.5, units=oz, getId()=8, getItemPrice()=6.89, getItemName()=Slippers, getItemDescription()=bath slippers, toString()=ItemAPI [ID=8, Item Price=6.89, Item Name=Slippers, Item Description=bath slippers], getClass()=class neu.edu.csye6200.Durable, hashCode()=985922955]
Durable [weight=2.89, units=Lbs, getId()=5, getItemPrice()=12.49, getItemName()=Chair, getItemDescription()=folding chair, toString()=ItemAPI [ID=5, Item Price=12.49, Item Name=Chair, Item Description=folding chair], getClass()=class neu.edu.csye6200.Durable, hashCode()=1239731077]
startTime=3:30pm, endTime=4:00pm, timeUnits=hours, Id10, ItemPrice=35.0, ItemName=Lessons, ItemDescription=Guitar Lessons
ItemAPI [ID=4, Item Price=0.89, Item Name=Snack, Item Description=Mounds chocolate bar]
ItemAPI [ID=1, Item Price=2.49, Item Name=Cheese, Item Description=Provolone cheese]
startTime=3/12/22, endTime=3/18/22, timeUnits=dates, Id9, ItemPrice=596.89, ItemName=Vacation, ItemDescription=Tropical Hawaii Vacation Package
ItemAPI [ID=2, Item Price=3.49, Item Name=OJ, Item Description=Tropicana Oriage Juice]
Durable [weight=98.3, units=kg, getId()=6, getItemPrice()=384.49, getItemName()=Treadmill, getItemDescription()=Voyager Pro Treadmill, toString()=ItemAPI [ID=6, Item Price=384.49, Item Name=Treadmill, Item Description=Voyager Pro Treadmill], getClass()=class neu.edu.csye6200.Durable, hashCode()=557041912]
neu.edu.csye6200.Midterm.main()... done!

  * 
  */
