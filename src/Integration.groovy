
import robot.Robot
import robot.Stroke
import robot.Direction
import robot.Distance
import robot.DistanceUnit
import robot.Time
import robot.TimeUnit
import robot.Animals
import robot.Eye
import robot.Mode
import robot.Instrument
import robot.Tempos
import robot.Tempo

my_robot = new Robot()

def binding = new Binding([
	robot: my_robot,
	move: my_robot.&move,
	left: Direction.left,
	right: Direction.right,
	forward: Direction.forward,
	backward: Direction.backward,
	h: new Time(1, TimeUnit.hour),
	m: new Time(1, TimeUnit.minute),
	s: new Time(1, TimeUnit.second),
	swim: my_robot.&swim,
	dolphins: Animals.dolphins,
	sharks: Animals.sharks,
	fishes: Animals.fishes,
	jellyfishes: Animals.fishes,
	monkeys: Animals.monkeys,
	dogs: Animals.dogs,
	jump: my_robot.&jump,
	said: my_robot.&said,
	whisper: Mode.whisper,
	normal: Mode.normal,
	shout: Mode.shout,
	butterfly: Stroke.butterfly,
	crawl: Stroke.crawl,
	sidestroke: Stroke.sidestroke,
	breaststroke: Stroke.breaststroke,
	wink: my_robot.&wink,
	eye: Eye,
	piano: Instrument.piano,
	fiddle: Instrument.fiddle,
	flute: Instrument.flute,
	drum: Instrument.drum,
	bagpipes: Instrument.bagpipes,
	play: my_robot.&play,
	adagio: Tempos.adagio,
	allegro: new Tempo(Tempos.allegro.toString()),
	allegrissimo: new Tempo(Tempos.allegrissimo.toString()),
	moderato: new Tempo(Tempos.moderato.toString()),
	andante: new Tempo(Tempos.andante.toString()),
	vivace: new Tempo(Tempos.vivace.toString()),
	presto: new Tempo(Tempos.presto.toString()),
	prestissimo: new Tempo(Tempos.prestissimo.toString()),
])

Integer.metaClass.getCm = {
	new Distance(delegate, DistanceUnit.centimeter)
}

Integer.metaClass.getM = {
	new Distance(delegate, DistanceUnit.meter)
}

Integer.metaClass.getKm = {
	new Distance(delegate, DistanceUnit.kilometer)
}

Integer.metaClass.getSeconds = {
	new Time(delegate, TimeUnit.second)
}

Integer.metaClass.getMinutes = {
	new Time(delegate, TimeUnit.minute)
}

Integer.metaClass.getHours = {
	new Time(delegate, TimeUnit.hour)
}

Integer.metaClass.getTimes {
	print " $delegate times"
}

shell = new GroovyShell(binding);
shell.evaluate(new File("src/command.groovy"))