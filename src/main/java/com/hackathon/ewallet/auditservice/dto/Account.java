package com.hackathon.ewallet.auditservice.dto;

public class Account {
	
	String bank_name;
	
	Long account_number;
	
	String on_boarding_type_status;
	
	User user_ID;

	/**
	 * @return the bank_name
	 */
	public String getBank_name() {
		return bank_name;
	}

	/**
	 * @param bank_name the bank_name to set
	 */
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	/**
	 * @return the account_number
	 */
	public Long getAccount_number() {
		return account_number;
	}

	/**
	 * @param account_number the account_number to set
	 */
	public void setAccount_number(Long account_number) {
		this.account_number = account_number;
	}

	/**
	 * @return the on_boarding_type_status
	 */
	public String getOn_boarding_type_status() {
		return on_boarding_type_status;
	}

	/**
	 * @param on_boarding_type_status the on_boarding_type_status to set
	 */
	public void setOn_boarding_type_status(String on_boarding_type_status) {
		this.on_boarding_type_status = on_boarding_type_status;
	}

	/**
	 * @return the user_ID
	 */
	public User getUser_ID() {
		return user_ID;
	}

	/**
	 * @param user_ID the user_ID to set
	 */
	public void setUser_ID(User user_ID) {
		this.user_ID = user_ID;
	}

	public Account(String bank_name, Long account_number, String on_boarding_type_status, User user_ID) {
		super();
		this.bank_name = bank_name;
		this.account_number = account_number;
		this.on_boarding_type_status = on_boarding_type_status;
		this.user_ID = user_ID;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
