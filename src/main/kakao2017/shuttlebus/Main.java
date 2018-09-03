package kakao2017.shuttlebus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class Main {

	public String solution(int n, int t, int m, String[] timetable) {
		String answer = "";
		final int START_TIME = 900;
		final int LAST_TIME = 2359;

		// arrive time ,crew number
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

		// parse timetable
		for (String str : timetable) {
			int key = Integer.parseInt(str.replaceAll(":", ""));
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		// get arrive time list
		ArrayList<Integer> clist = new ArrayList<Integer>();
		clist.addAll(map.keySet());

		// set start_time - find last shuttle time
		int dtime = START_TIME;
		
		// set shuttle lists 
		boolean[] isRemainSuttle = new boolean[n];
		for(boolean b : isRemainSuttle) {
			b = true;
		}

		int deadline = 0;
		// for with n , t, m
		for (int i = 0; i < n; i++) {
			// set cnt of member
			int cnt = m;

			// check crew members... 
			while(clist.size()>0){
				int keytime = clist.get(0);
				deadline = dtime;
				// if fastest crew arrival time is greater than shuttle time
				if (keytime > dtime) {
					break;
				}
				
				else {
					// decrease wait crew num
					if (map.get(keytime) > cnt) {
						map.put(keytime, map.get(keytime) - cnt);
						
						break;
					} else {
						cnt = cnt - map.get(keytime);
						map.remove(keytime);
						clist.remove(0);
						
						if (cnt == 0) {
							deadline = keytime-1;
							// set next shuttle time
							if (deadline % 100 >= 60) {
								// increase time (+1h -60m)
								deadline -= 40;
							}
							isRemainSuttle[i] = false;
							break;
						}
					}
				}
			}

			
			dtime += t;
			if (dtime % 100 >= 60) {
				// increase time (+1h -60m)
				dtime += 40;
			}
		}

		int nSuttle=-1;
		// find remain seat shuttle
		for( int i = isRemainSuttle.length-1; i>=0;i--) {
			if(isRemainSuttle[i]) {
				nSuttle = i;
			}
		}
		dtime = START_TIME;
		for(int i=0; i<nSuttle;i++) {
			dtime += t;
			if (dtime % 100 >= 60) {
				// increase time (+1h -60m)
				dtime += 40;
			}
		}
		//
		answer =String.valueOf(deadline);
		for(int i=answer.length()-4; i <0;i++)
			answer = "0"+answer;
		answer = answer.substring(0, 2)+":"+answer.substring(2,4);
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		String[] time1 = {"08:00", "08:01", "08:02", "08:03"};
		String[] time2 = {"09:10", "09:09", "08:00"};
		String[] time3 = {"09:00", "09:00", "09:00", "09:00"};
		String[] time4 = {"00:01", "00:01", "00:01", "00:01", "00:01"};
		System.out.println(main.solution(1,	1,	5, time1));
		System.out.println(main.solution(2,	10,	2, time2));
		System.out.println(main.solution(2, 1, 2, time3));
		System.out.println(main.solution(1,	1,	5, time4));
		
	}

}
