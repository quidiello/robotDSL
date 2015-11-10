package robot

enum TimeUnit {
	
	second("s", 1),
	minute("m", 60),
	hour("h", 3600)
	
	String abbreviation
	double multiplier
	
	TimeUnit(String abbr, double mult) {
		this.abbreviation = abbr
		this.multiplier = mult
	}
	
	String toString() {
		abbreviation
	}

}
