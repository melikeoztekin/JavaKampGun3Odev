package homeworkDay3;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("��renci sisteme eklendi : " +user.getFirstName()+" "+ user.getLastName());
	}

	@Override
	public void delete(User user) {
		System.out.println("��renci sistemden silindi : " +user.getFirstName()+" "+ user.getLastName());
	}

	@Override
	public void update(User user) {
		System.out.println("��renci bilgileri g�ncellendi : " +user.getFirstName()+" "+ user.getLastName());
	}
}
