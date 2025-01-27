package in.myorg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.myorg.entity.UserEntity;
import in.myorg.repository.UserRepository;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository repo;
	@GetMapping("/")
	public String name() {
		return "index";
	}
	@PostMapping("/register")
	@ResponseBody
	public String register(@ModelAttribute UserEntity ue) {
		System.out.println(ue);
		repo.save(ue);
//		System.out.println("Next learn how to add security");
		return "DATA REGISTERED SUCCESSFULLY  ";
	}
}
