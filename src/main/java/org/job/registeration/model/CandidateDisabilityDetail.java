package org.job.registeration.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat.Style;

public class CandidateDisabilityDetail {
	
	private int Id;
	
	@NotNull
	@NumberFormat(style=Style.NUMBER)
	@Min(value=1, message="Select Disabilty type")
	private Integer CandidateDisabilityType;
	
	@NotNull
	@NumberFormat(style=Style.NUMBER)
	@Min(value=1, message="Select Disabilty percentage")
	private String CandidateDisabilityPercentage;
	
	@NotEmpty(message="Field Cannot be empty")
	private String CandidateDisabilityCertificateNo;
	
	@NotNull
	@DateTimeFormat(iso = ISO.DATE,pattern="dd-MM-yyyy")
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

	public Integer getCandidateDisabilityType() {
		return CandidateDisabilityType;
	}

	public void setCandidateDisabilityType(Integer candidateDisabilityType) {
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
