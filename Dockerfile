FROM openjdk:8-jdk-alpine

#Add linux package to the base image
#RUN echo 'http://yumsrv03cn.netcracker.com/apk/alpine3.5/main' >> /etc/apk/repositories && \
#     apk add --no-cache --update ttf-dejavu

VOLUME /tmp
ADD target/DevApp-1.0-*SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]