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
#!usr/bin/env groovy

class Person { ... }
```