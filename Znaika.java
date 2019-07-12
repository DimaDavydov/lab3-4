public class Znaika extends Shorties implements ActionsOfZnaika {
	public Znaika (String name, Positions.QueuePosition position, int age) {
		super (name, position, age);
	}
	@Override
	public void Drag() {
		System.out.println (getShortyName() + " подтаскивает к себе на верёвке Клёпку");
	}
	@Override
	public void Dispose() {
		System.out.println (getShortyName() + " распоряжается");
	}
	@Override
	public void Fear() {
		System.out.println (getShortyName() + " боится продолжать спуск");
	}
	@Override
	public void Order() {
		System.out.println (getShortyName() + " отдаёт приказы");
	}
	@Override
	public void Bind() {
		System.out.println (getShortyName() + " связывает между собой мотки капронового шнура");
	}
	@Override
	public void Tie() {
		System.out.println (getShortyName() + " привязывает конец верёвки к поясу Стекляшкина");
	}
	@Override
	public void Command() {
		System.out.println (getShortyName() + " велит спускаться");
	}
	@Override
	public void ChangePosition (Positions.QueuePosition position) {
		System.out.println (getShortyName() + " теперь находится в " + position + " вереницы малышей");
	}
    @Override
	public void getInformation(){
		System.out.println(getShortyName() + " в " + getShortyPosition() + " вереницы малышей");
		}
	public void Appear() {
		System.out.println (getShortyName() + " появилось на льду");
	}
	@Override
	public String toString() {
		return getShortyName() + " сейчас находится в " + getShortyPosition() + " вереницы малышей";
	}
	@Override
    public boolean equals(Object obj) {
		if (this == obj)
          return true;
      if (obj == null)
          return false;
      if (getClass() != obj.getClass())
          return false;
	  Znaika other = (Znaika) obj;
	  if (this.ShortyName != other.ShortyName)
          return false;
	  if (this.ShortyPosition != other.ShortyPosition)
          return false;
	  if (this.Age != other.Age)
          return false;
	  return true;
    }
    @Override
    public int hashCode() {
		int hc;
		hc=8+3*Age;
		hc=2+hc*(int)(ShortyName.length()*2);
		return hc;
	}
}