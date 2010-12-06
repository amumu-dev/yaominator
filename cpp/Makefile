CFLAGS= -g
CC=g++

all: hello

hello: hello.cc clean
	$(CC) $(CFLAGS) hello.cc -o hello
	./hello

clean:
	rm -rf *.dSYM
	rm -rf hello

