# -> setup environment

	# 01 - installing java
	sudo apt-get install openjdk-8-jre

	# 02 - switch java installed via apt
	sudo update-alternatives --config java
	sudo update-alternatives --config javac

	# 03 - install sdkman
	curl -s "https://get.sdkman.io" | bash

	# 04 - install groovy 2.4.5
	sdk install groovy 2.4.15

	# 05 - set groovy 2.4.5 as default
	sdk default groovy 2.4.15

	# 06 - use groovy 2.4.5 in shell
	sdk use groovy 2.4.15

# -> execute groovy file
groovy assertions.groovy


# -> compile groovy file
groovyc assertions.groovy

