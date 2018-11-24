pipline{
	agent any
	stages {
		stage('Build') {
			steps {
				printIn "Build"
			}
		}
		stage('Test') {
			steps {
				printIn "Test"
			}
		}
		stage('Deploy') {
			steps {
				printIn "Deploy"
			}
		}
	}
}