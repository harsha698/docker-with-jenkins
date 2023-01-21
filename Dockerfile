FROM adoptopenjdk/openjdk8:jre8u362-b09-alpine

#INSTALL NPM
RUN apk add --update nodejs npm

#INSTALL JAVA
RUN apk add openjdk11

#INSTALL MAVEN
RUN apk add maven