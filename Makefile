SRC_NAME = computor.java \
						Complex.java \
						Monome.java \
						Polynome.java


SRC_PATH = src/
OBJ_PATH = bin/

NAME = computor.Class

CC = javac

OBJ_NAME = $(SRC_NAME:.java=.class)

SRC = $(addprefix $(SRC_PATH),$(SRC_NAME))
OBJ = $(addprefix $(OBJ_PATH),$(OBJ_NAME))

all : $(NAME)


$(NAME) : $(OBJ)
	@ln -s bin/computor.class ./$(NAME) 2>&1 > /dev/null || true 

$(OBJ_PATH)%.class: $(SRC_PATH)%.java
	mkdir $(OBJ_PATH) 2> /dev/null || true
	$(CC) -d bin/ -cp $(SRC_PATH) $<

clean: fclean

fclean:
	/bin/rm -fv $(OBJ)
	@rmdir $(OBJ_PATH) 2> /dev/null || true
	rm -fv $(NAME)


re: fclean all

.PHONY : all clean fclean re
