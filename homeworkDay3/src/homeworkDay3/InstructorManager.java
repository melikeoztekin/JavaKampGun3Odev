package homeworkDay3;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("Eðitmen sisteme eklendi : " +user.getFirstName()+" "+ user.getLastName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Eðitmen sistemden silindi : " +user.getFirstName()+" "+ user.getLastName());
	}

	@Override
	public void update(User user) {
		System.out.println("Eðitmen bilgileri güncellendi : " +user.getFirstName()+" "+ user.getLastName());
	}
}
