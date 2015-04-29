package org.anupam.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserInfo {

	private String name;
	private String age;
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserInfo(String name, String age){
		this.name= name;
		this.age = age;
	}
	
	public UserInfo(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}	
	
}
