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
        stage('') {
          steps {
            bat 'mvn package'
          }
        }
      }
    }
  }
}