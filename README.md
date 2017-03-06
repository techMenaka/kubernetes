# kubernetes

This is a sample example to dockerize the application

1) create a simple application using spring boot.
2) Add the Docker file and include the pluggin in build.gradle
3) You can build a tagged docker image and then push it to a remote repository with Gradle in one command:
./gradlew build buildDocker
4) Docker image will be built and will be available in docker hub.
5) Pull the image using docker pull menakak/kubernetes
6) run it using : docker run -p 8080:8080 -t menakak/kubernetes:latest
7) To run as a daemon use : docker run -d -p 8080:8080 -t menakak/kubernetes:latest
8) to run it as a rest service include @RestController annotation