// this import is optional
// import Customer

def d = new Date()

def anyObject = new Object()

def c1 = new Customer(
	first:'Tom',
	last:'Jones',
	age:21,
	since:d,
	favItems:['Books', 'Games'],
	object: anyObject)

def c2 = new Customer(
	'Tom',
	'Jones',
	21,
	d,
	['Books', 'Games'],
	anyObject)

assert c1 == c2