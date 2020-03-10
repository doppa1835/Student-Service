package com.erp.studentservice.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the student_course database table.
 * 
 */
@Entity
@Table(name="student_course")
@NamedQuery(name="StudentCourse.findAll", query="SELECT s FROM StudentCourse s")
public class StudentCourse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="admission_date")
	private Long admissionDate;

	private Long course;

	@Column(name="current_year")
	private int currentYear;

	@Column(name="entrance_exam")
	private String entranceExam;

	@Column(name="is_placed")
	private byte isPlaced;

	@Column(name="pass_out")
	private Long passOut;

	private int rank;

	@Column(name="roll_number")
	private String rollNumber;

	private Long student;

	@Column(name="university_id")
	private String universityId;

	@Column(name="updated_on")
	private Long updatedOn;

	public StudentCourse() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAdmissionDate() {
		return this.admissionDate;
	}

	public void setAdmissionDate(Long admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Long getCourse() {
		return this.course;
	}

	public void setCourse(Long course) {
		this.course = course;
	}

	public int getCurrentYear() {
		return this.currentYear;
	}

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

	public String getEntranceExam() {
		return this.entranceExam;
	}

	public void setEntranceExam(String entranceExam) {
		this.entranceExam = entranceExam;
	}

	public byte getIsPlaced() {
		return this.isPlaced;
	}

	public void setIsPlaced(byte isPlaced) {
		this.isPlaced = isPlaced;
	}

	public Long getPassOut() {
		return this.passOut;
	}

	public void setPassOut(Long passOut) {
		this.passOut = passOut;
	}

	public int getRank() {
		return this.rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getRollNumber() {
		return this.rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public Long getStudent() {
		return this.student;
	}

	public void setStudent(Long student) {
		this.student = student;
	}

	public String getUniversityId() {
		return this.universityId;
	}

	public void setUniversityId(String universityId) {
		this.universityId = universityId;
	}

	public Long getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Long updatedOn) {
		this.updatedOn = updatedOn;
	}

}