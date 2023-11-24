package q2;

import java.util.ArrayList;

public class Tcalculation <T extends Number>{
	
	ArrayList<T> numList = new ArrayList<>();
	
	
	public void append(T num) {
		this.numList.add(num);
	}

	
	public double average() {
		double total = 0;
		
		for (T number : numList) {
			total += number.doubleValue();
		}
		return total/numList.size();
	}

}
