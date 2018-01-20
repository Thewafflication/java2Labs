#!/bin/bash
#Gradle is not yet packaged for Java 9 on my system...
source ./clean.sh
if [ ! -d "./bin" ]; then
mkdir bin
fi
if [ ! -d "./doc" ]; then
mkdir doc
fi
echo "*******************************************************************************"
echo "                                 Building Project"
echo "*******************************************************************************"
echo ""
javac -cp .:/usr/share/java/junit4-4.12.jar -verbose -d ./bin/ CustomString.java CustomStringTest.java 2> log.txt
cd bin/
echo "*******************************************************************************" 
echo "                                Testing Project"                            
echo "*******************************************************************************"
echo ""
java -cp .:/usr/share/java/junit4-4.12.jar org.junit.runner.JUnitCore CustomStringTest >&1
cd ../
