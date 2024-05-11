package com.hackathon.ewallet.auditservice.dto;

public class Transaction {
	
	int transaction_id;
	
	Account acc_id;
	
	Merchant merchant_id;
	
	Transaction transaction_description;
	
	Transaction status_id;
	
	Transaction date_time;
	
	double amount;

	/**
	 * @return the transaction_id
	 */
	public int getTransaction_id() {
		return transaction_id;
	}

	public Transaction(int transaction_id, Account acc_id, Merchant merchant_id, Transaction transaction_description,
			Transaction status_id, Transaction date_time, double amount) {
		super();
		this.transaction_id = transaction_id;
		this.acc_id = acc_id;
		this.merchant_id = merchant_id;
		this.transaction_description = transaction_description;
		this.status_id = status_id;
		this.date_time = date_time;
		this.amount = amount;
	}

	/**
	 * @param transaction_id the transaction_id to set
	 */
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	/**
	 * @return the acc_id
	 */
	public Account getAcc_id() {
		return acc_id;
	}

	/**
	 * @param acc_id the acc_id to set
	 */
	public void setAcc_id(Account acc_id) {
		this.acc_id = acc_id;
	}

	/**
	 * @return the merchant_id
	 */
	public Merchant getMerchant_id() {
		return merchant_id;
	}

	/**
	 * @param merchant_id the merchant_id to set
	 */
	public void setMerchant_id(Merchant merchant_id) {
		this.merchant_id = merchant_id;
	}

	/**
	 * @return the transaction_description
	 */
	public Transaction getTransaction_description() {
		return transaction_description;
	}

	/**
	 * @param transaction_description the transaction_description to set
	 */
	public void setTransaction_description(Transaction transaction_description) {
		this.transaction_description = transaction_description;
	}

	/**
	 * @return the status_id
	 */
	public Transaction getStatus_id() {
		return status_id;
	}

	/**
	 * @param status_id the status_id to set
	 */
	public void setStatus_id(Transaction status_id) {
		this.status_id = status_id;
	}

	/**
	 * @return the date_time
	 */
	public Transaction getDate_time() {
		return date_time;
	}

	/**
	 * @param date_time the date_time to set
	 */
	public void setDate_time(Transaction date_time) {
		this.date_time = date_time;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
