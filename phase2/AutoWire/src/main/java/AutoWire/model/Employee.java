package AutoWire.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Employee {
	private int id;
	private String name;
	
	private Address address;
	
	
	
	
	public Address getAddress() {
		return address;
	}
	@Autowired
@Qualifier("add2")
	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
