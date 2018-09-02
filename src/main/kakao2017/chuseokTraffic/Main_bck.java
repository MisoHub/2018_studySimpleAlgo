//package kakao2017.chuseokTraffic;
//
//import java.util.ArrayList;
//import java.util.StringTokenizer;
//import java.util.TreeMap;
//
//public class Main_bck {
//
//	// timestamp 사용.. 
//	public int solution(String[] lines) {
//
//		TreeMap<Integer, Integer> logs = new TreeMap<Integer, Integer>();
//		StringTokenizer token = null;
//
//		// parse inputs
//		for (String s : lines) {
//			String[] tmp = s.split(" ");
//
//			String rep = tmp[1].replaceAll(":", "").replaceAll("\\.", "");
//			int time = Integer.parseInt(rep);
//			int runTime = (int) (Double.parseDouble(tmp[2].replaceAll("s", "")) * 1000);
//
//			// get start time
//			time = time - runTime;
//			logs.put(time, runTime);
//		}
//
//		// get maximum duplicate count
//		int max = 0;
//
//		ArrayList<Integer> timeList = new ArrayList<Integer>();
//		timeList.addAll(logs.keySet());
//
//		for (int i = 0; i < timeList.size(); i++) {
//			// compare other logs
//			int dupCnt = 1;
//
//			for (int j = i + 1; j < timeList.size(); j++) {
//				// time + runtime + 1 < other log start time
//				int cmpTime = timeList.get(i) + logs.get(timeList.get(i)) + 1000 ;
//				// check-up round 
//				//check sec "20 59 57 421"
//				char[] tmpTime = String.valueOf(cmpTime).toCharArray();
//				if( tmpTime[4] >= '6' ) {
//					//check min  
//					tmpTime[4] = '0';
//					tmpTime[3] = (char)((int)tmpTime[3]+1);
//					if (cmpTime %10000000)
//						// check hour 
//						
//				}
//				
//				if (timeList.get(i) + logs.get(timeList.get(i)) + 1000 >= timeList.get(j)) {
//					dupCnt = dupCnt + 1;
//				} else {
//					break;
//				}
//			}
//
//			if (max < dupCnt)
//				max = dupCnt;
//		}
//
//		return max;
//
//	}
//
//	static public void main(String[] args) {
//
//		String[] input1 = { "2016-09-15 20:59:57.421 0.351s", "2016-09-15 20:59:58.233 1.181s",
//				"2016-09-15 20:59:58.299 0.8s", "2016-09-15 20:59:58.688 1.041s", "2016-09-15 20:59:59.591 1.412s",
//				"2016-09-15 21:00:00.464 1.466s", "2016-09-15 21:00:00.741 1.581s", "2016-09-15 21:00:00.748 2.31s",
//				"2016-09-15 21:00:00.966 0.381s", "2016-09-15 21:00:02.066 2.62s" };
//		
//		Main_ㅜㄷㅈ main = new Main_ㅜㄷㅈ();
//		System.out.println(main.solution(input1));
//
//	}
//}
