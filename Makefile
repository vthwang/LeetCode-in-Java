# Set default question number is 0
N?=0

readme:
	@./mdg readme

prepare:
	@./mdg prepare -number $(N)