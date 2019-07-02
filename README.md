# Spring-boot application with docker

**Prerequisites**

1. Clone this repo
2. Build the application. This will create .jar file inside target folder
3. Docker toolbox installed

**Steps to run the application**
1. Open Docker Quickstart Terminal
2. Move to the directory where you have cloned the repo in the terminal
```
docker build -t myimage .
```
This will create an image from the provided [docker file](/Dockerfile)

3. List all the images with the command `docker images`
4. Create and run the container using the image created
To see the console
```bash
docker run -p 8080:8080 --name webapp myimage
```
To run in background
```bash
docker run -d -p 8080:8080 --name webapp myimage
```
5. Check if container created successfully `docker ps`
Failed/stopped containers can be listed by `docker ps -a`
6. Point you browser to  
http://localhost:8080/swagger-ui.html

**Log into the running container**
```
docker exec -it <CONTAINER NAME> sh
```
**Cleanup**
1. Stop container^ `docker stop <CONTAINER ID>`
2. Delete container^ `docker rm <CONTAINER ID>`
3. Delete image^ `docker rmi <IMAGE ID>`

^ Name can also be used as identifier and you can provide multiple space separated Ids  
