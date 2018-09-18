import java.util.Scanner;


class FoodLog {
	String name;
	String quantity;
	String date;
	String time;
	FoodLog(String f, String q, String d, String t) {
		this.name = f;
		this.quantity = q;
		this.date = d;
		this.time = t;
	}
	public String getFoodName() {
		return this.name;
	}
	public String getFoodQuantity() {
		return this.quantity;
	}
	public String getDate() {
		return this.date;
	}
	public String getFoodTime() {
		return this.time;
	}
	public String toString() {
		return "Food" + "\n" + "Date:" + getDate() + "Time:" + getFoodTime() + "\n" + "Name:" +  getFoodName() +"\n" + "Quantity:" +  getFoodQuantity() + "\n";
	}
}
class WaterLog {
	String quantity;
	String date;
	String time;
	WaterLog(String q, String d, String t) {
		this.quantity = q;
		this.date = d;
	}
	public String getWaterQuantity() {
		return this.quantity;
	}
	public String getDate() {
		return this.date;
	}
	public String toString() {
		return "Water" + "\n" + "Date:" +  getDate() + "\n" + "Quantity:" + getWaterQuantity() + "\n";
	}
}
class PhysicalActivitiesLog {
	String nameOfActivity;
	String startTime;
	String endTime;
	String notes;
	String date;
	PhysicalActivitiesLog(String n,  String no, String d, String st, String et) {
	 this.nameOfActivity  = n;
	 this.startTime = st;
	 this.endTime = et;
	 this.notes = no;
	 this.date = d;
	}
	public String getActivityName() {
		return this.nameOfActivity;
	}
	public String getStartTime() {
		return this.startTime;
	}
	public String getEndTime() {
		return this.endTime;
	}
	public String getNotes() {
		return this.notes;
	}
	public void setNotes(String s) {
		notes = s;
	}
	public String getDate() {
		return this.date;
	}
	public String toString() {
		return "PhysicalActivity" + "\n" + "Name:" + getActivityName() + "\n" + "Notes:" + getNotes() + "\n" + "Date:" + getDate() + "\n" + "Starttime:" + getStartTime() + "\n" + "Endtime:" + getEndTime() + "\n";
	}
}
class WeightLog {
	String weight;
	String fat;
	String date;
	String time;
	WeightLog(String d, String t, String w, String f) {
		this.weight = w;
		this.fat = f;
		this.date = d;
		this.time = t;
	}
	public String getWeight() {
		return this.weight;
	}
	public String getFat() {
		return this.fat;
	}
	public String getDate() {
		return this.date;
	}
	public String getTime() {
		return this.time;
	}
	public String toString() {
		return "Weight" + "\n" + "Date:" + getDate() + "\n" + "Time:" + getTime() + "\n" + "Weight:" + getWeight() + "\n" + "Fat:" + getFat() + "\n";
	}
}
class SleepLog {
	String startTime;
	String endTime;
	String date;
	SleepLog(String d, String st, String et) {
		this.startTime = st;
		this.endTime = et;
		this.date = d;
	}
	public String getStartTime() {
		return this.startTime;
	}
	public String getEndTime() {
		return this.endTime;
	}
	public String getDate() {
		return this.date;
	}
	public String toString() {
		return "Sleep" + "\n" + "Date:" + getDate() + "\n" + "Starttime:" + getStartTime() + "\n" + "Endtime:" + getEndTime() + "\n";
	}
}


