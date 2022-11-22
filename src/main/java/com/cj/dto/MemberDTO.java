package com.cj.dto;

public class MemberDTO {
	private String id;
	private String pw;
	private String name;
	private String addr;
	private int tel;
	private int regdate;
	private int pt;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public int getRegdate() {
		return regdate;
	}
	public void setRegdate(int regdate) {
		this.regdate = regdate;
	}
	public int getPt() {
		return pt;
	}
	public void setPt(int pt) {
		this.pt = pt;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", addr=" + addr + ", tel=" + tel
				+ ", regdate=" + regdate + ", pt=" + pt + "]";
	}
	
}
