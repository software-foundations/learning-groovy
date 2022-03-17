# -> Groovyc Documentation
# https://groovy-lang.org/groovyc.html

# -> Groovy class
https://groovy-lang.org/objectorientation.html

# -> Compile to java bytecode
groovyc Hello.groovy

# -> see the binary code
less Hello.class

# -> Remove the compiled file
rm Hello.class

# -> Compile all .groovy files
groovyc *.groovy

# -> See compiled files
ls -l

# -> -d
# Specify where to place generated class files.
groovyc -d classes *.groovy

# -> check classes directory
ls -l classes

# -> rm classes directory
rm -r classes

# -> Compile .groovy and run .class files
groovyc -d classes .groovy
groovy classes/Application