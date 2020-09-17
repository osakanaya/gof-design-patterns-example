package uk.me.uohiro.gof.mediator;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {
	private ColleagueCheckbox checkGuest;
	private ColleagueCheckbox checkLogin;
	
	private ColleagueTextField textUser;
	private ColleagueTextField textPass;
	
	private ColleagueButton buttonOk;
	private ColleagueButton buttonCancel;
	
	public LoginFrame(String title) {
		super(title);

		setBackground(Color.lightGray);
		setLayout(new GridLayout(4, 2));

		createColleagures();
		
		add(checkGuest);
		add(checkLogin);
		add(new Label("Username:"));
		add(textUser);
		add(new Label("Password:"));
		add(textPass);
		add(buttonOk);
		add(buttonCancel);
		
		colleagueChanged(checkGuest);
		
		pack();
		show();
	}
	
	@Override
	public void createColleagures() {
		CheckboxGroup group = new CheckboxGroup();
		checkGuest = new ColleagueCheckbox("Guest", group, true);
		checkLogin = new ColleagueCheckbox("Login", group, false);
		
		textUser = new ColleagueTextField("", 10);
		textPass = new ColleagueTextField("", 10);
		textPass.setEchoChar('*');
		
		buttonOk = new ColleagueButton("OK");
		buttonCancel = new ColleagueButton("Cancel");
		
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		
		textUser.setMediator(this);
		textPass.setMediator(this);
		
		buttonOk.setMediator(this);
		buttonCancel.setMediator(this);
		
		checkGuest.addItemListener(checkGuest);
		checkLogin.addItemListener(checkLogin);
		
		textUser.addTextListener(textUser);
		textPass.addTextListener(textPass);
		
		buttonOk.addActionListener(this);
		buttonCancel.addActionListener(this);
	}

	@Override
	public void colleagueChanged(Colleague colleague) {
		if (checkGuest.getState()) {
			textUser.setColleagueEnabled(false);
			textPass.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(true);
		} else {
			textUser.setColleagueEnabled(true);
			userPasswordChanged();
		}
	}

	private void userPasswordChanged() {
			if (textUser.getText().length() > 0) {
				textPass.setColleagueEnabled(true);
				if (textUser.getText().length() >= 4 && 
						textPass.getText().length() >= 4) {
					buttonOk.setColleagueEnabled(true);
				} else {
					buttonOk.setColleagueEnabled(false);
				}
			} else {
				textPass.setColleagueEnabled(false);
				buttonOk.setColleagueEnabled(false);
			}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("" + e);
		System.exit(0);
	}

}
