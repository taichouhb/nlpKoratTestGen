# Running EvoSuite

##Be in root directory of 
## export evosuite=export evosuite="java -jar $(pwd)/evosuite-1.0.6.jar"  
##  $evosuite -class Tower -projectCP ./
## javac -cp junit4.12.jar:.:hamcrest-core-1.3.jar:evosuite-standalone-runtime-1.0.6.jar evosuite-tests/Tower_ESTest.java
## java -cp junit-4.12.jar:.:hamcrest-core-1.3.jar:evosuite-standalone-runtime-1.0.6.jar:evosuite-1.0.6.jar:evosuite-tests org.junit.runner.JUnitCore Tower_ESTest 