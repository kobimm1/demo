pipeline
{
 agent any 
 stages{
     stage("build"){
         steps{
             echo 'building the applecation...'
             withMaven(    // Maven installation declared in the Jenkins "Global Tool Configuration"
        maven: 'maven-3', // (1)
        // Use `$WORKSPACE/.repository` for local repository folder to avoid shared repositories
        mavenLocalRepo: '.repository', // (2)
        // Maven settings.xml file defined with the Jenkins Config File Provider Plugin
        // We recommend to define Maven settings.xml globally at the folder level using
        // navigating to the folder configuration in the section "Pipeline Maven Configuration / Override global Maven configuration"
        // or globally to the entire master navigating to  "Manage Jenkins / Global Tools Configuration"
        mavenSettingsConfig: 'my-maven-settings' // ){
               sh 'maven --version'
          }
         }
     }
     stage("test"){
         steps{
              echo 'testing the applecation...'
              nodejs('NodeJs-16.6.0'){
               sh 'npm install -g'
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
