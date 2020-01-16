#
GNAME= ulNoActions
GSRC= $(GNAME).g

all: grammar compiler

grammar: $(GSRCS)
	java org.antlr.Tool -fo ./src ./src/$(GSRC) 

compiler:
	javac ./src/*.java -d ./build

clean:
	rm ./build/*.class ./src/$(GNAME)Lexer.java ./src/$(GNAME)Parser.java ./src/$(GNAME).tokens


 
