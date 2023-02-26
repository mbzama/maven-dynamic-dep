# Build artifact using dynamic configuration


## Install deps
	`cd shared-lib-v1` 
	`mvn clean install -DskipTests=true`

	`cd shared-lib-v2` 
	`mvn clean install -DskipTests=true`
	
## Build with v1
	`mvn clean package -Dshared-lib-artifactId=shared-lib-v1 -Dshared-lib-version=1.0 -DskipTests=true && java -jar target/maven-dynamic-dep-1.0.war`

## Build with v2
	`mvn clean package -Dshared-lib-artifactId=shared-lib-v2 -Dshared-lib-version=2.0 -DskipTests=true && java -jar target/maven-dynamic-dep-1.0.war`


