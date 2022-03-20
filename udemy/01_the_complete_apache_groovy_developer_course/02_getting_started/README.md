# Resume

## Setup environment

- 01 - Installing java

```console
sudo apt-get install openjdk-8-jre
```

- 02 - Switch java installed via apt

```console
sudo update-alternatives --config javac
sudo update-alternatives --config java
```

- 03 - Install sdkman

```console
curl -s "https://get.sdkman.io" | bash
```

- 04 - Install groovy 2.4.5

```console
sdk install groovy 2.4.15
```

- 05 - Set groovy 2.4.5 as default

```console
sdk default groovy 2.4.15
```

- 06 - Use groovy 2.4.5 in shell

```console
sdk use groovy 2.4.15
```
	
## Execute groovy file

```console
groovy <fileName>.groovy
```

## Compile groovy file

```console
groovyc <fileName>.groovy
```
--
End of Resume
--

# Install java via
- https://openjdk.java.net/install/

```console
sudo apt-get install openjdk-8-jre
```

# Switch java installed via apt
- https://askubuntu.com/questions/461754/switching-java-version-through-apt

sudo update-alternatives --config java
sudo update-alternatives --config javac

- Check if installation is sucessfull

```console
java -version
javac -version 
```

# SDKMAN: software development kit manager
- https://sdkman.io/

- Check if installation is sucessfull

```console
sdk version
sdk help
sdk list
```

# Install gradle
- https://gradle.org/install/

```console
sdk install gradle <version>
```

- Check if installation is sucessfull

```console
gradle - v
```

# Install groovy

- List groovy packages

```console
sdk list groovy
```

- Install groovy in a specific version

```console
$ sdk install groovy <version>
$ sdk install groovy 2.4.0

output:

	Downloading: groovy 2.4.0                                                       

	In progress...                                                                  

	##################################### 100,0%

	Installing: groovy 2.4.0                                                        
	Done installing!                                                                


	Setting groovy 2.4.0 as default.

$ sdk install groovy 2.4.5

output:
	

```

- Check if groovy 2.4.0 and 2.4.5 are installed

```console
sdk list groovy

output:
	
	================================================================================
	Available Groovy Versions                                                       
	================================================================================
	     4.0.1               2.5.1               2.3.1               1.7.11         
	     4.0.0               2.5.0               2.3.0               1.7.10         
	     4.0.0-rc-2          2.4.21              2.2.2               1.7.9                                                    
	     4.0.0-rc-1          2.4.20              2.2.1               1.7.8          
	     3.0.10              2.4.19              2.2.0               1.7.7          
	     3.0.9               2.4.18              2.1.9               1.7.6          
	     3.0.8               2.4.17              2.1.8               1.7.5          
	     3.0.7               2.4.16              2.1.7               1.7.4          
	     3.0.6               2.4.15              2.1.6               1.7.3          
	     3.0.5               2.4.14              2.1.5               1.7.2          
	     3.0.4               2.4.13              2.1.4               1.7.1          
	     3.0.3               2.4.12              2.1.3               1.7.0          
	     3.0.2               2.4.11              2.1.2               1.6.9          
	     3.0.1               2.4.10              2.1.1               1.6.8          
	     3.0.0               2.4.9               2.1.0               1.6.7          
	     2.6.0-alpha-4       2.4.8               2.0.8               1.6.6          
	     2.6.0-alpha-3       2.4.7               2.0.7               1.6.5          
	     2.6.0-alpha-2       2.4.6               2.0.6               1.6.4          
	     2.6.0-alpha-1       2.4.5               2.0.5               1.6.3          
	     2.5.16              2.4.4               2.0.4               1.6.2          
	     2.5.15              2.4.3               2.0.3               1.6.1          
	     2.5.14              2.4.2               2.0.2               1.6.0          
	     2.5.13              2.4.1               2.0.1               1.5.8          
	     2.5.12          > * 2.4.0               2.0.0               1.5.7          
	     2.5.11              2.3.11              1.8.9               1.5.6          
	     2.5.10              2.3.10              1.8.8               1.5.5          
	     2.5.9               2.3.9               1.8.7               1.5.4          
	     2.5.8               2.3.8               1.8.6               1.5.3          
	     2.5.7               2.3.7               1.8.5               1.5.2          
	     2.5.6               2.3.6               1.8.4               1.5.1          
	     2.5.5               2.3.5               1.8.3               1.5.0          
	     2.5.4               2.3.4               1.8.2                              
	     2.5.3               2.3.3               1.8.1                              
	     2.5.2               2.3.2               1.8.0                              
	                                                                                
	================================================================================
	+ - local version                                                               
	* - installed       
	> - currently in use                                                                                                      
	================================================================================ 
```

- set the groovy version as default to use

```console
sdk default groovy 2.4.5

output:

	Default groovy version set to 2.4.5
```

- List groovy versions, including the installed and so on

