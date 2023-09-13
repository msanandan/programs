package collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;

		if (I1 < I2) {

			return 100;  //reverse = I2,I1=Larger,smaller
		} else if (I1 > I2) {
			return -100;//yes it is=I1,i2=larger,smaller
		} else

			return 0;
	}

}
