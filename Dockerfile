FROM openjdk:17
COPY ./target/calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-cp", "calculator-1.0-SNAPSHOT.jar", "com.sample.Main"]

