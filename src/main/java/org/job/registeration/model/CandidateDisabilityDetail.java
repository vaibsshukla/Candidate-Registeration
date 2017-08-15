package org.job.registeration.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

public class CandidateDisabilityDetail {
	
	private int Id;
	
	@NotNull
	private int CandidateDisabilityType;
	
	@NotNull
	private String CandidateDisabilityPercentage;
	
	@NotNull
	private String CandidateDisabilityCertificateNo;
	
	@NotNull
	private Date CertificateDate;
	
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

	@Override
	public String toString() {
		return "CandidateDisabilityDetail [Id=" + Id + ", CandidateDisabilityType=" + CandidateDisabilityType
				+ ", CandidateDisabilityPercentage=" + CandidateDisabilityPercentage
				+ ", CandidateDisabilityCertificateNo=" + CandidateDisabilityCertificateNo + ", CertificateDate="
				+ CertificateDate + "]";
	}



}
