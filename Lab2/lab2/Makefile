#
GNAME = simple
GSRC = $(GNAME).g

grammar: $(GSRC)
	java org.antlr.Tool $(GSRC)
	javac *.java

clean:
	rm *.class $(GNAME)*.java $(GNAME).tokens

 
