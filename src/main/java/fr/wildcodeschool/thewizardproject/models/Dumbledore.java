package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hp")
public class Dumbledore implements WizardInterface{

	private OutfitInterface Dress;
	@Autowired
	public Dumbledore (@Qualifier("PotterOutfit") OutfitInterface Dress) {
		this.Dress=Dress;
	}
	
	@Override
	public String giveAdvice() {
		return "HP";
	}	
	
	@Override
	public String dress() {
		return this.Dress.changeDress();
	}
}