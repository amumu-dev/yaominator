ifeq ($(findstring config.xml,$(wildcard *.xml)), )
	TEST='empty'
else
	TEST='phpunit.config'
endif

STR=$(findstring smoke,$(wildcard tests/*))

STR=$(subst from , to , start from here )

BEFORE= a  b  c adf   
STR=$(strip $(BEFORE))


#return find if found, otherwise return space
BEFORE= a  b  c adf   
STR=$(findstring d, $(BEFORE))

#only keep the match 
BEFORE= foo.c  bar.c new.h
STR=$(filter %.c, $(BEFORE))

#only get rid of the match 
BEFORE= foo.c  bar.c new.h
STR=$(filter-out %.c, $(BEFORE))

# sort and delete duplicated 
BEFORE= foo bar foo loo  
STR=$(sort $(BEFORE))


# 
BEFORE=foo bar foo loo  
STR=$(word 2, $(BEFORE))
#return bar 


# from start to end 
BEFORE=foo bar foo loo  
STR=$(wordlist 2, 3, $(BEFORE))
#return bar foo 


#dir , notdir , suffix , basename 


BEFORE=foo bar foo loo  
STR=$(addsuffix .c, $(BEFORE))
#return foo.c bar.c foo.c loo.c 


BEFORE=foo bar foo loo  
STR=$(addprefix src/, $(BEFORE))
#return src/foo src/bar src/foo src/loo

LIST=a b c 
LIST2=1 2 3
STR=$(join $(LIST), $(LIST2))
#return a1 b2 c3

#wildcard 
STR=$(wildcard *.*)

#foreach function 
# $(foreach VAR,LIST,TEXT)
#

###########################
# space after ifeq is required !!!!
############################
ifeq (TEST,TEST)
	STR='same'
else
	STR='different'
endif


#ifneq 
#else
#endif 

test:
	@echo ===============
	@echo \|$(STR)\|
	@echo ===============
