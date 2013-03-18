regex-presentation.pdf: regex-presentation.tex \
	gfx/dfa.tex.in
	latexmk -g -pdf regex-presentation.tex

build:	lang/regex lange/regex.class

run: lang/regex.c.run lang/regex.java.run lang/regex.py.run lang/regex.pl.run

lang/regex:	lang/regex.c

lang/regex.class:	lang/regex.java
	javac -d lang lang/regex.java

lang/regex.c.run:	lang/regex lang/regex.c.msg
	./lang/regex
lang/regex.java.run:	lang/regex.class lang/regex.java.msg
	java -classpath lang regex
lang/regex.py.run:	lang/regex.py lang/regex.py.msg
	python $<
lang/regex.pl.run:	lang/regex.pl lang/regex.pl.msg
	perl $<

lang/regex.c.msg:
	@echo "Running C"
lang/regex.java.msg:
	@echo "Running Java"
lang/regex.py.msg:
	@echo "Running Python"
lang/regex.pl.msg:
	@echo "Running Perl"


%.tex.in: %.dot
	dot -Txdot "$<" | dot2tex --figonly -ftikz > "$@"
%.tex.in: %.neato
	neato -Txdot "$<" | dot2tex --figonly -ftikz > "$@"
clean:
	make -f ~/make/texclean.mk $@
	-rm regex-presentation.fdb_latexmk
	-rm *.in
	-rm lang/regex
	-rm lang/regex.class
cleanall:
	make -f ~/make/texclean.mk $@
