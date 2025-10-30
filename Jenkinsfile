pipeline {
    agent any // [cite: 81]
    stages {
        stage("Compile") { // [cite: 83]
            steps {
                sh "./gradlew compileJava" // [cite: 85]
            }
        }
        stage("Build") { // [cite: 88]
            steps {
                sh "./gradlew build" // [cite: 90]
            }
        }
        stage("Unit test") { // [cite: 93]
            steps {
                sh "./gradlew test" // 
            }
        }
    }
} // [cite: 80, 100, 101]