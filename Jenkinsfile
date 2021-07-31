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
         }
     }
     stage("test"){
         steps{
              echo 'testing the applecation...'
         }
     }
     stage("deploy"){
         steps{
              echo 'depolying the applecation...'
         }
     }
 }   
}
