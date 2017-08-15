package org.job.registeration.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PostPersist;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

public class CandidatePersonalDetail implements Serializable{
	
	private static final long serialVersionUID = -7794296376228595791L;

	private int Id;
	
	@NotNull(message="Error cannot be null")
	private String FullName;
	
	@NotNull
	private String FatherName;
	
	@NotNull
	private String MotherName;
	
	@NotNull
	private String HscRollNo;
	
	@NotNull
	private Date BirthDate;
	
	@NotNull
	private String Gender;
	
	@NotNull
	private CandidateDetail candidateDetail;
	
	private CandidateDisabilityDetail candidateDisabilityDetail;
	
	@NotNull
	private CandidateContactDetail candidateContactDetail;

	public CandidatePersonalDetail(){};

	public CandidatePersonalDetail(String fullName, String fatherName, String motherName, String hscRollNo,
			Date birthDate, String gender) {
		super();
		FullName = fullName;
		FatherName = fatherName;
		MotherName = motherName;
		HscRollNo = hscRollNo;
		BirthDate = birthDate;
		Gender = gender;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public String getHscRollNo() {
		return HscRollNo;
	}
	public void setHscRollNo(String hscRollNo) {
		HscRollNo = hscRollNo;
	}
	public Date getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public CandidateDetail getCandidateDetail() {
		return candidateDetail;
	}
	public void setCandidateDetail(CandidateDetail candidateDetail) {
		this.candidateDetail = candidateDetail;
	}
	
	public CandidateDisabilityDetail getCandidateDisabilityDetail() {
		return candidateDisabilityDetail;
	}
	public void setCandidateDisabilityDetail(CandidateDisabilityDetail candidateDisabilityDetail) {
		this.candidateDisabilityDetail = candidateDisabilityDetail;
	}
	public CandidateContactDetail getCandidateContactDetail() {
		return candidateContactDetail;
	}
	public void setCandidateContactDetail(CandidateContactDetail candidateContactDetail) {
		this.candidateContactDetail = candidateContactDetail;
	}
	@Override
	public String toString() {
		return "CandidatePersonalDetail [Id=" + Id + ", FullName=" + FullName + ", FatherName=" + FatherName
				+ ", MotherName=" + MotherName + ", HscRollNo=" + HscRollNo + ", BirthDate=" + BirthDate + ", Gender="
				+ Gender + ", candidateDetail=" + candidateDetail + ", candidateDisabilityDetail="
				+ candidateDisabilityDetail + ", candidateContactDetail=" + candidateContactDetail + "]";
	}

/*	@PostPersist
	public void initializeCandidateDetailID()
	{
		System.out.println("reached here");
		this.candidateDetail.setId(Id);
		this.candidateContactDetail.setId(Id);
		if(getCandidateDisabilityDetail()==null)
		{
			System.out.println("null is cached");
		}
		else
		{		
			this.candidateDisabilityDetail.setId(Id);
			System.out.println("not null");
		}
		System.out.println("reached here"+Id);
	}
*/


}
