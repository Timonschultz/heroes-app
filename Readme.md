#Heroes-App

This is a practice project for me. Planned to be a Heroes of the Storm application with a Java Backend and an Angular frontend running in a Docker container.

#####To run and build the app:
Package the application. \
> mvn clean package

Start a postgres container with the postgres script. \
> postgres.bat

Build a docker image: 
> docker build -t hero .

Run the image: 
> docker run --link mypostgres -p 8080:8080 hero

Now on http://localhost:8080/greetings you can put a post request with a name as a parameter (eg. http://localhost:8080/greetings/?name=timon)\
You can now make 2 get calls: \
    http://localhost:8080/greetings/1
    http://localhost:8080/greetings/1/greet