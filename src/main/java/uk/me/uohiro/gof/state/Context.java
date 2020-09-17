package uk.me.uohiro.gof.state;

public interface Context {
	public abstract void setClock(int hour);
	public abstract void changeState(State state);
	public abstract void callSecurityCenter(String msg);
	public abstract void recordLog(String msg);
	
	public abstract boolean isDay(int hour);
	public abstract boolean isNight(int hour);
	public abstract boolean isLunchTime(int hour);
}
