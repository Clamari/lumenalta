package cl.clamari.rest.impl;

import org.springframework.stereotype.Service;

import cl.clamari.rest.Hola;

@Service
public class HolaImpl implements Hola {

	public String get() {
		return "hola";
	}
}
