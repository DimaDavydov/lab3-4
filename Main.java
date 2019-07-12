public class Main {
	public static void main (String[] args) {
		UnnamedShorties u1 = new UnnamedShorties ("Безымянные малыши", Positions.QueuePosition.середине, 8);
		try {
			u1.getAge();
		}
		catch (AgeException e) {
			e.printStackTrace();
        }
        Fall f1 = new Fall ("Падение");
        Znaika z1 = new Znaika ("Знайка", Positions.QueuePosition.начале, 10);
		try {
			z1.getAge();
		}
		catch (AgeException e) {
			e.printStackTrace();
        }
		Znaika ref = new Znaika ("Отражение Знайки", Positions.QueuePosition.начале, 10) {
			public void Appear(){
				System.out.println (getShortyName() + " появилось на льду");
			}
		};
 	    Steklyashkin s1 = new Steklyashkin ("Стекляшкин", Positions.QueuePosition.конце, 9);
		try {
			s1.getAge();
		}
		catch (AgeException e) {
			e.printStackTrace();
        }
	    Tilt t1 = new Tilt ("Наклон тоннеля");
		Rope r1 = new Rope ("Длинная верёвка");
		System.out.println ("Информация о малышах:");
		u1.getInformation();
		z1.getInformation();
		s1.getInformation();
		System.out.println();
		ref.Appear();
		System.out.println();
		u1.Abut();
		f1.Delay();
		z1.Drag();
		z1.Dispose();
		u1.Peg();
		z1.ChangePosition (Positions.QueuePosition.конце);
		u1.Notallow();
		t1.Become();
		z1.Fear();
		z1.Order();
		u1.Cutdown();
		z1.Bind();
		r1.Receive();
		z1.Tie();
		z1.Command();
		s1.Descend();
		u1.Stand();
		u1.Loosen();
		u1.Watch();
    }
}