build : source/source.py
	mkdir build
	touch build/password_generator
	cat source/source.py > build/password_generator
	chmod 755 build/password_generator
