package robot

import groovy.transform.TupleConstructor


class Tempo {
	String tempo1
	String tempo2
	
	Tempo(String tempo1) {
		this.tempo1 = tempo1;
	}
	
	String toString() {
		String s = "$tempo1"
		if (tempo2 != null) {
			s += " to $tempo2"
		}
		s
	}
	
	Tempo rightShift(Tempo tempo) {
		this.tempo2 = tempo.tempo1
		this
	}
	
}
