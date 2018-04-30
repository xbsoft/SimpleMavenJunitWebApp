pipeline {
  agent any
  stages {
    stage('Code') {
      steps {
        git 'https://github.com/xbsoft/SimpleMavenJunitWebApp'
      }
    }
    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            readFile 'POM.xml'
          }
        }
        stage('Package') {
          steps {
            bat 'mvn package'
          }
        }
      }
    }
    stage('Check') {
      steps {
        bat 'mvn -f pom.xml -e -B sonar:sonar -Dsonar.host.url=http://localhost:9000 && exit %%ERRORLEVEL%%'
      }
    }
  }
}