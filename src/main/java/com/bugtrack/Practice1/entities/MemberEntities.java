package com.bugtrack.Practice1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberEntities {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long memberID;
	private String memberFname;
	private String memberLname;
	private String memberCreated;
	
	public MemberEntities() {
		
	}
	
	public MemberEntities(String memberFname, String memberLname, String memberCreated) {
		super();
		this.memberFname = memberFname;
		this.memberLname = memberLname;
		this.memberCreated = memberCreated;
	}
	
	public Long getMemberID() {
		return memberID;
	}
	public void setMemberID(Long memberID) {
		this.memberID = memberID;
	}
	public String getMemberFname() {
		return memberFname;
	}
	public void setMemberFname(String memberFname) {
		this.memberFname = memberFname;
	}
	public String getMemberLname() {
		return memberLname;
	}
	public void setMemberLname(String memberLname) {
		this.memberLname = memberLname;
	}
	public String getMemberCreated() {
		return memberCreated;
	}
	public void setMemberCreated(String memberCreated) {
		this.memberCreated = memberCreated;
	}
	
	
	
}
