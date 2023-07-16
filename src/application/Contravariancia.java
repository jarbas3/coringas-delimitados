package application;

import java.util.ArrayList;
import java.util.List;

public class Contravariancia {

	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		myNums.add(10);
		myNums.add(3.14);
		
		// Number x = myNums.get(0); Contravariância. Put = Ok, get = Error.
	}
}
