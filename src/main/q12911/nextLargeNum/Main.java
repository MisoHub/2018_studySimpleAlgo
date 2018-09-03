package q12911.nextLargeNum;

public class Main {

	public int solution(int n) {

		int answer = 0;
		char[] bArr = Integer.toBinaryString(n).toCharArray();
		int cnt0 = 0, cnt1 = 0;
		System.out.println(bArr);
		// find '01' from backward
		for (int i = bArr.length - 1; i >= 0; i--) {
			if (i == 0) {
				if (cnt0 == 0) {
					bArr[0] = '0';
					return Integer.parseInt("1" + new String(bArr), 2);
				} else {
					cnt0++;
					char[] tmp = new String(new String(bArr)+"0").toCharArray();
					bArr = tmp;
					break;
				}
			}

			if (bArr[i] == '1' && bArr[i - 1] == '0') {
				bArr[i] = '0';
				bArr[i - 1] = '1';
				break;
			}
			if (bArr[i] == '1')
				cnt1++;
			else
				cnt0++;
		}

		// build number
		for (int i = bArr.length - cnt0 - cnt1; i < bArr.length - cnt1; i++) {
			bArr[i] = '0';
		}

		for (int i = bArr.length - cnt1; i < bArr.length; i++) {
			bArr[i] = '1';
		}
		System.out.println(bArr);
		return Integer.parseInt(new String(bArr), 2);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();

		System.out.println(main.solution(78));
		System.out.println(main.solution(15));
		System.out.println(main.solution(30));

	}

}
