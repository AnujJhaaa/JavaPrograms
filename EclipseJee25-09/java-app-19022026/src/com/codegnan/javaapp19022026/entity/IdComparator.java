package com.codegnan.javaapp19022026.entity;

import java.util.Comparator;

public class IdComparator implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		int currentId = 0, otherId = 0;
		
		if(o1 instanceof Product) {
			currentId = ((Product) o1).getId();
			otherId = ((Product) o2).getId();
			
		}	else if(o1 instanceof Customer) {
			currentId = ((Customer) o1).getId();
			otherId = ((Customer) o2).getId();
			
		} else if(o1 instanceof Order) {
			currentId = ((Order) o1).getId();
			otherId = ((Order) o2).getId();
		}
		
		if(currentId > otherId) return 1;
		else if(currentId < otherId) return -1;
		return 0;
	}

}
