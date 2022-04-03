# Imports

## Packages
- Are a way to structure classes in a folder
- Packages must be imported to be used
- Intellij makes auto imports while we are coding
- We can make import only a class of a package
- We can import all package classes by using *

# Keyword
- https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
- http://groovy-lang.org/syntax.html#_keywords

- Groovy actually uses java language Keywords

# Comments
- http://groovy-lang.org/syntax.html#_single_line_comment
- https://medium.com/@webseanhickey/the-evolution-of-a-software-engineer-db854689243#.5zm1hn71e

There is 3 kinds of comments
1. One line comment
```groovy

// This is a Person class
class Person { ... }
```

2. Multiline comment
```groovy

/*
This is
a PersonClass
*/
class Person { ... }

/**
 * This is the Person class documentation
*/
class Perosn { ... }
```

3. Shebang Comment (interpreted by Unix systems)
- It knows how to execute a particular file from command line
```groovy
#!/usr/bin/env groovy

class Person { ... }
```

# Assertion
- https://stackoverflow.com/questions/12645142/groovy-assert-how-to-display-the-value

- Is a statement in java programming language
- We often see assertions in tests
- Program breaks if expression in assertion statement is false

- We have 3 scenarios to apply assertions


1. To assert when comparing expressions equals true (===> null)
```groovy
assert true

assert 1 == 1

def x = 1
assert x = 1
```

2. To assert when comparing expression equals false
```groovy
assert false

assert 1 == 2

def x = 1
assert x == 2
```
output:
```console
ERROR org.codehaus.groovy.runtime.powerassert.PowerAssertionError:
assert false
```

3. To assert complete debug output
```groovy
assert 1 == (3 + 10) * 100 / 5 * 20
```

```console
ERROR org.codehaus.groovy.runtime.powerassert.PowerAssertionError:                                                    
assert 1 == (3 + 10) * 100 / 5 * 20
         |     |     |     |   |
         false 13    1300  260 5200
```

```groovy
assert 1 == (3 + 10) * 100 / 5 * 20
```

```console
assert (x << 6) == [6,7,8,9,10]    
        | |     |               
        1 64    false  
```

# Scripts

- A script is a groovy code not enclosed in a class file

- Indeed, don't make the mistake thinking there is no class

- The groovy will compile the script into a class in the body of a run method

# Classes

- In contrast of java, groovy allow a file not has the same name of the class wich is enclosed by the file

- When use groovyc to compile a file, it export all classes in respective <class_name>.class file

- Classes are public by default

- Methods are public by default

- classes.groovy

```groovy
class AngryBirds {

}

class Bird {

}

class Pig {

}

```

```console
groovyc classes.groovy
```

```console
ls -l
```

```console
AngryBirds.class  Bird.class  classes.groovy  Pig.class
```

- def keyword: to just not typing a variable

- We Must use 'def' when the class has not a constructor

- Developer.groovy

```groovy
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

```

```groovy
def d = new Developer()
```

- Twe different ways to set the properties
- It works with get, too

```groovy
d.first = "Bruno"
d.setLast("Conde")
```

- Two different ways to get a class of a property
```groovy
println(d.languages.getClass().getName())
println(d.languages.class)
```

```console
java.util.ArrayList
class java.util.ArrayList
```
- When the class has a constructor, we use the class name in the place of 'def'

- Assign some value to a property
```groovy
d.languages << Groovy
d.languages << Python

println(d.languages)
```

```console
[Groovy, Java]
```

- Tweet.groovy
```groovy
@groovy.transform.ToString()
class Tweet {

    // properties
    String username
    String text
    Integer retweets
    Integer favorites
    Date createdOn

    // constructor
    public Tweet(String username, String text) {
        this.username = username
        this.text = text
        retweets = 0
        favorites = 0
        createdOn = new Date()

    }

    void addToRetweets() {
        retweets += 1
    }

    void addToFavorites () {
        favorites += 1
    }

}
```

Note, at the constructor, if we have a parameter with the
same name of a property, we must to use 'this' when reffers
to property

Indeed, if we use different parameter names, we don't need
to use 'this'

- Tweeter.groovy
```groovy
def tweet = new Tweet('Bruno', 'Hello, Twitter!')

println(tweet)

// Tweet(null, null, 0, 0, Sun Mar 20 12:57:03 BRT 2022)

```

```console
Tweet(Bruno, Hello, Twitter!, 0, 0, Sun Mar 20 13:41:03 BRT 2022)
```

# Numbers

- java.lang.Integer
- java.lang.BigInteger
- java.lang.BigDecimal (float with low precision)
- java.lang.Double (float with high precision)

