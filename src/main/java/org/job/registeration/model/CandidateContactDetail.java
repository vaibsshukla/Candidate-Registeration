package org.job.registeration.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="candidate_contact_detail")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class CandidateContactDetail implements Serializable{
	
	private static final long serialVersionUID = -3725309972567481456L;

	@Column(name="id")
	@Id
/*	@GeneratedValue(generator="idgen2")
	@GenericGenerator(name="idgen2",strategy="foreign", parameters={@Parameter(name="property",value="candidatePersonalDetail")})*/
	private int Id;
	
	@Column(name="candidate_permanent_address")
	private String CandidatePermanentAddress;
	
	@Column(name="candidate_state")
	private int State;
	
	@Column(name="candidate_city")
	private int City;
	
	@Column(name="candidate_std_code")
	private int CandidateStdCode;
	
	@Column(name="candidate_phone")
	private int CandidatePhone;
	
	@Column(name="candidate_mobile_no")
	private int CandidateMobileNo;
	
	@Column(name="candidate_email_address")
	private String CandidateEmailId;
	
/*	@OneToOne
	@PrimaryKeyJoinColumn
	private CandidatePersonalDetail candidatePersonalDetail;*/

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

/*	public CandidatePersonalDetail getCandidatePersonalDetail() {
		return candidatePersonalDetail;
	}

	public void setCandidatePersonalDetail(CandidatePersonalDetail candidatePersonalDetail) {
		this.candidatePersonalDetail = candidatePersonalDetail;
	}*/

	@Override
	public String toString() {
		return "CandidateContactDetail [Id=" + Id + ", CandidatePermanentAddress=" + CandidatePermanentAddress
				+ ", State=" + State + ", City=" + City + ", CandidateStdCode=" + CandidateStdCode + ", CandidatePhone="
				+ CandidatePhone + ", CandidateMobileNo=" + CandidateMobileNo + ", CandidateEmailId=" + CandidateEmailId
				+ "]";
	}
	
	
}
