package prob3;

/*
 * 
 오리(Duck) 클래스와 참새(Sparrow) 클래스는

이름을 나타내는 name 데이터를 가지고 있습니다.

메소드로는

Setter/getter 메소드와
날다 fly, 
울다 sing, 
자신의 이름을 화면에 표시 toString()
등을 가지고 있습니다.

 * 
 * */
public abstract class Bird {
	//field
	protected String name;

	//method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public abstract void fly();
	
	public abstract void sing();
	
	
}
