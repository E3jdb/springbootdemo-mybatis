package com.example.chj.bean;

public class User {

	
	public int master;
	
	public int b;
	public int bb1;
	public int bb2;
	
	
	private int aa;
	
	private Integer Id;
	private String Name;
	private Integer Age;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	
	
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", Age=" + Age + "]";
	}
	
}
