class FoodLog {
	String name;
	float calories;
	String time;
	String date;
	FoodLog(String n, float c, String t, String d) {
		this.name = n;
		this.calories = c;
		this.time = t;
		this.date = d;
	}

	public String getName() {
		return this.name;
	}

	public float getCalories() {
		return this.calories;
	}

	public String getTime() {
		return this.time;
	}

	public String getDate() {
		return this.date;
	}
}

class Waterlog {
	private float amount;
	private String date;
	Waterlog(float a, String d) {
		this.amount = a;
		this.date = d;
	}

	public float getAmount() {
		return this.amount;
	}

	public String getDate() {
		return this.date;
	}
}

class PhysicalActivites {
	String name;
	String date;
	String startTime;
	String endTime;
	String notes;
	PhysicalActivites(String n, String d, String st, String et, String t) {
		this.name = n;
		this.date = d;
		this.startTime = st;
		this.endTime = et;
		this.notes = t;
	}

	public String getName() {
		return this.name;
	}

	public String getDate() {
		return this.date;
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
}

class Weight {
	float weight;
	float fat;
	String date;
	Weight(float kg, float f, String d) {
		this.weight = kg;
		this.fat = f;
		this.date = d;
	}

	public float getWeight() {
		return this.weight;
	}

	public float getFat() {
		return this.fat;
	}

	public String getDate() {
		return this.date;
	}
}

class Sleep {
	String date;
	String startTime;
	String endTime;
	Sleep(String d, String st, String et) {
		this.date = d;
		this.startTime = st;
		this.endTime = et;

	}

	public String getDate() {
		return this.date;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}
}

class Summary {
	List<FoodLog> food;
	List<Waterlog> water;
	List<PhysicalActivites> activities;
	List<Weight> weight;
	List<Sleep> sleep;
	FoodLog f = new FoodLog("dosa", 3, "9:00", "18/9/18");

	public void addToFood(FoodLog f) {
		food.add(f);
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i).getName());
			System.out.println(food.get(i).getCalories());
			System.out.println(food.get(i).getDate());
			System.out.println(food.get(i).getTime());
		}
	}
	public void addToWater(Waterlog item) {
		water.add(item);
	}
	public void addToPhysicalActivities(PhysicalActivites item) {
		activities.add(item);
	}
	public void addToWeight(Weight item) {
		weight.add(item);
	}
	public void addToSleep(Sleep item) {
		sleep.add(item);
	}
}
 
 class Solution {
 public static void main(String[] args) {
 	
 }
}