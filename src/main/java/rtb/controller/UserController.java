package rtb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import rtb.model.User;
import rtb.service.UserService;
import rtb.service.transform.CoreResponse;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("bid_request/user/create_user")
	public CoreResponse createUser(@RequestBody User user) {
		System.out.println("--->>>Create user: ");
		userService.createUser(user);
		return new CoreResponse("Create user successful", true);
	}
	
	@GetMapping("bid_request/user/get_users")
	public CoreResponse getUsers() {
		System.out.println("--->>> Get user: ");
		return new CoreResponse(userService.getUsers());
	}
	
}
