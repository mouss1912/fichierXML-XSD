package fr.diginamic.json;

import java.util.List;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

public class ParseJson {
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		CollectionType collType = mapper.getTypeFactory().constructCollectionType(List.class, Societe.class);
		List<Societe> listeSociete = mapper.readValue(
				new File("/Users/moussa/Desktop/societe.json"), collType);

		
		
		for (Societe societe : listeSociete) {
			System.out.println(societe.getNom());
			for (Fondateurs maSociete : societe.getFondateurs()) {
				System.out.println(maSociete.getNom());
				System.out.println(maSociete.getPrenom());
				System.out.println(maSociete.getDateDeNaissance());
				System.out.println(maSociete.getLieux());
				
			}
			
			System.out.println(societe.getSiegeSocial());
			System.out.println(societe.getChiffreAffaire());	
			}
		for (ChiffreAffaire chiffre : societe) {
			System.out.println(chiffre.getAnnee() + " : " + chiffre.montant);
		}

	}

}
