
Docker usage<br>
-----------------<br>
main dir: docker-compose -f docker-compose.yml build <br>
main dir: docker-compose up <br><br>
Also is available running project without docker.<br>
If you want to use your local database without dockerizing mysql just change application/docker environment

Gradle<br>
-----------------<br>
use gradle wrapper - there is no need to instal gradle<br>
in directory competenceProject/competence-project-backend<br>
use:<br>
./gradlew bootRun<br>
./gradlew bootJar<br>
<br><br>
For other tasks:<br>
./gradlew tasks<br>

Application tasks<br>
-----------<br>
bootRun - Runs this project as a Spring Boot application.<br>

Build tasks<br>
-----------<br>
bootJar - Assembles an executable jar archive containing the main classes and their dependencies.<br>



