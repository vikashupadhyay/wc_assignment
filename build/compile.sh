rm -rf out/*.class
javac -cp "src:lib/junit-4.12.jar" -d "out" test/WordCountTest.java src/WordCount.java 