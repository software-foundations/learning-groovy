// Create Developer instances

def d1 = new Developer()

/*
This error raise when try instantiate a Class with no Constructor

Caught: groovy.lang.GroovyRuntimeException: Could 
not find matching constructor

Then, ALWAYS INSTANTIATE A CLASS WITHOUT PARAMETERS,
BECAUSE OF THE ABSCENCE OF THE CONSTRUCTOR METHOD

*/
// def d2 = new Developer("Bruno")
// def d3 = new Developer("Bruno", "Conde")

d1.first = "Bruno"
d1.setLast("Conde")

// d2.last = "Conde"

/*
Assign some languages
This error occurs when trying to assign when the
property is innexistent

groovy.lang.MissingPropertyException: No such 
property: languages for class: Developer

*/
d1.languages << "Groovy"
d1.languages << "Java"

// call some methods
d1.work()

println(d1.languages.getClass().getName())
println(d1.languages.class)
println(d1.languages)
