package rtb.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rtb.dao.AdsDao;
import rtb.model.Advertiser;

@Service("adsService")
@Transactional
public class AdsService {
	@Autowired
	private AdsDao adsDao;
	
	public void createAds(Advertiser advertiser) {
		adsDao.createAds(advertiser);
	}

	public List<Advertiser> getAds(Long userId) {
		return adsDao.getAds(userId);	
	}
}
