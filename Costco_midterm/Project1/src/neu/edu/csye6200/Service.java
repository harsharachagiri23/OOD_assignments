package neu.edu.csye6200;

public class Service extends ItemAPI{
	
	private String startTime;
	private String endTime;
	private String timeUnits;

	public Service() {
		super();
	}

	public Service(String startTime, String endTime, String timeUnits) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.timeUnits = timeUnits;
	}

	public Service(int serialNumber, double price, String name, String description, String startTime, String endTime,
			String timeUnits) {
		super(serialNumber, price, name, description);
		this.startTime = startTime;
		this.endTime = endTime;
		this.timeUnits = timeUnits;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getTimeUnits() {
		return timeUnits;
	}

	public void setTimeUnits(String timeUnits) {
		this.timeUnits = timeUnits;
	}

	@Override
	public String toString() {
		return "startTime=" + startTime + ", endTime=" + endTime + ", timeUnits=" + timeUnits
				+ ", Id" + getId() + ", ItemPrice=" + getItemPrice() + ", ItemName=" + getItemName()
				+ ", ItemDescription=" + getItemDescription();
	}
	
}
