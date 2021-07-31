pipeline
{
 agent any 
 tools{
   maven 'Maven 3.8.1' 
   nodejs 'NodeJs-16.6.0'
 }
 stages{
     stage("build"){
         steps{
             echo 'building the applecation...'
             sh 'npm --version'
         }
     }
     stage("test"){
         steps{
              echo 'testing the applecation...'
              sh 'maven --version'
         }
     }
     stage("deploy"){
         steps{
              echo 'depolying the applecation...'
         }
     }
 }   
}
