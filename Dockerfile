FROM openjdk:17
COPY ./target/calculator-1.0-SNAPSHOT.jar ./
COPY ./target/classes/* ./
WORKDIR ./
CMD ["java","-cp", "calculator-1.0-SNAPSHOT.jar:classes:log4j2.xml", "com.sample.Main"]

