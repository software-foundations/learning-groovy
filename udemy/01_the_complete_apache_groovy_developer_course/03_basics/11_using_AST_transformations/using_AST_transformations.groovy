import groovy.transform.Canonical

@Canonical class Customer {
	String first, last
	int age
	Date since
	Collection favItems = ['Food']
	def object
}