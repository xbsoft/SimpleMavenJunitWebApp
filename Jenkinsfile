pipeline {
  agent any
  stages {
    stage('Code') {
      steps {
        git 'https://github.com/xbsoft/SimpleMavenJunitWebApp'
      }
    }
    stage('Build and Test') {
      parallel {
        stage('Build') {
          steps {
            readFile 'pom.xml'
            bat 'mvn install -DskipTests'
          }
        }
        stage('UnitTest') {
          steps {
            bat 'mvn package'
          }
        }
      }
    }
    stage('Check') {
      parallel {
        stage('Check') {
          steps {
            bat 'mvn -e -B sonar:sonar -Dsonar.host.url=http://106.14.68.164:9000 -Dsonar.sources=src\\main -Dsonar.scm.provider=git -Dsonar.java.binaries=target && exit %%ERRORLEVEL%%'
          }
        }
        stage('checkx') {
          steps {
            sh 'ls -l'
          }
        }
      }
    }
    stage('NexusUpload') {
      steps {
        sleep 10
        build 'NexusUpload'
      }
    }
    stage('Selenium') {
      steps {
        build 'SeleniumDemo'
      }
    }
    stage('Jmeter') {
      steps {
        build 'JMeterDemo'
      }
    }
  }
  post {
    always {
      junit '**/reports/junit/*.xml'

    }

  }
}
