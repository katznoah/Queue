all: C Java
run: all
	./run
C:
	cc -o run run.c
Java:
	javac Queue.java
clean:
	rm -f run Queue.class
