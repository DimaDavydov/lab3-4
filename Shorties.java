public abstract class Shorties implements Information {
	public String ShortyName;
	public Positions.QueuePosition ShortyPosition;
	public int Age;
	public Shorties (String ShortyName, Positions.QueuePosition ShortyPosition, int Age){
		if (ShortyName==""){
			throw new EmptyStringException("Имя не введено");
		}
		this.ShortyName = ShortyName;
		this.ShortyPosition = ShortyPosition;
		this.Age = Age;
	}
	public String getShortyName(){
		return ShortyName;
	}
	public Positions.QueuePosition getShortyPosition(){
		return ShortyPosition;
	}
	public int getAge() throws AgeException {
		if (Age < 0){
			throw new AgeException("Недопустимо отрицательное значение возраста");
		}
		return Age;
	}
	public void ChangePosition (Positions.QueuePosition position){
		this.ShortyPosition = position;
	}
	@Override
	public void getInformation(){
		System.out.println(getShortyName() + " в " + getShortyPosition() + " вереницы малышей");
		}
}