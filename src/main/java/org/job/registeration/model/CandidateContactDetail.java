package org.job.registeration.model;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class CandidateContactDetail implements Serializable{
	
	private static final long serialVersionUID = -3725309972567481456L;

	private int Id;
	
	@NotEmpty
	private String CandidatePermanentAddress;
	
	@NotNull(message="Select state")
	@NumberFormat(style=Style.NUMBER)
	@Min(1)
	private int State;
	
	@NotNull(message="Select City")
	@NumberFormat(style=Style.NUMBER)
	@Min(1)
	private int City;
	
	private int CandidateStdCode;
	
	private int CandidatePhone;
	
	@NotEmpty(message="Mobile no canot be empty")
//	@MobileNo(size=10,message="Invalid Mobile no")
	private String CandidateMobileNo;
	
	@NotEmpty(message="Email cannot be empty")
	private String CandidateEmailId;
	
	public CandidateContactDetail(){
		
	}
	public CandidateContactDetail(String candidatePermanentAddress, int state, int city, int candidateStdCode,
			int candidatePhone, String candidateMobileNo, String candidateEmailId) {
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

	public String getCandidateMobileNo() {
		return CandidateMobileNo;
	}

	public void setCandidateMobileNo(String candidateMobileNo) {
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
