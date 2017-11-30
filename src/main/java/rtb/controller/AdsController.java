package rtb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rtb.model.Advertiser;
import rtb.service.AdsService;
import rtb.service.transform.CoreResponse;

@RestController
public class AdsController {
	@Autowired
	private AdsService adsService;
	
	@PostMapping("/bid_response/ads/create_ads")
	public CoreResponse createAds(@RequestBody Advertiser advertiser) {
		System.out.println("--->>> Create advertiser: ");
		adsService.createAds(advertiser);
		return new CoreResponse(true, "Create advertiser successful");
	}
	
	@GetMapping("/bid_response/ads/get_ads")
	public CoreResponse getAds(@RequestParam(name = "user_id") Long userId) {
		System.out.println("--->>> Get advertiser to publisher: ");
		return new CoreResponse(adsService.getAds(userId));
	}
}
