package org.job.registeration.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="candidate_personal_detail")
public class CandidatePersonalDetail implements Serializable{
	
	private static final long serialVersionUID = -7794296376228595791L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column(name="candiate_full_name")
	private String FullName;
	
	@Column(name="candiate_father_name")
	private String FatherName;
	
	@Column(name="candidate_mother_name")
	private String MotherName;
	
	@Column(name="candidate_hsc_roll_no")
	private String HscRollNo;
	
	@Column(name="candidate_birth_date")
	private Date BirthDate;
	
	@Column(name="candidate_gender")
	private String Gender;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private CandidateDetail candidateDetail;
	
	@OneToOne(cascade=CascadeType.ALL,optional=true)
	@PrimaryKeyJoinColumn
	@NotFound(action=NotFoundAction.IGNORE)
	private CandidateDisabilityDetail candidateDisabilityDetail;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private CandidateContactDetail candidateContactDetail;

	public CandidatePersonalDetail(){};
	public CandidatePersonalDetail(String fullName, String fatherName, String motherName, String hscRollNo,
			Date birthDate, String gender, CandidateDetail candidateDetail) {
		super();
		FullName = fullName;
		FatherName = fatherName;
		MotherName = motherName;
		HscRollNo = hscRollNo;
		BirthDate = birthDate;
		Gender = gender;
		this.candidateDetail = candidateDetail;
//		this.candidateDisabilityDetail = candidateDisabilityDetail;
//		this.candidateContactDetail = candidateContactDetail;
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

	@PostPersist
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

	@Override
	public String toString() {
		return "CandidatePersonalDetail [Id=" + Id + ", FullName=" + FullName + ", FatherName=" + FatherName
				+ ", MotherName=" + MotherName + ", HscRollNo=" + HscRollNo + ", BirthDate=" + BirthDate + ", Gender="
				+ Gender + ", candidateDetail=" + candidateDetail +  "]";
	}


}
