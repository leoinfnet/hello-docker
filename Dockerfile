FROM amazoncorretto:17.0.10
WORKDIR /app
ARG port_build=8071
ENV port=$port_build
EXPOSE $port_build
COPY target/hello-docker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]