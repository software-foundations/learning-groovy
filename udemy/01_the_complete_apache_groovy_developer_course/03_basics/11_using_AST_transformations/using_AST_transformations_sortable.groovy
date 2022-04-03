// -> preferred import way
import groovy.transform.ToString
import groovy.transform.Sortable

// -> alternative import way
// import groovy.transform.*

@ToString
@Sortable
class Person {
	String first
	String last
}