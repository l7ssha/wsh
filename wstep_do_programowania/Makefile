SRCS = $(wildcard src/*.c)
PROGS = $(patsubst %.c,%, $(SRCS))

all: $(PROGS)

%: %.c
		$(CC) $(CFLAGS) -o $@ $<

clean: 
		rm -f $(PROGS)