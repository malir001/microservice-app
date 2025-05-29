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
        echo "stage checkout done"
      }
    }
    stage('Build with Maven') {
      steps {
        sh 'mvn clean package'
        echo "stage mvn done"
      }
    }
    stage('Docker Build') {
      steps {
        sh 'docker build -t myapp .'
        echo "stage docker build done"
      }
    }
    stage('ECR Login') {
      steps {
        echo "stage entry for ecr done"
        sh 'aws ecr get-login-password --region $AWS_REGION | docker login --username AWS --password-stdin $ECR_REPO'
        echo "stage  for ecr done"
      }
    }
    stage('Push to ECR') {
      steps {
        echo "stage  entry for Push to ECR done"
        sh '''
          docker tag myapp:latest $ECR_REPO:latest
          docker push $ECR_REPO:latest
        '''
        echo "stage  Push to ECR done"
      }
    }
  }
}
