package rtb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ADS")
public class UserAds {
	private Long id;
	private Long userId;
	private Long adsId;

	@Id
	@Column(name = "ID", precision = 10, scale = 0, nullable = false )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@SequenceGenerator(name="seq", sequenceName="user_ads_seq")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "USER_ID", nullable = false, precision = 10, scale = 0)
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Column(name = "ADS_ID", nullable = false, precision = 10, scale = 0)
	public Long getAdsId() {
		return adsId;
	}

	public void setAdsId(Long adsId) {
		this.adsId = adsId;
	}

}
