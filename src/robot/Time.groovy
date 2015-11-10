package robot

import groovy.transform.TupleConstructor;

@TupleConstructor
class Time {
	
	double amount
	TimeUnit unit
	
	String toString() {
		"$amount $unit"
	}

}
