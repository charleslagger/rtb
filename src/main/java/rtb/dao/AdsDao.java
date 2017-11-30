package rtb.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import rtb.model.Advertiser;

@Repository("adsDao")
public class AdsDao extends AbstractDao<Long, Advertiser>{

	public void createAds(Advertiser advertiser) {
		persist(advertiser);
	}

	public List<Advertiser> getAds(Long userId) {
		String hql = "select ad from Advertiser ad where ad.userId =:userId";
		return getSession().createQuery(hql, Advertiser.class).setParameter("userId", userId).getResultList();
	}

}