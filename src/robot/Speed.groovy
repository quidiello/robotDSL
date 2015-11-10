package robot

import groovy.transform.TupleConstructor;

@TupleConstructor
class Speed {

	Distance distance
	Time time
	
	String toString() {
		"$distance/$time"
	}
	
}
