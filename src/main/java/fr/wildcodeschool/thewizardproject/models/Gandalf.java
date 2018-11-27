package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lotr")
public class Gandalf implements WizardInterface {
	

	private OutfitInterface Dress;
	@Autowired
	public Gandalf (@Qualifier("LotrOutfit") OutfitInterface Dress) {
		this.Dress=Dress;
	}
	
	@Override
	public String giveAdvice() {
		return "LOTR";
	}
	
	@Override
	public String dress() {
		return this.Dress.changeDress();
	}
}
