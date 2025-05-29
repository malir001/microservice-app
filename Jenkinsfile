pipeline {
  agent any
  environment {
    AWS_REGION = 'ap-south-1'
    ECR_REPO = '203918866361.dkr.ecr.ap-south-1.amazonaws.com/myapp'
  }
  stages {
    stage('Checkout') {
      steps {
        git url: 'https://github.com/youruser/microservice-app.git'
      }
    }
    stage('Build with Maven') {
      steps {
        sh 'mvn clean package'
      }
    }
    stage('Docker Build') {
      steps {
        sh 'docker build -t myapp .'
      }
    }
    stage('ECR Login') {
      steps {
        sh 'aws ecr get-login-password --region $AWS_REGION | docker login --username AWS --password-stdin $ECR_REPO'
      }
    }
    stage('Push to ECR') {
      steps {
        sh '''
          docker tag myapp:latest $ECR_REPO:latest
          docker push $ECR_REPO:latest
        '''
      }
    }
  }
}
