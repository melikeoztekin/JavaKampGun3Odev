package homeworkDay3;

public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Öðrenci sisteme eklendi : " +user.getFirstName()+" "+ user.getLastName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Öðrenci sistemden silindi : " +user.getFirstName()+" "+ user.getLastName());
	}

	@Override
	public void update(User user) {
		System.out.println("Öðrenci bilgileri güncellendi : " +user.getFirstName()+" "+ user.getLastName());
	}
}