```groovy
// java.lang.Integer
println(1.getClass().getName())

// java.lang.Long
println(1321314328597423.getClass().getName())

// java.lang.BigInteger
println(1321314328597423320918432423098.getClass().getName())

int x = 1

// class java.lang.Integer
println(x.class)

def y = 2

// class java.lang.Integer
println(y.class)

// class java.lang.BigDecimal
println(5.5.class)

def z = 5.5d

// class java.lang.Double
println(z.class)
```

# Control Structure

- http://groovy-lang.org/semantics.html#_control_structures

## if

```groovy
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
```

```console
Expression is True
Expression is !False = True
name has a value: Bruno
```

## if/else

```groovy
def num = 10

if (num == 10) {
    println("num is 10")
} else {
    println("num is NOT 10")
}
```

```console
num is 10
```

```groovy
def num = 5

if (num == 10) {
    println("num is 10")
} else {
    println("num is NOT 10")
}
```

```console
num is NOT 10
```

## while

```groovy
def i = 1

while (i < 10) {
    println(i)
    i += 1
}
```

```console
1
2
3
4
5
6
7
8
9
10
```

## for in list

```groovy
def li = [1, 2, 3, 4]

for (elem in li) {
    println(elem)
}
```

```console
1
2
3
4
```

## closure

```groovy
def li2 = [1, 2, 3, 4]

// we must to use 'it' when use .each to iterate

li2.each { println it }
```

```console
1
2
3
4
```

## switch

```groovy
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
```

```console
Number is 1
```

```groovy
myNumber = 2

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
```

```console
Number is 2
```

```groovy
myNumber = 10

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
```

```console
Number is not either 1 and 2. It is 10
```

# Annotaions and AST transformations
- http://groovy-lang.org/objectorientation.html#_annotation
- http://docs.groovy-lang.org/next/html/gapi/groovy/transform/package-summary.html
- http://docs.groovy-lang.org/next/html/gapi/groovy/transform/Immutable.html

- We can use annotation in groovy just as we can in java
- in most part of time, we are consumers of annotations
- We can create our own annotations, too

- Annotation Type Immutable (groovy.transform.immutable)
- http://docs.groovy-lang.org/next/html/gapi/groovy/transform/Immutable.html

```groovy
@ToString(cache: true, includeSuperProperties: true)
@EqualsAndHashCode(cache: true)
@ImmutableBase
@ImmutableOptions
@PropertyOptions(propertyHandler: ImmutablePropertyHandler)
@TupleConstructor(defaults: false)
@MapConstructor(noArg: true, includeSuperProperties: true, includeFields: true)
@KnownImmutable
@AnnotationCollector(mode: AnnotationCollectorMode.PREFER_EXPLICIT_MERGED)
@Retention(value: RetentionPolicy.RUNTIME)
@Target(value: [ElementType.TYPE])
@interface Immutable
```

- When execute groovy script
01. Compile the classes that it depends.
02. Executes the script

# Using AST Transformations

## @Canonical

- The @Canonical meta-annotation comnbines the @EqualsAndHashCode, @ToString and @TupleConstructor annotations.

- It is used to assist in the creation of mutable classes.

- It instructs the compiles to execute AST transformations which add positional constructors, equals, hashCode and pretty a pretty toString to your class

class_file.groovy
```groovy
    import groovy.transform.Canonical

    @Canonical class Customer {
        String first, last
        int age
        Date since
        Collection favItems = ['Food']
        def object
    }
```

app_file.groovy
```groovy
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
```

Compile the class
```console
groovyc class_file.groovy
ls
```

```console
output:
    -rw-rw-r-- 1 bruno bruno 9020 mar 30 06:52 Customer.class
    -rw-rw-r-- 1 bruno bruno  318 mar 30 06:51 class_file.groovy
    -rw-rw-r-- 1 bruno bruno  318 mar 30 06:51 app_file.groovy
```

execute the app
```console
groovy app_file.groovy
```

## @Sortable

- http://docs.groovy-lang.org/2.4.15/html/gapi/index.html?groovy/beans/Bindable
- It is a class annotation used to make a class Comparable by multiple Comparators
- Allows sorting

class_file.groovy
```groovy
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
```

sortable_app.groovy
```groovy
```

compile the class
```console
groovyc sortable_class.groovy
ls -l
```

```console
output:
    -rw-rw-r-- 1 bruno bruno 5039 abr  3 10:53 'Person$FirstComparator.class'
    -rw-rw-r-- 1 bruno bruno 5035 abr  3 10:53 'Person$LastComparator.class'
    -rw-rw-r-- 1 bruno bruno 6609 abr  3 10:53  Person.class
    -rw-rw-r-- 1 bruno bruno 6609 abr  3 10:53  sortable_app.class
    -rw-rw-r-- 1 bruno bruno 6609 abr  3 10:53  sortable_class.class
```

execute sortable_app.groovy
```console
groovy sortable_app.class
```

```console
output:
   [Person(Cassio, Silva), Person(Bruno, Conde)]
   [Person(Bruno, Conde), Person(Cassio, Silva)] 
```