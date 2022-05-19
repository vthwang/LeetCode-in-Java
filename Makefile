# Set default question number is 0
n?=0

run:
	@cd MarkdownGenerator && make && cd ..

readme:
	@./mdg readme

prepare:
	@./mdg prepare -number $(n)