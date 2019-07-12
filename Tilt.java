public class Tilt extends Inanimate implements ActionsOfTilt {
	public Tilt (String name) {
		super (name);
	}
	@Override
	public void Become() {
		System.out.println (getName() + " делается крутым");
	}
}