class FitByte {
	List<FoodLog> foodlist = new List<FoodLog>();
	List<WaterLog> waterlist = new List<WaterLog>();
	List<PhysicalActivitiesLog> physicalActivitieslist = new List<PhysicalActivitiesLog>();
	List<WeightLog> weightlist = new List<WeightLog>();
	List<SleepLog> sleeplist = new List<SleepLog>();
	FitByte() {

	}
	public void addFood(FoodLog food) {
		foodlist.add(food);
	}
	public void addWater(WaterLog water) {
		waterlist.add(water);
	}
	public void addPhysicalActivities(PhysicalActivitiesLog physicalActivities) {
		physicalActivitieslist.add(physicalActivities);
	}
	public void addWeight(WeightLog weight) {
		weightlist.add(weight);
	}
	public void addSleep(SleepLog sleep) {
		sleeplist.add(sleep);
	}
	public void foodlog() {
		if (foodlist.size() == 0) {
			System.out.println("None");
			System.out.println("\n");
		}
		for (int i = 0; i < foodlist.size(); i++) {
			System.out.println(foodlist.get(i).toString());
		}		
	}
	public void waterlog() {
		if (waterlist.size() == 0) {
			System.out.println("None");
			System.out.print("\n");

		}
		for (int i = 0; i < waterlist.size(); i++) {
			System.out.println(waterlist.get(i).toString());
		}		
	}
	public void physicalactivitylog() {
		if (physicalActivitieslist.size() == 0) {
			System.out.println("PhysicalActivity");
			System.out.println("None");
			System.out.print("\n");
		}
		for (int i = 0; i < physicalActivitieslist.size(); i++) {
			System.out.println(physicalActivitieslist.get(i).toString());
		}		
	}
	public void weightlog() {
		if (weightlist.size() == 0) {
			System.out.println("None");
			System.out.print("\n");
		}
		for (int i = 0; i < weightlist.size(); i++) {
			System.out.println(weightlist.get(i).toString());
		}	
	}
	public void sleeplog() {
		if (sleeplist.size() == 0) {
			System.out.println("None");
			System.out.print("\n");
		}
		for (int i = 0; i < sleeplist.size(); i++) {
			System.out.println(sleeplist.get(i).toString());
		}
	}
	public void summary() {
		foodlog();
		waterlog();
		physicalactivitylog();
		weightlog();
		sleeplog();	
	}
	public void summary(String date) {
		for (int i = 0; i < foodlist.size(); i++) {
			if (date.equals(foodlist.get(i).getDate())){
				System.out.print(foodlist.get(i).toString());
			}
		}
		for (int i = 0; i < waterlist.size(); i++) {
			if (date.equals(waterlist.get(i).getDate())){
				System.out.print(waterlist.get(i).toString());
			}		
		}
		for (int i = 0; i < physicalActivitieslist.size(); i++) {
			if (date.equals(physicalActivitieslist.get(i).getDate())){
				System.out.print(physicalActivitieslist.get(i).toString());
			}		
		}
		for (int i = 0; i < weightlist.size(); i++) {
			if (date.equals(weightlist.get(i).getDate())){
				System.out.print(weightlist.get(i).toString());
			}		
		}
		for (int i = 0; i < sleeplist.size(); i++) {
			if (date.equals(sleeplist.get(i).getDate())){
				System.out.print(sleeplist.get(i).toString());
			}		
		}
	}
}
public class Solution {
	protected Solution() {

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FitByte d = new FitByte();
		while (sc.hasNext()) {
		String line = sc.nextLine();
		String[] tokens = line.split(" ");
		switch(tokens[0]) {
			case "Food":
			String[] check = tokens[1].split(",");
			FoodLog f = new FoodLog(check[0], check[1], check[2], check[3]);
			d.addFood(f); 
			break;
			case "Water":
			check = tokens[1].split(",");
			WaterLog water = new WaterLog(check[0], check[1], check[2]);
			d.addWater(water); 
			break;
			case "PhysicalActivity":
			check = tokens[1].split(",");
			PhysicalActivitiesLog p = new PhysicalActivitiesLog(check[0], check[1], check[2], check[3], check[4]);
			d.addPhysicalActivities(p);
			break;
			case "Weight":
			check = tokens[1].split(",");
			WeightLog weight = new WeightLog(check[0], check[1], check[2], check[3]);
			d.addWeight(weight);
			break;
			case "Sleep":
			check = tokens[1].split(",");
			SleepLog sleep = new SleepLog(check[0], check[1], check[2]);
			d.addSleep(sleep);
			break;
			case "Summary" :
			if (tokens.length == 1) {
				d.summary();
			} else {
				d.summary(tokens[1]);
			}
			break;
			case "Foodlog":
			d.foodlog();
			break;
			case "Waterlog":
			d.waterlog();
			break;
			case "PhysicalActivitylog":
			d.physicalactivitylog();
			break;
			case "Weightlog":
			d.weightlog();
			break;
			case "Sleeplog":
			d.sleeplog();
			break;
			default:
			}			
		}

	}
}