```console
$ sdk list groovy

output:
	
	================================================================================
	Available Groovy Versions                                                       
	================================================================================
	     4.0.1               2.5.1               2.3.1               1.7.11         
	     4.0.0               2.5.0               2.3.0               1.7.10         
	     4.0.0-rc-2          2.4.21              2.2.2               1.7.9          
	     4.0.0-rc-1          2.4.20              2.2.1               1.7.8          
	     3.0.10              2.4.19              2.2.0               1.7.7          
	     3.0.9               2.4.18              2.1.9               1.7.6          
	     3.0.8               2.4.17              2.1.8               1.7.5          
	     3.0.7               2.4.16              2.1.7               1.7.4          
	     3.0.6               2.4.15              2.1.6               1.7.3          
	     3.0.5               2.4.14              2.1.5               1.7.2          
	     3.0.4               2.4.13              2.1.4               1.7.1          
	     3.0.3               2.4.12              2.1.3               1.7.0          
	     3.0.2               2.4.11              2.1.2               1.6.9          
	     3.0.1               2.4.10              2.1.1               1.6.8          
	     3.0.0               2.4.9               2.1.0               1.6.7          
	     2.6.0-alpha-4       2.4.8               2.0.8               1.6.6          
	     2.6.0-alpha-3       2.4.7               2.0.7               1.6.5          
	     2.6.0-alpha-2       2.4.6               2.0.6               1.6.4          
	     2.6.0-alpha-1   > * 2.4.5               2.0.5               1.6.3          
	     2.5.16              2.4.4               2.0.4               1.6.2          
	     2.5.15              2.4.3               2.0.3               1.6.1          
	     2.5.14              2.4.2               2.0.2               1.6.0          
	     2.5.13              2.4.1               2.0.1               1.5.8          
	     2.5.12            * 2.4.0               2.0.0               1.5.7          
	     2.5.11              2.3.11              1.8.9               1.5.6          
	     2.5.10              2.3.10              1.8.8               1.5.5          
	     2.5.9               2.3.9               1.8.7               1.5.4          
	     2.5.8               2.3.8               1.8.6               1.5.3          
	     2.5.7               2.3.7               1.8.5               1.5.2          
	     2.5.6               2.3.6               1.8.4               1.5.1          
	     2.5.5               2.3.5               1.8.3               1.5.0          
	     2.5.4               2.3.4               1.8.2                              
	     2.5.3               2.3.3               1.8.1                              
	     2.5.2               2.3.2               1.8.0                              

	================================================================================
	+ - local version   
	* - installed                                                                   
	> - currently in use
	================================================================================ 

```

# Groovysh (Groovy shell)
- http://groovy-lang.org/groovysh.html

- Help groovy shell

```console
$ groovysh -help
```

- Check groovysh version

```console
$ groovysh -version
$ groovysh --version

output:
	

```

- Start the groovy shell

```console
$ groovysh

output:

	WARNING: An illegal reflective access operation has occurred                    
	WARNING: Illegal reflective access by org.codehaus.groovy.reflection.CachedClass$3$1 (file:/home/bruno/.sdkman/candidates/groovy/2.4.5/lib/groovy-2.4.5.jar) to method java.lang.Object.finalize()        
	WARNING: Please consider reporting this to the maintainers of org.codehaus.groovy.reflection.CachedClass$3$1
	WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
	WARNING: All illegal access operations will be denied in a future release       
	Gtk-Message: 18:49:47.075: Failed to load module "canberra-gtk-module"

	.
	.
	.


```

- After this error message, I will give a try to latest groovy version
- After that, set this groovy version as default

```console
$ sdk install groovy 4.0.1
$ sdk default groovy 4.0.1
```

- Try enter in the console again

```console
$ groovysh

output:
	
	Gtk-Message: 18:59:58.444: Failed to load module "canberra-gtk-module"
	Groovy Shell (4.0.1, JVM: 11.0.14)                                                  
	Type ':help' or ':h' for help.   
```

- Enter in a groovy console in a quiet mode

```console
$ groovysh --quiet

output:
	
	Gtk-Message: 19:05:59.699: Failed to load module "canberra-gtk-module"
	
```

- Instead, we can use a specific groovy version in the current shell
```console
$ sdk use groovy <version>

output:
	
	Using groovy version <version> in this shell
```

- Check current groovy version
```console
$ sdk current groovy
```

# Groovysh

- press tab

```console

output:
	
	:h          :help       :?          ?           :exit       :x          :q          :quit       :i          
	import      :d          :display    :c          :clear      :S          :show       :inspect    :n                     
	:p          :purge      :e          :edit       :l          :load       .           :.          :s                     
	:save       :r          :record     :H          :history    :a          :alias      :=          :set        
	:g          :grab       :rc         :register   :D          :doc 

```

- hello-world

```console
println 'Hello, World'
println "Hello, World"
```

- Multiple line code

```console
Class Person {
	def sayHello() { println "Hello" }
}
```

- Some code

```console
person = new Person()

person.sayHello()

def hello(name) {
	println "Hello, $name"
}

hello("Bruno")

```

- Help

```console
:h
```

- quit

```console
:q
```

# Compilling and using running groovyc and groovy online tools

- Create Person.groovy

```console
$ touch Person.groovy
```

- Person.groovy

```groovy
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
```

- Compile

```console
$ groovyc Person.groovy
$ ls -a

output:
	
```

# From java to groovy

In groovy ...

- We dont need any import statment, 'cause it is made by default
- Method and classes are, by default, public
- 'return' statemen can be ommited
- ';' can be ommited
- Properties are private by default
- Getting and setting are created by default (can be ommited)
- We don't need a constructor
- println"" instead of System.out.println("")
- Template string: "Hi, my name is $name"
- $ access properties in a class

- Use this to format print a class in a string
```groovy
@groovy.transform.ToString()
class Person { ... }
```

- The above substitue the bellow
```groovy
@Override
public String toString(){
    return "Person[first=" + firstName + ",last=" + lastName + "]";
}
```

