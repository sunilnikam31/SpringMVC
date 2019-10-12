package com.sunil.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunil.model.Admin;
import com.sunil.model.Registration;
import com.sunil.serviceImpl.ServiceImpl;

@Controller
public class AllController {

	@Autowired
	ServiceImpl si;
	
	@RequestMapping(value="/reg")
	public String insertRegister(@ModelAttribute Registration r,ModelMap map)
	{
		List<Registration> list=si.insertRegister(r);
		map.addAttribute("data",list);
		return "alldata";
	}
	@RequestMapping(value="/log")
	public String afterLogin(@RequestParam String email,@RequestParam String password,Registration r,ModelMap map)
	{
		Admin ad=new Admin();
		ad.setEmail(email);
		ad.setPassword(password);
		List<Registration> list=si.getData(ad);
		map.addAttribute("data",list);
		return "alldata";
	}
	@RequestMapping(value="/edit")
	public String editRegister(@ModelAttribute Registration r,ModelMap map)
	{
		Registration r1=si.editRegister(r.getRollno());
		map.addAttribute("data", r1);
		return "edit";
	}
	@RequestMapping(value="/update")
	public String updateRegister(@ModelAttribute Registration r,ModelMap map)
	{
		List<Registration> list=si.updateRegister(r);
		map.addAttribute("data",list);
		return "alldata";
	}
	@RequestMapping(value="/delete")
	public String deleteRegister(@ModelAttribute Registration r,ModelMap map)
	{
		List<Registration> list=si.deleteRegister(r.getRollno());
		map.addAttribute("data",list);
		return "alldata";
	}
	@RequestMapping(value="/deletesunil")
	public String deleteRegistersunil(@ModelAttribute Registration r,ModelMap map)
	{
		List<Registration> list=si.deleteRegister(r.getRollno());
		map.addAttribute("data",list);
		return "alldata";
	}
}
