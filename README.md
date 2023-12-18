#  spring-boot-consul-template
This is an basis Example of an Spring Boot app and config in consul with running Github Action

##  Features
- Spring Boot current 20231218 Version
- Java 21
- Maven
- consul config
- GitHub Action with Sonarcube, dependencies to external an pixomia internal public repos, deploying to github packages and...


## preconditions in github settings 
create two envoirment secrets:
PAT => your personal access token => needes for the get artefaktes/dep from other personal repos 
SONAR-TOKEN => the Sonarcloud Token to connet it to the sonarcloud

## preconditions in your envoirment
- set up and consul server and add your config in src/main/resources/application.properties
- the spring boot consul config was definded "Key and Values/config/AppName/values used in your app
- so create the follwing values
- /config/SpringBootConsulTemplateApplication/value.from.config => "Test" => the test text to syso
- /config/SpringBootConsulTemplateApplication/logging.level.root => "ALL" => the logging level
