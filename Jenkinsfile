pipeline
{
 agent any 
 stages{
     stage("build"){
         steps{
             echo 'building the applecation...'
          withMaven(){
           sh 'maven -v'
          }
         }
     }
     stage("test"){
         steps{
              echo 'testing the applecation...'
          nodejs('NodeJs-16.6.0'){
          sh 'npm -v'
          }
         }
     }
     stage("deploy"){
         steps{
              echo 'depolying the applecation...'
         }
     }
 }   
}
