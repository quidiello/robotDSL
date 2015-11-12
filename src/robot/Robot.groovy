package robot;

public class Robot {
	
	def move(info, Direction dir) {
		println ""
		print "Moving $dir"
		
		if(info.at != null) {
			this.at(info.at)
		}
		if(info.with != null) {
			this.with(info.with)
		}
		if(info.during != null) {
			this.during(info.during)
		}
		
		this
	}
	
	def at(Speed speed) {
		print " at $speed"
	}
	
	def swim(info, Direction dir) {
		println ""
		print "Swimming $dir"

		if(info.with != null) {
			this.with(info.with)
		}
		if(info.during != null) {
			this.during(info.during)
		}
		
		this
	}
	
	def with(Animals animals) {
		print " with $animals"
	}
	
	def during(Time time) {
		print " for $time"
	}
	
	def jump(Direction dir) {
		println ""
		print "Jump $dir"
		
		this
	}
	
	def multiply(Integer i) {
		print " $i times"
		this
	}
	
	def said(Mode mode, String s) {
		println ""
		switch(mode.toString()) {
			case "whisper":
				s = s.toLowerCase();
				print "Whisper: $s"
				break
			case "normal":
				print "Speak: $s"
				break
			case "shout":
				s = s.toUpperCase();
				print "Shout: $s"
				break
		}
		this
	}
	
	def wink(eye) {
		println ""
		print "Wink $eye eye"
		
		this
	}
	
	def play(info, inst) {
		println ""
		print "Play the $inst"
		
		if(info.tempo != null) {
			this.tempo(info.tempo)
		}
		if(info.with != null) {
			this.with(info.with)
		}
		if(info.during != null) {
			this.during(info.during)
		}
		
		this
	}
	
	def tempo(Tempo tempo) {
		print " $tempo"
	}

}