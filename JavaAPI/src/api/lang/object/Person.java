package api.lang.object;

public class Person implements Cloneable{
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	public boolean equals (Object obj) {
		
		if(obj instanceof Person) {
			Person p = (Person)obj;
			
			String n = p.getName();
			if(n.equals(this.name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		
		return super.clone();
	}
	
	
	//clone메서드를 사용하고 싶다면 ovverride 해야한다
	
	
}
