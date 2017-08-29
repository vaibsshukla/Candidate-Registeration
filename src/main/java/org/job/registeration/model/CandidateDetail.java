package org.job.registeration.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.job.registeration.model.Candidate.Step2;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class CandidateDetail {
	
	private int Id;
	
	private String CandidateIdentificationMark;
	
	@NotNull
	@NumberFormat(style=Style.NUMBER)
	@Min(value=1, message="Select Category",groups={Step2.class})
	private Integer CandidateCategory;
	
	@NotNull
	@NumberFormat(style=Style.NUMBER)
	@Min(value=1, message="Select Category",groups={Step2.class})
	private Integer IsCandidateFromMinority;
	
	@NotNull
	@NumberFormat(style=Style.NUMBER)
	@Min(value=1, message="Select Category",groups={Step2.class})
	private Integer CandidateNationality;
	
	@NotNull
	@NumberFormat(style=Style.NUMBER)
	@Min(value=1, message="Select Category",groups={Step2.class})
	private Integer IsCandidateHandicapped;
		
	public CandidateDetail()
	{
		
	}
	public CandidateDetail(String candidateIdentificationMark, Integer candidateCategory, Integer isCandidateFromMinority,
			Integer candidateNationality, Integer isCandidateHandicapped) {
		super();
		CandidateIdentificationMark = candidateIdentificationMark;
		CandidateCategory = candidateCategory;
		IsCandidateFromMinority = isCandidateFromMinority;
		CandidateNationality = candidateNationality;
		IsCandidateHandicapped = isCandidateHandicapped;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getCandidateIdentificationMark() {
		return CandidateIdentificationMark;
	}
	public void setCandidateIdentificationMark(String candidateIdentificationMark) {
		CandidateIdentificationMark = candidateIdentificationMark;
	}
	public Integer getCandidateCategory() {
		return CandidateCategory;
	}
	public void setCandidateCategory(Integer candidateCategory) {
		CandidateCategory = candidateCategory;
	}
	public Integer getIsCandidateFromMinority() {
		return IsCandidateFromMinority;
	}
	public void setIsCandidateFromMinority(Integer isCandidateFromMinority) {
		IsCandidateFromMinority = isCandidateFromMinority;
	}
	public Integer getCandidateNationality() {
		return CandidateNationality;
	}
	public void setCandidateNationality(Integer candidateNationality) {
		CandidateNationality = candidateNationality;
	}
	public Integer getIsCandidateHandicapped() {
		return IsCandidateHandicapped;
	}
	public void setIsCandidateHandicapped(Integer isCandidateHandicapped) {
		IsCandidateHandicapped = isCandidateHandicapped;
	}
	@Override
	public String toString() {
		return "CandidateDetail [Id=" + Id + ", CandidateIdentificationMark=" + CandidateIdentificationMark
				+ ", CandidateCategory=" + CandidateCategory + ", IsCandidateFromMinority=" + IsCandidateFromMinority
				+ ", CandidateNationality=" + CandidateNationality + ", IsCandidateHandicapped="
				+ IsCandidateHandicapped + "]";
	}
	
}
