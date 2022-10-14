package stereoType.stereoType;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int id;
	private String name;
	
	private school class1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public school getClass1() {
		return class1;
	}

	public void setClass1(school class1) {
		this.class1 = class1;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", class1=" + class1 + "]";
	}

	

}
