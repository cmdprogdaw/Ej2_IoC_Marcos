package com.marcos.IoC.iva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marcos.IoC.iva.servicios.ServicioIva;

@Controller
public class RutasIva {

	@Autowired
	@Qualifier("iva")
	ServicioIva servicioIva;
	
	
	@GetMapping("/ivaf/{cantidad}")
	@ResponseBody
	public String francia(@PathVariable Integer cantidad){
	
		return ""+servicioIva.generarIvaFrancia(cantidad);
	}
	
	
	@GetMapping("/ivae/{cantidad}")
	@ResponseBody
	public String españa(@PathVariable Integer cantidad){	
		
		return ""+servicioIva.generarIvaEspana(cantidad);
	}
}
