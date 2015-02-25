package br.com.geradorrest.service;

import java.io.Serializable;
import java.util.HashMap;

public abstract class Consumir implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	protected HashMap<String,String> URIs = new HashMap<String,String>();

}
