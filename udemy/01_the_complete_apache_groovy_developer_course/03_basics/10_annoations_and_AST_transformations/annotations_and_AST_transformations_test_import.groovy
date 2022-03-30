////////////////
// Example 01 //
////////////////

/**
 * 01: Compile the Customer class
 * 02: execute this script
*/

def d = new Date()

// if the Customer class is not compiled, it will raise this error message
// unable to resolve class Customer 
def c1 = new Customer(
	first: 'Bruno', 
	last: 'Silva', 
	age: 21, 
	since: d, 
	favItems: ['Books', 'Games'])

def c2 = new Customer(
	first: 'Bruno', 
	last: 'Silva', 
	age: 21, 
	since: d, 
	favItems: ['Books', 'Games'])

println(c1)
println(c2)

println(c1 == c2)

assert c1 == c2 : "c1 != c2" // will display nothing

// error: Cannot set readonly property: first for class: Customer
// c1.first = "Peter"

assert (c1 != c2) : "c1 == c2" // will raises a "c1 == c2" int the error message

println "END" // will not be printed because the assertion statement failed
