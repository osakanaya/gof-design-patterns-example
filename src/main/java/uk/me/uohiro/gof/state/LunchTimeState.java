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
		context.callSecurityCenter("非常：昼食時の金庫使用！");
	}
	
	@Override
	public void doAlarm(Context context) {
		context.callSecurityCenter("非常ベル（昼食時）");
		
		context.changeState(UrgentState.getInstance());
	}

	@Override
	public void doPhone(Context context) {
		context.recordLog("昼食時の通話録音");
	}

	public String toString() {
		return "[昼食時]";
	}
}
