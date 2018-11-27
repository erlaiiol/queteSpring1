package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("PotterOutfit")
public class PotterOutfit implements OutfitInterface{
	
	@Override
	public String changeDress(){
		return "This wizard's dress is blue";
	}
}
