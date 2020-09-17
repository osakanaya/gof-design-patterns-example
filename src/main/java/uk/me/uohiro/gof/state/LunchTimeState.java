package uk.me.uohiro.gof.state;

public class LunchTimeState implements State {

	private static LunchTimeState singleton = new LunchTimeState();
	
	private LunchTimeState() {}
	
	public static State getInstance() {
		return singleton;
	}
	
	@Override
	public void doClock(Context context, int hour) {
		if (context.isDay(hour)) {
			context.changeState(DayState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {
		context.callSecurityCenter("���F���H���̋��Ɏg�p�I");
	}
	
	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("���x���i���H���j");
		
		context.changeState(UrgentState.getInstance());
	}

	@Override
	public void doPhone(Context context) {
		context.recordLog("���H���̒ʘb�^��");
	}

	public String toString() {
		return "[���H��]";
	}
}
