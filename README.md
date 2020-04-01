# Compiler_435
A compiler project for CSC435 at UVic
Written by Braydon Horcoff (V00917594)

Note:
-packages contains all relevant classes for project
-grammar file, Compiler.java in src/
-test cases are in tests/accept and tests/reject

Assignment #1 Tests:
-Add build to CLASSPATH
-Run make
-Run with command:
 	java -cp "antlr-3.5.2-complete.jar:./build" Compiler tests/accept/<filename>.ul

Assignment #2 Tests:
-place test cases in home directory (withoutSubtypes cases)
-cd to build directory and run ../runTests.sh
-read error messages without stack trace
-to add stack trace uncomment line in catch statement in Compiler.java

Assignment #3:
-place test cases somewhere accesible from Compilers/build
-type make in Compilers/ and cd to Compilers/build
-run "java Compiler ../FILEPATH../<filename>.ul"
-move output <filename>.ir to same directory as codegen script

Assignment #4:
-same as assignment 3
-invoke jasmin on codegenerated .j file
-run java <filename> 

enjoy
