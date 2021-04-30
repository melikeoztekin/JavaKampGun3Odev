package homeworkDay3;

public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("E�itmen sisteme eklendi : " +user.getFirstName()+" "+ user.getLastName());
	}

	@Override
	public void delete(User user) {
		System.out.println("E�itmen sistemden silindi : " +user.getFirstName()+" "+ user.getLastName());
	}

	@Override
	public void update(User user) {
		System.out.println("E�itmen bilgileri g�ncellendi : " +user.getFirstName()+" "+ user.getLastName());
	}
}
