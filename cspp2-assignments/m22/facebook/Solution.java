import java.util.*;

class DataBase {
	String user;
	List<String> followers = new List<String>();
	DataBase(String user, String[] follower) {
		this.user = user;
		followers = new List<String>();
		for(int i = 0; i < follower.length; i++) {
			followers.add(follower[i]);
		}
	}

	public String getUser() {
		return this.user;
	}

	public List getFollowers() {
		return followers;
	}

	public String toString() {
		String s = getUser() + ": [";
		for (int i = 0; i < getFollowers().size() - 1; i++) {
			s += getFollowers().get(i) + ", ";
		}
		s += getFollowers().get(getFollowers().size() - 1) + "], ";
		return s;
	}
}


class User {
	List<DataBase> d = new List<DataBase>();
	User() {

	}

	public void addUser(DataBase user) {
		d.add(user);

	}

	public void addConnection(String user, String follower) {
		for(int i = 0; i < d.size(); i++) {
			if (d.get(i).getUser().equals(user)) {
				d.get(i).getFollowers().add(follower);
			}
		}
	}

	public List getConnections(String user) {
		for (int i = 0; i < d.size(); i++) {
			if (d.get(i).getUser().equals(user)) {
				return d.get(i).getFollowers();
			}
		}
		System.out.println("Not a User in Network");
		return null;
	}

	public List getCommonConnections(String user1, String user2) {
		List<String> s1 = getConnections(user1);
		List<String> s2 = getConnections(user2);
		List<String> common = new List<String>();
		if(s1 != null && s2 != null) {
			for(int i = 0; i < s1.size(); i++) {
				if(s2.contains(s1.get(i))) {
					common.add(s1.get(i));
				}
			}
		}
		return common;
	}

	public String toString() {
		String[] keys = new String[d.size()];
		for (int i = 0; i < keys.length; i++) {
			keys[i] = d.get(i).getUser();
		}
		Arrays.sort(keys);
		String d = "";
		int i = 0;
		for (i = 0; i < keys.length - 1; i++) {
			d += keys[i] + ": " + getConnections(keys[i]) + ", ";
		}
		d += keys[i] + ": " + getConnections(keys[i]);
		return d;
	}
}

class Solution {

	private Solution() {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] tokens = sc.nextLine().split(" ");
		int x = Integer.parseInt(tokens[1]);
		User u = new User();
		while (x != 0) {
			String[] line = sc.nextLine().split(" is connected to ");
			String[] followers = line[1].replace(".","").split(", ");
			u.addUser(new DataBase(line[0], followers));
			x -= 1;
		}

	while(sc.hasNext()) {
		String[] check = sc.nextLine().split(" ");
		switch (check[0]) {
			case "addConnections":
				u.addConnection(check[1], check[2]);
			break;
			case "getConnections":
				if(u.getConnections(check[1]) != null) {
					System.out.println(u.getConnections(check[1]));
				}
			break;
			case "CommonConnections":
				System.out.println(u.getCommonConnections(check[1], check[2]));
			break;
			case "Network":
				System.out.println(u);
				break;
			default:
			break;
		} 
	}
				}
			

		}
		

