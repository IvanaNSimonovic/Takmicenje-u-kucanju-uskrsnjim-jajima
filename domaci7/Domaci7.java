package domaci7;

import java.util.Scanner;

public class Domaci7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int broj = s.nextInt();
		int[] tNiz = new int[broj];
		double[] jacina = new double[broj];
		for (int i = 0; i < broj; i++) {
			int tRbr = s.nextInt();
			tNiz[i] = tRbr;
			double jj = s.nextDouble();
			jacina[i] = jj;
		}
		int maxx = tNiz[0], maxx2 = tNiz[1], maxx3 = tNiz[2];
		double max = jacina[0];
		double max2 = jacina[1];
		double max3 = jacina[2];
		for (int i = 4; i < broj; i++) {
			if (jacina[i] > max || jacina[i] > max2 || jacina[i] > max3) {
				if (max > max2) {
					if (max > max3) {
						if (max2 > max3) {
							max3 = jacina[i];
							maxx3 = tNiz[i];
						} else {
							max2 = jacina[i];
							maxx2 = tNiz[i];
						}
					} else if (max3 > max2) {
						max3 = jacina[i];
						maxx3 = tNiz[i];
					} else {
						max2 = jacina[i];
						maxx2 = tNiz[i];
					}
				} else if (max2 > max3) {
					max2 = jacina[i];
					maxx2 = tNiz[i];
				} else {
					max3 = jacina[i];
					maxx3 = tNiz[i];

				}

			}

		}
		String m = (" mesto osvojio je takmicar #");
		String j = (" sa jacinom jajeta ");
		if (max > max2 && max > max3) {
			if (max2 > max3)
				System.out.println("Prvo" + m + maxx + j + max + "!" + "\nDrugo" + m + maxx2 + j + max2 + "!"
						+ "\nTrece" + m + maxx3 + j + max3);
			else
				System.out.println("Prvo" + m + maxx + j + max + "!" + "\nDrugo" + m + maxx3 + j + max3 + "!"
						+ "\nTrece" + m + maxx2 + j + max2);
		} else if (max2 > max3) {
			if (max > max3)
				System.out.println("Prvo" + m + maxx2 + j + max2 + "!" + "\nDrugo" + m + maxx + j + max + "!"
						+ "\nTrece" + m + maxx3 + j + max3);
			else
				System.out.println("Prvo" + m + maxx2 + j + max2 + "!" + "\nDrugo" + m + maxx3 + j + max3 + "!"
						+ "\nTrece" + m + maxx + j + max);
		}
	}

}
