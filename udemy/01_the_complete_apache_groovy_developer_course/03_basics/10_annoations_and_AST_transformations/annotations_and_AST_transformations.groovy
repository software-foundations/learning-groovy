////////////////
// Example 01 //
////////////////

// works without this import
// import groovy.transform.Immutable

@groovy.transform.Immutable class Customer {
	String first, last
	int age
	Date since
	Collection favItems
}

////////////////
// Example 02 //
////////////////

// Spring MVC Controller

// it indicates to the compiler
// that what follows in an annotation
// name is a paramter

// error: unable to find class for annotation
// it happens 'cause Controller class (from springboot) is not imported

// @Controller(name="HomeController")
// class HomeController {

// 	String home() {

// 	}
// }