public class Fall extends Inanimate implements ActionsOfFall {
	public Fall (String name) {
		super (name);
	}
	@Override
	public void Delay() {
        System.out.println (getName() + " задерживается");
	}
}