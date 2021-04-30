package homeworkDay3;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullan�c� sisteme eklendi : " + user.getFirstName() + " " + user.getLastName());
	}

	public void delete(User user) {
		System.out.println("Kullan�c� bilgileri sistemden silindi : " + user.getFirstName() + " " + user.getLastName());
	}

	public void update(User user) {
		System.out.println("Kullan�c� bilgileri g�ncellendi : " + user.getFirstName() + " " + user.getLastName());
	}

	public void addMultiple(User[] instructors) {
		for (User instructor : instructors) {
			add(instructor);
		}
	}

}
