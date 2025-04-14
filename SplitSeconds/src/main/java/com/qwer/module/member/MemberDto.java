package com.qwer.module.member;

import java.sql.Date;

public class MemberDto {
	
//	int -> Integer
//	vachar -> String
//	private 
	
	
	private String memberseq;
	private String firstName;
	private String lastName;
	private Integer memberGenderCd;
	private Date brith;
	private String Id;
    private String password;
    private String email;
    private Boolean check;
    private String collectCd;
    private String phoneNumber; 
//	-----
	public String getMemberseq() {
		return memberseq;
	}
	public void setMemberseq(String memberseq) {
		this.memberseq = memberseq;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getMemberGenderCd() {
		return memberGenderCd;
	}
	public void setMemberGenderCd(Integer memberGenderCd) {
		this.memberGenderCd = memberGenderCd;
	}
	public Date getBrith() {
		return brith;
	}
	public void setBrith(Date brith) {
		this.brith = brith;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getCheck() {
		return check;
	}
	public void setCheck(Boolean check) {
		this.check = check;
	}
	public String getCollectCd() {
		return collectCd;
	}
	public void setCollectCd(String collectCd) {
		this.collectCd = collectCd;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}

	
