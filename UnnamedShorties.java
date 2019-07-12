public class UnnamedShorties extends Shorties implements ActionsOfUnnamedShorties {
	public UnnamedShorties (String name, Positions.QueuePosition position, int age) {
		super (name, position, age);
	}
	@Override
	public void Abut() {
		System.out.println (getShortyName() + " упираются стальными остриями альпенштоков в лед");
	}
	@Override
	public void Peg() {
		System.out.println (getShortyName() + " привязывают Знайку позади всех");
	}
	@Override
	public void Notallow() {
		System.out.println (getShortyName() + " не разрешают Знайке вылезать вперёд");
		tone.getTone(1);
	}
	@Override
	public void Cutdown() {
		System.out.println (getShortyName() + " вырубают во льду ступеньки");
	}
	@Override
	public void Stand() {
		System.out.println (getShortyName() + " стоят на ледяных ступеньках");
		tone.getTone(2);
	}
	@Override
	public void Loosen() {
		System.out.println (getShortyName() + " постепенно отпускают верёвку");
	}
	@Override
	public void Watch() {
		System.out.println (getShortyName() + " тщательно следят, чтобы верёвка не выскользнула из рук");
	}
	@Override
	public void getInformation(){
		System.out.println(getShortyName() + " в " + getShortyPosition() + " вереницы малышей");
		}
	public static class tone{ 
	    public static void getTone(int a ){
			class tone1{ 
			    void show(){
					System.out.println ("вежливо");
				}
			}
			class tone2{ 
			    void show (){
					System.out.println ("в напряжении");
				}
			}
			if (a==1){
                tone1 t1 = new tone1();
                t1.show();
            }
			if (a==2){
                tone2 t2 = new tone2();
                t2.show();
            }
		}
	}
	@Override
    public int hashCode() {
		int hc;
		hc=5+8*Age;
		hc=7+hc*(int)(ShortyName.length()*3);
		return hc;
	}
}