package com.bugtrack.Practice1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bugtrack.Practice1.dao.IMemberRepository;
import com.bugtrack.Practice1.entities.MemberEntities;

@Controller
@RequestMapping("/members")
public class MemberController {
	
	IMemberRepository memberRepo;
	
	//Create
	@GetMapping("/new")
	public String memberForm(Model model) {
		
		MemberEntities aMember = new MemberEntities();
		
		model.addAttribute("memberHTML", aMember);
		
		return "/member/new-member";
	}
	@PostMapping("/saved")
	public String memberSaved(Model model, MemberEntities aMember) {
		
		memberRepo.save(aMember);
		
		return "redirect:/members/new";
	}
	
}
