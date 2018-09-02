package kakao2017.chuseokTraffic;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	// timestamp 사용.. 
	public int solution(String[] lines) {
		
		final int ORI_START = 0;
		final int START =1;
		final int ORI_END = 2;
		final int END =3;
		
		ArrayList<Timestamp[]> logs = new ArrayList<Timestamp[]>();
		Calendar cal = Calendar.getInstance();
		
		// parse inputs
		for (String s : lines) {
			String[] tmp = s.split(" ");

			int runTime = (int) (Double.parseDouble(tmp[2].replaceAll("s", "")) * 1000);
			
            // original end time 
			Timestamp oEndTime = Timestamp.valueOf(tmp[0]+" "+ tmp[1]);
			cal.setTimeInMillis(oEndTime.getTime());
			
			// end cover time = original end time + 1 sec
			cal.add(cal.MILLISECOND, +1000);
			Timestamp endTime = new Timestamp(cal.getTime().getTime());
												
			// start time = original end time  - runtime + 1 milsec 
			cal.add(cal.MILLISECOND, -1*runTime -1000 +1);
			Timestamp oStartTime = new Timestamp(cal.getTime().getTime());
			
			// get start time = original start time + 1 sec 
			cal.add(cal.MILLISECOND, 1000);
						
			Timestamp startTime = new Timestamp(cal.getTime().getTime());
			Timestamp[] tmpTS = {oStartTime, startTime, oEndTime, endTime};

			// add logs to lists
			logs.add(tmpTS);

		}

		// get maximum duplicate count
		int max = 0;

		for (int i = 0; i < logs.size(); i++) {
			// compare other logs
			int dupCnt = 1;

			// check midTime
			// ORI_START 시간 보다 ORI_END시간이  더 크고, startTime 보다 oStartTime이 작은 것 
			for (int j = i + 1; j < logs.size(); j++) {
				// compare base endTime & compare startTime 
				
				if (logs.get(i)[ORI_START].getTime() <= logs.get(j)[ORI_END].getTime()
						&& logs.get(i)[START].getTime() > logs.get(j)[ORI_START].getTime()) {
					dupCnt = dupCnt + 1;
				} 
			}
			// SET MAX DUPLICATE 
			if (max < dupCnt)
				max = dupCnt;
			
			dupCnt = 1;
			
			// check endTime
			// END 시간보다 ORI_START가 작고, ORI_END가 ORI_END 보다 더 큰경우  
			for (int j = i + 1; j < logs.size(); j++) {
				// compare base endTime & compare startTime 
				
				if (logs.get(i)[END].getTime() > logs.get(j)[ORI_START].getTime()
						&& logs.get(i)[ORI_END].getTime() <= logs.get(j)[ORI_END].getTime()) {
					dupCnt = dupCnt + 1;
				} 
			}

			if (max < dupCnt)
				max = dupCnt;
		}

		return max;

	}

	static public void main(String[] args) {

		String[] input1 = { "2016-09-15 20:59:57.421 0.351s", "2016-09-15 20:59:58.233 1.181s",
				"2016-09-15 20:59:58.299 0.8s", "2016-09-15 20:59:58.688 1.041s", "2016-09-15 20:59:59.591 1.412s",
				"2016-09-15 21:00:00.464 1.466s", "2016-09-15 21:00:00.741 1.581s", "2016-09-15 21:00:00.748 2.31s",
				"2016-09-15 21:00:00.966 0.381s", "2016-09-15 21:00:02.066 2.62s" };
		
		String[] input2 = {	"2016-09-15 01:00:04.001 2.0s", "2016-09-15 01:00:07.000 2s"};
		
		Main main = new Main();
		System.out.println(main.solution(input2));

	}
}
