public class Rope extends Inanimate implements ActionsOfRope {
	public Rope (String name) {
		super (name);
	}
	@Override
	public void Receive() {
		System.out.println (getName() + " получается");
	}
}