package com.sist.user.domain;

import com.sist.common.DTO;

/**
 * 
 * @author sist_
 *
 */
public class UserVO extends DTO {
	private String id       ;
	private String name     ;
	private String password ;	
	private int    u_level  ;

	private int    login    ;
	private int    recommend;
	private String reg_dt   ;
	


	private int    levelIntValue;//Level int 값
	private String mail ;
	
	
	
	public int getU_level() {
		return u_level;
	}

	public void setU_level(int u_level) {
		this.u_level = u_level;
	}
	
	public String getReg_dt() {
		return reg_dt;
	}

	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}
	
	public int getLevelIntValue() {
		return levelIntValue;
	}

	public void setLevelIntValue(int levelIntValue) {
		this.levelIntValue = levelIntValue;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public UserVO() {
		
	}


	@Override
	public String toString() {
		return "UserVO [id=" + id + ", name=" + name + ", password=" + password + ", u_level=" + u_level + ", login="
				+ login + ", recommend=" + recommend + ", reg_dt=" + reg_dt + ", levelIntValue=" + levelIntValue
				+ ", mail=" + mail + "]";
	}

	
	
	public UserVO(String id, String name, String password, int u_level, int login, int recommend, String reg_dt,
			int levelIntValue, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.u_level = u_level;
		this.login = login;
		this.recommend = recommend;
		this.reg_dt = reg_dt;
		this.levelIntValue = levelIntValue;
		this.mail = mail;
	}

	public int getLogin() {
		return login;
	}

	public void setLogin(int login) {
		this.login = login;
	}

	public int getRecommend() {
		return recommend;
	}

	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}









	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * next Level set
	 */
//	public void upgradeLevel() {
//		Level nextLevel = this.level.getNext();
//		if(nextLevel == null) {
//			throw new IllegalStateException(this.level+"은 업그레이드 블가능");
//		}else {
//			this.level = nextLevel;
//		}
//	}

}

