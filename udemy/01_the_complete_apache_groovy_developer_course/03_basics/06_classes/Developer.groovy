@groovy.transform.ToString()
class Developer {

	// 3 properties
	
	String first // String
	String last // String

	// def is to not type
	def languages = []

	// method (public by default)
	// means that 'public' can be ommited
	void work(){
		println("$first $last is working !")
	}


}