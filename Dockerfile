FROM openjdk:17
EXPOSE 9000
ADD target/springboot-jenkin.jar springboot-jenkin.jar
ENTRYPOINT [ "java","-jar","/springboot-jenkin.jar" ]