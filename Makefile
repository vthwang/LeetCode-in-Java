# Set default question number is 0
N?=0

run:
	@cd MarkdownGenerator && make && cd ..

readme:
	@./mdg readme

prepare:
	@./mdg prepare -number $(N)