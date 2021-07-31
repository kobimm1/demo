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
              sh 'mvn --version'
         }
     }
     stage("deploy"){
         steps{
          when {
           expression{
              BRANCH_NAME == 'dev'
           }
          }
              echo 'depolying the applecation...'
         }
     }
 }   
}
