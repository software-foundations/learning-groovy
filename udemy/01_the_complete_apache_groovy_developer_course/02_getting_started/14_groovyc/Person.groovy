class Person {

	String first
	String last

	public Person (String first, String last) {
		this.first = first
		this.last = last
	}

	public String toString(){
		"person: $first $last"
	}
}

Person.groovy(END)
