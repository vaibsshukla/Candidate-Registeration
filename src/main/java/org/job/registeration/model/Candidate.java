package org.job.registeration.model;

import java.sql.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.junit.validator.ValidateWith;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.validation.annotation.Validated;


public class Candidate{
	
	private int Id;
	
	@NotEmpty(message="Error cannot be null")
	private String FullName;
	
	@NotEmpty
	private String FatherName;
	
	@NotEmpty
	private String MotherName;
	
	@NotEmpty
	private String HscRollNo;
	
	@NotNull
	@DateTimeFormat(iso = ISO.DATE,pattern="dd-MM-yyyy")
	private Date BirthDate;
	
	@NotEmpty(message="Select Gender")
	private String Gender;
	
	@NotNull(groups={Step2.class})
	@Valid
	private CandidateDetail candidateDetail;
	
	@NotNull(groups={optional.class})
	@Valid
	private CandidateDisabilityDetail candidateDisabilityDetail;
	
	@NotNull(groups={Step1.class})
	@Valid
	private CandidateContactDetail candidateContactDetail;

	public interface Step1{}
	public interface Step2{}
	public interface Final{}
	public interface optional{}
	
	public Candidate(){};

	public Candidate(String fullName, String fatherName, String motherName, String hscRollNo,
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
		return "Candidate [Id=" + Id + ", FullName=" + FullName + ", FatherName=" + FatherName + ", MotherName="
				+ MotherName + ", HscRollNo=" + HscRollNo + ", BirthDate=" + BirthDate + ", Gender=" + Gender
				+ ", candidateDetail=" + candidateDetail + ", candidateDisabilityDetail=" + candidateDisabilityDetail
				+ ", candidateContactDetail=" + candidateContactDetail + "]";
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
