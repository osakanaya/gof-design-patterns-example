package uk.me.uohiro.gof.mediator;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {

	private static final long serialVersionUID = -1158021428046599383L;

	private Mediator mediator;
	
	public ColleagueButton(String caption) {
		super(caption);
	}
	
	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		setEnabled(enabled);
	}

}
