import Person

def person1 = new Person(first:"Cassio", last:"Silva")
def person2 = new Person(first:"Bruno", last:"Conde")

def people = [person1, person2]

def sorted_people = people.sort(false)

println people

println sorted_people