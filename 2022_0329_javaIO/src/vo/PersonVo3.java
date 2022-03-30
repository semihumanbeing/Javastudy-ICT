package vo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/*
VO (Value Object) : 값을 처리하는 객체
1. 어떤 데이터를 저장 관리하는 객체
2. getters / setters를 구현해놔야한다.
cf) DTO, TO : Data Transfer Object (데이터 전달 객체)
*/

public class PersonVo3 implements Externalizable{
	
	private String name;
	transient private int age; // 해당필드는 직렬화에서 제외된다.
	private String address;
	
	
	// overload된 생성자가 있을 경우 반드시 기본 생성자도 만들어야 한다.
	public PersonVo3() {
	}
	
	public PersonVo3(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		String str = String.format("%s-%d-%s", name, age, address);
		return str;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name); // 이러면 직렬화가 된다, 꼭 저장 순서를 일치해야한다.
		out.writeInt(age);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		age = in.readInt();
		
	}

}
