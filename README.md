# Spring-boot application with docker

**Prerequisites**

1. Clone this repo
2. Build the application. This will create .jar file inside target folder
3. Docker toolbox installed

**Steps to run the application**
1. Open Docker Quickstart Terminal
2. Move to the directory where you have cloned the repo in the terminal
3. Run below command to start the container.  
This will create an image from the provided [docker file](/Dockerfile)
```
docker build -t myimage .
```

4. List all the images with the command `docker images`
5. Create and run the container using the image created
```bash
docker run -d -p 8080:8080 --name webapp myimage
```
6. Check if container created successfully `docker ps`
Failed/stopped containers can be listed by `docker ps -a`
7. Point you browser to  
http://localhost:8080/greeting  
http://localhost:8080/greeting?message=Docker%20Expert

**Log into the running container**
```
docker exec -it <CONTAINER NAME> sh
```
**Cleanup**
1. Stop container^ `docker stop <CONTAINER ID>`
2. Delete container^ `docker rm <CONTAINER ID>`
3. Delete image^ `docker rmi <IMAGE ID>`

^ Name can also be used as identifier and you can provide multiple space separated Ids  
