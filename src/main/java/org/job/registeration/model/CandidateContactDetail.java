package org.job.registeration.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class CandidateContactDetail implements Serializable{
	
	private static final long serialVersionUID = -3725309972567481456L;

	private int Id;
	
	@NotNull
	private String CandidatePermanentAddress;
	
	@NotNull
	private int State;
	
	@NotNull
	private int City;
	
	private int CandidateStdCode;
	
	private int CandidatePhone;
	
	@NotNull
	private int CandidateMobileNo;
	
	@NotNull
	private String CandidateEmailId;
	
	public CandidateContactDetail(){
		
	}
	public CandidateContactDetail(String candidatePermanentAddress, int state, int city, int candidateStdCode,
			int candidatePhone, int candidateMobileNo, String candidateEmailId) {
		super();
		CandidatePermanentAddress = candidatePermanentAddress;
		State = state;
		City = city;
		CandidateStdCode = candidateStdCode;
		CandidatePhone = candidatePhone;
		CandidateMobileNo = candidateMobileNo;
		CandidateEmailId = candidateEmailId;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCandidatePermanentAddress() {
		return CandidatePermanentAddress;
	}

	public void setCandidatePermanentAddress(String candidatePermanentAddress) {
		CandidatePermanentAddress = candidatePermanentAddress;
	}

	public int getState() {
		return State;
	}

	public void setState(int state) {
		State = state;
	}

	public int getCity() {
		return City;
	}

	public void setCity(int city) {
		City = city;
	}

	public int getCandidateStdCode() {
		return CandidateStdCode;
	}

	public void setCandidateStdCode(int candidateStdCode) {
		CandidateStdCode = candidateStdCode;
	}

	public int getCandidatePhone() {
		return CandidatePhone;
	}

	public void setCandidatePhone(int candidatePhone) {
		CandidatePhone = candidatePhone;
	}

	public int getCandidateMobileNo() {
		return CandidateMobileNo;
	}

	public void setCandidateMobileNo(int candidateMobileNo) {
		CandidateMobileNo = candidateMobileNo;
	}

	public String getCandidateEmailId() {
		return CandidateEmailId;
	}

	public void setCandidateEmailId(String candidateEmailId) {
		CandidateEmailId = candidateEmailId;
	}

	@Override
	public String toString() {
		return "CandidateContactDetail [Id=" + Id + ", CandidatePermanentAddress=" + CandidatePermanentAddress
				+ ", State=" + State + ", City=" + City + ", CandidateStdCode=" + CandidateStdCode + ", CandidatePhone="
				+ CandidatePhone + ", CandidateMobileNo=" + CandidateMobileNo + ", CandidateEmailId=" + CandidateEmailId
				+ "]";
	}
	
	
}
