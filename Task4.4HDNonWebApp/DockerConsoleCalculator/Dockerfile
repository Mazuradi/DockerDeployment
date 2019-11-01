FROM openjdk:latest
COPY src DockerConsoleCalculator
WORKDIR DockerConsoleCalculator
RUN mkdir -p bin
RUN javac -d bin ./com/myapp/Calculator.java
WORKDIR bin
CMD ["java", "com.myapp.Calculator"]