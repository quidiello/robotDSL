package robot;

public class Robot {
	
	String status
	
	Robot(String status) {
		this.status = status
	}
	
	def move(info, Direction dir) {
		if(this.status == Status.sleep.toString()) {
			this.sleeping("move")
			return this
		}
		
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
		if(this.status == Status.sleep.toString()) {
			this.sleeping("swim")
			return this
		}
		
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
		if(this.status == Status.sleep.toString()) {
			this.sleeping("jump")
			return this
		}
		println ""
		print "Jump $dir"
		
		this
	}
	
	def multiply(Integer i) {
		print " $i times"
		this
	}
	
	def said(Mode mode, String s) {
		if(this.status == Status.sleep.toString()) {
			this.sleeping("speak")
			return this
		}
		
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
		if(this.status == Status.sleep.toString()) {
			this.sleeping("wink")
			return this
		}
		
		println ""
		print "Wink $eye eye"
		
		this
	}
	
	def play(info, inst) {
		if(this.status == Status.sleep.toString()) {
			this.sleeping("play")
			return this
		}
		
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
	
	def status(Status status) {
		switch(status) {
			case Status.sleep:
				this.sleep()
				break
			case Status.active:
				this.wake()
				break
		}
		
		this
	}
	
	def sleep() {
		if(this.status == Status.sleep.toString()) {
			println ""
			print "Robot is already sleeping"
		}
		else {
			this.status = Status.sleep.toString()
			println ""
			print "Robot go to sleep"
		}
	}
	
	def wake() {
		if (this.status == Status.active.toString()) {
			println ""
			print "Robot is already awakening"
		}
		else {
			this.status = Status.active.toString()
			println ""
			print "Robot is awakening"
		}
	}
	
	def sleeping(String s) {
		println ""
		print "Robot can't $s: it's sleeping"
	}

}