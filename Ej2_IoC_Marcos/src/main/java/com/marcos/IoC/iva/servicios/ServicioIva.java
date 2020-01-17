package com.marcos.IoC.iva.servicios;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("iva")
public class ServicioIva implements IvaFrancia, IvaEspana{

	private final float ivaFrancia = 0.25f;
	private final float ivaEspana = 0.21f;
	
	
	@Override
	public float generarIvaEspana(float precio) {
		
		return precio+(precio*ivaEspana);
	}

	@Override
	public float generarIvaFrancia(float precio) {
		
		return precio+(precio*ivaFrancia);
	}

	
}
