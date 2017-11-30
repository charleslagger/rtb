package rtb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ADVERTISER")
public class Advertiser implements Serializable{
	private Long id;
	private String adsName;
	private Short status;
//	private User user;
	private Long userId;

	@Id
	@Column(name = "ID", precision = 10, scale = 0, nullable = false )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@SequenceGenerator(name="seq", sequenceName="ads_seq")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "ADS_NAME", nullable = false)
	public String getAdsName() {
		return adsName;
	}

	public void setAdsName(String adsName) {
		this.adsName = adsName;
	}

	@Column(name = "STATUS", nullable = false, precision = 3, scale = 0)
	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

//	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = User.class)
//	@JoinColumn(name = "USER_ID")
//	public User getUser() {
//		return user;
//	}

//	public void setUser(User user) {
//		this.user = user;
//	}

//	@Transient
	@Column(name = "USER_ID")
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
