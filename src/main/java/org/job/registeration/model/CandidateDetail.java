package org.job.registeration.model;

import javax.validation.constraints.NotNull;

public class CandidateDetail {
	
	private int Id;
	
	private String CandidateIdentificationMark;
	
	@NotNull
	private String CandidateCategory;
	
	@NotNull
	private String IsCandidateFromMinority;
	
	@NotNull
	private String CandidateNationality;
	
	@NotNull
	private int IsCandidateHandicapped;
	
	public CandidateDetail()
	{
		
	}
	public CandidateDetail(String candidateIdentificationMark, String candidateCategory, String isCandidateFromMinority,
			String candidateNationality, int isCandidateHandicapped) {
		super();
		CandidateIdentificationMark = candidateIdentificationMark;
		CandidateCategory = candidateCategory;
		IsCandidateFromMinority = isCandidateFromMinority;
		CandidateNationality = candidateNationality;
		IsCandidateHandicapped = isCandidateHandicapped;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCandidateIdentificationMark() {
		return CandidateIdentificationMark;
	}
	public void setCandidateIdentificationMark(String candidateIdentificationMark) {
		CandidateIdentificationMark = candidateIdentificationMark;
	}
	public String getCandidateCategory() {
		return CandidateCategory;
	}
	public void setCandidateCategory(String candidateCategory) {
		CandidateCategory = candidateCategory;
	}
	public String getIsCandidateFromMinority() {
		return IsCandidateFromMinority;
	}
	public void setIsCandidateFromMinority(String isCandidateFromMinority) {
		IsCandidateFromMinority = isCandidateFromMinority;
	}
	public String getCandidateNationality() {
		return CandidateNationality;
	}
	public void setCandidateNationality(String candidateNationality) {
		CandidateNationality = candidateNationality;
	}
	public int getIsCandidateHandicapped() {
		return IsCandidateHandicapped;
	}
	public void setIsCandidateHandicapped(int isCandidateHandicapped) {
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
