public class DisplayCurrentTime {
	public static void main(String[] args) {
		
		//Time in ms since midnight , Jan 1 , 1970
		long totaltime = System.currentTimeMillis();
		
		//Time in sec. since midnight , Jan 1 , 1970
		long totalsec = totaltime / 1000;
		
		//current second in time
		int second = (int)(totalsec % 60);
		
		//Time in min. since midnight , Jan 1 , 1970
		long totalmin = totalsec / 60;
		
		//current minutes in time
		int minutes = (int)(totalmin % 60);
		
		//Time in hours since midnight , Jan 1 , 1970
		long totalhours = totalmin / 60;
		
		//current hour in time
		int hour = (int)(totalhours % 60);
		
		System.out.println("Current time is: " + hour + ":" + minutes + ":" + second + " GMT");
		
		
	}
}
