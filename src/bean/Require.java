/**
 * 老师的要求类，主要支持，周几，上午/下午 最多可上几节课
 */
package bean;

public class Require {

	private int week;//周几
	private int time;//上午/下午
	private int maxCurr;//最多可上几节课
	
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getMaxCurr() {
		return maxCurr;
	}
	public void setMaxCurr(int maxCurr) {
		this.maxCurr = maxCurr;
	}
	
	
}
