package test;

public class Exit {
	public void exit() {
		{
			System.out.println(
					"\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950");
			System.out.println(
					"                \u263A\u263ATHANK YOU\n" + "                        VISIT AGAIN \u263A\u263A");
			System.out.println(
					"\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950\u0950");
			if (FruitsStore.ima > 0 || FruitsStore.iap > 0 || FruitsStore.igr > 0 || FruitsStore.igu > 0
					|| VegitableStore.ipo > 0 || VegitableStore.ito > 0 || VegitableStore.ibr > 0
					|| VegitableStore.ion > 0 || CosmaticStore.ika > 0 || CosmaticStore.ili > 0 || CosmaticStore.ina > 0
					|| CosmaticStore.ifa > 0 || MasalaStore.iga > 0 || MasalaStore.ichi > 0 || MasalaStore.itu > 0
					|| MasalaStore.igi > 0) {
				new Cart().bill();
			}
		}
	}
}
