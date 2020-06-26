package jp.co.internous.node.model.domain;

import jp.co.internous.node.model.form.UserForm;

public class MstUser {
	private long id;
	private String userName;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private long gender; 

	public MstUser() {}
	
	public MstUser(UserForm f) {
		userName = f.getUserName();
		password = f.getPassword();
		familyName = f.getFamilyName();
		firstName = f.getFirstName();
		familyNameKana = f.getFamilyNameKana();
		firstNameKana = f.getFirstNameKana();
		gender = f.getGender();
	}
	
//	 以下getter/setter入力
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id=id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName=familyName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana=familyNameKana;
	}
	public String getFirstNameKana() {
		return firstNameKana;
	}
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana=firstNameKana;
	}
	public long getGender() {
		return gender;
	}
	public void setGender(long gender) {
		this.gender=gender;
	}
}