package uk.me.uohiro.gof.state;

public class DayState implements State {

	private static DayState singleton = new DayState();
	
	private DayState() {}
	
	public static State getInstance() {
		return singleton;
	}
	
	@Override
	public void doClock(Context context, int hour) {
		if (context.isNight(hour)) {
			context.changeState(NightState.getInstance());
		} else if (context.isLunchTime(hour)) {
			context.changeState(LunchTimeState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {
		context.recordLog("���Ɏg�p�i���ԁj");
	}
	
	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("���x���i���ԁj");
		
		context.changeState(UrgentState.getInstance());
	}

	@Override
	public void doPhone(Context context) {
		context.callSecurityCenter("�ʏ�̒ʘb�i���ԁj");
	}

	public String toString() {
		return "[����]";
	}
}
