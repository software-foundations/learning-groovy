if (true) {
	println("Expression is True")
}

// falsy values:
// false | null | empty strings | empty collection

if (false) {
	println("Expression is False")
}

if (!false) {
	println("Expression is !False = True")
}

String name = null

// false
if (name) {
	println("name has a value")
}

name = 'Bruno'

// true
if (name) {
	println("name has a value: $name")
}

name = ""

// false
if (name) {
	println("name has a value: $value")
}

// if/else

def num = 5

if (num == 10) {
	println("num is 10")
} else {
	println("num is NOT 10")
}

// while

def i = 1

while (i < 10) {
	println(i)

	// both works the same way
	// i += 1
	i ++
}

// for in list

def li = [1, 2, 3, 4]

for (elem in li) {
	println(elem)
}

// closure

def li2 = [1, 2, 3, 4]

li2.each { println it }

// switch

def myNumber = 1

switch (myNumber) {

	case 1:
		println "Number is 1"
		break

	case 2:
		println "Number is 2"
		break

	default:
		println "Number is not either 1 and 2. It is $myNumber"
}