package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	//@RequestMapping(value = "/index", method = RequestMethod.GET)
	@GetMapping({"/index","/","/home"} )
	public String index(Map<String,Object>map) {
		//model.addAttribute("titulo", "Hola spring Framework!");
		map.put("titulo","holaaaaaa Model");
		return "index"; 
	}
	@RequestMapping("/perfil")
	public String perfil (Model model) {
		Usuario usuario=new Usuario();
		usuario.setNombre("Andrea");
		usuario.setApellido("peliido");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil usuario:".concat(usuario.getNombre()));
		return "perfil";
	}

}
