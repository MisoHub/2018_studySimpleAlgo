/* https://programmers.co.kr/learn/courses/30/lessons/42583?language=java
 * 
 */
package q42583.TruckPassingBridge;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		System.out.println(m.solution(2, 10, new int[] { 7, 4, 5, 6 }));
		System.out.println(m.solution(100, 100, new int[] { 10 }));
		System.out.println(m.solution(100, 100, new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }));

	}

	private class Truck {
		int weigth;
		int pos;

		public Truck(int w, int p) {
			this.weigth = w;
			this.pos = p;
		}

		int getWeight() {
			return this.weigth;
		}

		int getPos() {
			return this.pos;
		}

		void incPos() {
			this.pos++;
		}
	}

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int time = 0;
		int onWeight = 0;
		ArrayList<Truck> onTruck = new ArrayList<Truck>();

		for (int j = 0; j < truck_weights.length || onTruck.size() > 0;) {

			// 기존에 있는 트럭들 이동 ..
			// 트럭이동 > 지난 트럭 제거 > 무게 제거

			for (int i = 0; i < onTruck.size(); i++) {
				onTruck.get(i).incPos();
				if (onTruck.get(i).getPos() > bridge_length) {
					onWeight -= onTruck.get(i).getWeight();
					onTruck.remove(i);
					i--;
				}
			}

			// 새로운 트럭이 올라 올 수 있는지 확인
			if (j < truck_weights.length && weight >= onWeight + truck_weights[j]) {
				onTruck.add(new Truck(truck_weights[j], 1));
				onWeight += truck_weights[j];
				j++;
			}

			time++;
		}

		return time;
	}
}
