package com.erp.studentservice.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the fee database table.
 * 
 */
@Entity
@NamedQuery(name="Fee.findAll", query="SELECT f FROM Fee f")
public class Fee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="accepted_by")
	private Long acceptedBy;

	private int amount;

	@Column(name="paid_on")
	private Long paidOn;

	@Column(name="receipt_path")
	private String receiptPath;

	private Long student;

	@Column(name="transaction_id")
	private String transactionId;

	@Column(name="transaction_type")
	private String transactionType;

	public Fee() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAcceptedBy() {
		return this.acceptedBy;
	}

	public void setAcceptedBy(Long acceptedBy) {
		this.acceptedBy = acceptedBy;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Long getPaidOn() {
		return this.paidOn;
	}

	public void setPaidOn(Long paidOn) {
		this.paidOn = paidOn;
	}

	public String getReceiptPath() {
		return this.receiptPath;
	}

	public void setReceiptPath(String receiptPath) {
		this.receiptPath = receiptPath;
	}

	public Long getStudent() {
		return this.student;
	}

	public void setStudent(Long student) {
		this.student = student;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

}