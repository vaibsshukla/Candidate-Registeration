package org.job.registeration.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="candidate_disability_detail")
public class CandidateDisabilityDetail {
	
	@Id
	@Column(name="id",nullable=true)
/*	@GeneratedValue(generator="idgen1")
	@GenericGenerator(name="idgen1",strategy="foreign",parameters={@Parameter(value="candidatePersonalDetail",name="property")})*/
	private int Id;
	
	@Column(name="candidate_disability_type")
	private int CandidateDisabilityType;
	
	@Column(name="candidate_percentage_disability")
	private String CandidateDisabilityPercentage;
	
	@Column(name="candidate_disability_certificate_no")
	private String CandidateDisabilityCertificateNo;
	
	@Column(name="candidate_certificate_date")
	private Date CertificateDate;
	
/*	@OneToOne
	@PrimaryKeyJoinColumn
	private CandidatePersonalDetail candidatePersonalDetail;*/

	public CandidateDisabilityDetail(){}
	
	public CandidateDisabilityDetail(int candidateDisabilityType, String candidateDisabilityPercentage,
			String candidateDisabilityCertificateNo, Date certificateDate) {
		super();
		CandidateDisabilityType = candidateDisabilityType;
		CandidateDisabilityPercentage = candidateDisabilityPercentage;
		CandidateDisabilityCertificateNo = candidateDisabilityCertificateNo;
		CertificateDate = certificateDate;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getCandidateDisabilityType() {
		return CandidateDisabilityType;
	}

	public void setCandidateDisabilityType(int candidateDisabilityType) {
		CandidateDisabilityType = candidateDisabilityType;
	}

	public String getCandidateDisabilityPercentage() {
		return CandidateDisabilityPercentage;
	}

	public void setCandidateDisabilityPercentage(String candidateDisabilityPercentage) {
		CandidateDisabilityPercentage = candidateDisabilityPercentage;
	}

	public String getCandidateDisabilityCertificateNo() {
		return CandidateDisabilityCertificateNo;
	}

	public void setCandidateDisabilityCertificateNo(String candidateDisabilityCertificateNo) {
		CandidateDisabilityCertificateNo = candidateDisabilityCertificateNo;
	}

	public Date getCertificateDate() {
		return CertificateDate;
	}

	public void setCertificateDate(Date certificateDate) {
		CertificateDate = certificateDate;
	}

/*	public CandidatePersonalDetail getCandidatePersonalDetail() {
		return candidatePersonalDetail;
	}

	public void setCandidatePersonalDetail(CandidatePersonalDetail candidatePersonalDetail) {
		this.candidatePersonalDetail = candidatePersonalDetail;
	}*/

	@Override
	public String toString() {
		return "CandidateDisabilityDetail [Id=" + Id + ", CandidateDisabilityType=" + CandidateDisabilityType
				+ ", CandidateDisabilityPercentage=" + CandidateDisabilityPercentage
				+ ", CandidateDisabilityCertificateNo=" + CandidateDisabilityCertificateNo + ", CertificateDate="
				+ CertificateDate + "]";
	}



}
