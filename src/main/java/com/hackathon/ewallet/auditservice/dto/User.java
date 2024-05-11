package com.hackathon.ewallet.auditservice.dto;

public class User {
	
	String name;
	String email;
	String contact;
	int age;
	long user_type_id;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	public User(String name, String email, String contact, int age, long user_type_id) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.age = age;
		this.user_type_id = user_type_id;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", contact=" + contact + ", age=" + age + ", user_type_id="
				+ user_type_id + "]";
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the user_type_id
	 */
	public long getUser_type_id() {
		return user_type_id;
	}
	/**
	 * @param user_type_id the user_type_id to set
	 */
	public void setUser_type_id(int user_type_id) {
		this.user_type_id = user_type_id;
	}
	
	
}
