# HelloJava - Continuous Integration
Including Gradle, GitHub, CircleCi and DockerHub<br /><br />

This is a simple hello world (java) project with continuous integration workflow including the following steps:
<br />
1) Code changes pushed into the master branch on GitHub<br />
2) This automatically triggers a new build on CircleCi<br />
3) If everything succeeds (java build, junit tests, etc.), CircleCi builds a new docker image<br />
4) Rollout image via DockerHub<br />

## Gradle <i>(build.gradle)</i>
1) Run all JUnit tests <br />
2) Build the hello world java code, which will be included and executed. <br />

## CircleCi <i>(circle.yml)</i>
1) Build java source code with <i> ./gradlew build </i> <br />
2) Run all unit tests <br />
3) Create a new version of the docker image, if all tests succeeded 'peerdavid/hellojava'<br />
4) Push image to dockerhub<br />
<br />
<b> If you want to create your own ci build, you have to set the environment variables EMAIL, USER and PASSWORD to connect CircleCi with DockerHub </b>
  
## DockerImage <i>(Dockerfile)</i>
1) Use java 8 base image<br />
2) Copy java class files into the docker container<br />
3) Execute it
