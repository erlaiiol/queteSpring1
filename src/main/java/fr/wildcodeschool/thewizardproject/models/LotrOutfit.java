package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("LotrOutfit")
public class LotrOutfit implements OutfitInterface{
	
	@Override
	public String changeDress(){
		return "This wizard's dress is grey... or White depends on the moment";
	}
}
