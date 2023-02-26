mvn clean package -Dshared-lib-artifactId=shared-lib-v1 -Dshared-lib-version=1.0 -DskipTests=true && java -jar target/maven-dynamic-dep-1.0.war
