#
GNAME= ulNoActions
GSRC= $(GNAME).g

all: grammar compiler

grammar: $(GSRCS)
	java org.antlr.Tool -fo ./src ./src/$(GSRC) 

compiler:
	javac ./src/*.java ./src/packages/*.java -d ./build 

clean:
	rm ./build/*/* ./build/* -r

