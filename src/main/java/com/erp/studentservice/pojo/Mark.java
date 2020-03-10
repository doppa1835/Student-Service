package com.erp.studentservice.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the marks database table.
 * 
 */
@Entity
@Table(name="marks")
@NamedQuery(name="Mark.findAll", query="SELECT m FROM Mark m")
public class Mark implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private int external;

	private int internal;

	@Column(name="is_attended")
	private byte isAttended;

	@Column(name="is_mid_exam")
	private byte isMidExam;

	@Column(name="is_passed")
	private byte isPassed;

	@Column(name="mid_number")
	private int midNumber;

	private Long student;

	private Long subject;

	@Column(name="updated_on")
	private Long updatedOn;

	public Mark() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getExternal() {
		return this.external;
	}

	public void setExternal(int external) {
		this.external = external;
	}

	public int getInternal() {
		return this.internal;
	}

	public void setInternal(int internal) {
		this.internal = internal;
	}

	public byte getIsAttended() {
		return this.isAttended;
	}

	public void setIsAttended(byte isAttended) {
		this.isAttended = isAttended;
	}

	public byte getIsMidExam() {
		return this.isMidExam;
	}

	public void setIsMidExam(byte isMidExam) {
		this.isMidExam = isMidExam;
	}

	public byte getIsPassed() {
		return this.isPassed;
	}

	public void setIsPassed(byte isPassed) {
		this.isPassed = isPassed;
	}

	public int getMidNumber() {
		return this.midNumber;
	}

	public void setMidNumber(int midNumber) {
		this.midNumber = midNumber;
	}

	public Long getStudent() {
		return this.student;
	}

	public void setStudent(Long student) {
		this.student = student;
	}

	public Long getSubject() {
		return this.subject;
	}

	public void setSubject(Long subject) {
		this.subject = subject;
	}

	public Long getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Long updatedOn) {
		this.updatedOn = updatedOn;
	}

}