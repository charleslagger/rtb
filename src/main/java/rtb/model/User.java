package rtb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

@SuppressWarnings("serial")
@Entity
@Table(name = "USER_")
public class User implements Serializable {
	private Long id;
	private String userName;
	private Long age;
	private String gender;
	private Date day;
	private String occupation;
	private String interest;
//	List<Advertiser> advertisers = new ArrayList<Advertiser>();

	@Id
	@Column(name = "ID", precision = 10, scale = 0, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(name = "seq", sequenceName = "user_seq")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "USER_NAME", nullable = false)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "AGE", nullable = false, precision = 10, scale = 0)
	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	@Column(name = "GENDER", nullable = false)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "DAY_")
	@UpdateTimestamp
	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	@Column(name = "OCCUPATION", nullable = false)
	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@Column(name = "INTEREST", nullable = false)
	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

//	@JsonIgnore
//	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user", targetEntity = Advertiser.class)
//	@JsonManagedReference
//	public List<Advertiser> getAdvertisers() {
//		return advertisers;
//	}
//
//	public void setAdvertisers(List<Advertiser> advertisers) {
//		this.advertisers = advertisers;
//	}
}
