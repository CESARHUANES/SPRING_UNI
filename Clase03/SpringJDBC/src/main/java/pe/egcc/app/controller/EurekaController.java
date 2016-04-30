package pe.egcc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import pe.egcc.app.service.EurekaService;

@Controller
public class EurekaController {
private EurekaService eurekaService;	
public String verSaldoCuenta(@RequestParam("cuenta")  String cuenta,Model model){
	model.addAttribute("cuenta", cuenta);
	model.addAttribute("saldo", eurekaService.getSaldoCuenta(cuenta));
	return "saldoCuenta";
}
}
