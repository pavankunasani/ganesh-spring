package com.example.Pojo;

public class Person {

	private int id;

	private String fistName, lastName, email;

	private int age;

	public int getId() {
		return id;
	}

	public Person setId(int id) {
		this.id = id;
		return this;
	}

	public String getFistName() {
		return fistName;
	}

	public Person setFistName(String fistName) {
		this.fistName = fistName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public Person setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Person setEmail(String email) {
		this.email = email;
		return this;
	}

	public int getAge() {
		return age;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", fistName=" + fistName + ", lastName=" + lastName + ", email=" + email + ", age="
				+ age + "]";
	}

}
