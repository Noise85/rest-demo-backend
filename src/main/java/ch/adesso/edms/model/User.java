package ch.adesso.edms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="APP_USER")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_APP_USER")
	@SequenceGenerator(name="SEQ_APP_USER", sequenceName="SEQ_APP_USER")
	private Integer id;
	private String nickname;
	private String password;
	private String firstname;
	private String lastname;
	private String address;
	private String place;
	
	public User() {
		this(null,null,null,null,null,null);
	}

	public User(String nickname, String password) {
		this(nickname,password,null,null,null,null);
	}

	public User(String nickname, String password, String firstname, String lastname) {
		this(nickname, password, firstname, lastname, null ,null );
	}

	public User(String nickname, String password, String firstname, String lastname, String address, String place) {
		this.id=null;
		this.nickname = nickname;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.place = place;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
}
