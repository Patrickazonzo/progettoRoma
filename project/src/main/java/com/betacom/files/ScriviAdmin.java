package com.betacom.files;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.betacom.architecture.dao.DAOException;

public class ScriviAdmin {
	
	private static ScriviAdmin istanza;
	
	private ScriviAdmin() {
		
	}
	
	public static ScriviAdmin getInstance() {
		if (istanza==null){
			istanza= new ScriviAdmin();
		}
		return istanza;
	}
	
	public static void LogIn() {
		Logger logger = Logger.getLogger("log1");
		logger.setLevel(Level.ALL);
		FileHandler fileHandler;
		
		try {
			fileHandler = new FileHandler("//log//admin/.txt", true);
			
			logger.addHandler(fileHandler);
			SimpleFormatter formato = new SimpleFormatter();
			fileHandler.setFormatter(formato);
			
		} catch (SecurityException exc) {
			logger.log(Level.SEVERE, exc.getMessage());
		} catch (IOException exc) {
			logger.log(Level.SEVERE, exc.getMessage());
		} catch (Exception exc) {
			logger.log(Level.SEVERE, exc.getMessage());
		}
	}
	
	public static void LogOut() {
		Logger logger = Logger.getLogger("log1");
		logger.setLevel(Level.ALL);
		FileHandler fileHandler;
		
		try {
			fileHandler = new FileHandler("//log//admin/.txt", true);
			
			logger.addHandler(fileHandler);
			SimpleFormatter formato = new SimpleFormatter();
			fileHandler.setFormatter(formato);
			
		} catch (SecurityException exc) {
			logger.log(Level.SEVERE, exc.getMessage());
		} catch (IOException exc) {
			logger.log(Level.SEVERE, exc.getMessage());
		} catch (Exception exc) {
			logger.log(Level.SEVERE, exc.getMessage());
		}
	}
}
