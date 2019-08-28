build: classes KeyFileGenerator.class KeyFileGenerator.jar

classes:
	mkdir classes

KeyFileGenerator.class: source/KeyFileGenerator.java
	javac -d classes source/KeyFileGenerator.java

KeyFileGenerator.jar:
	mkdir build
	jar -cfe build/KeyFileGenerator.jar "KeyFileGenerator" -C classes KeyFileGenerator.class
