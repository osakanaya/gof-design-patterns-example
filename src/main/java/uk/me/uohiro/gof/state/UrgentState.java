package uk.me.uohiro.gof.state;

public class UrgentState implements State {
	private static UrgentState singleton = new UrgentState();
	
	private UrgentState() {}

	public static State getInstance() {
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {
		// Do nothing
	}

	@Override
	public void doUse(Context context) {
		context.callSecurityCenter("���F��펞�̋��Ɏg�p�I");
	}

	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("���x���i��펞�j");
	}

	@Override
	public void doPhone(Context context) {
		context.callSecurityCenter("�ʏ�̒ʘb�i��펞�j");
	}
	
	public String toString() {
		return "[��펞]";
	}

}
