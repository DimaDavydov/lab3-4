public class Steklyashkin extends Shorties implements ActionsOfSteklyashkin {
	public Steklyashkin (String name, Positions.QueuePosition position, int age) {
		super (name, position, age);
	}
	@Override
	public void Descend() {
		System.out.println (getShortyName() + " осторожно спускается вниз");
	}
    @Override
	public void getInformation(){
		System.out.println(getShortyName() + " в " + getShortyPosition() + " вереницы малышей");
		}
}