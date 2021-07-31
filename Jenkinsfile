def gv
pipeline
{
 agent any
 
 parameters{
  string(name: "MY_PARAM", defaultValue: "AAA!!!", description: "Example")
 }
 
 tools{
   maven 'Maven 3.8.1' 
   nodejs 'NodeJs-16.6.0'
 }
 environment{
  NEW_VERSION = '1.3.0'
  FIRST_USER_CREDENTIALS = credentials('First-User')
 }
 stages{
     stage("init"){
         steps{
          script{
            gv = load(FirstScript.groovy")
          }
         }
     }
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
       when {
           expression{
              BRANCH_NAME == 'dev'
           }
          }
         steps{
              echo 'depolying the applecation...'
              echo "Version number ${NEW_VERSION}"
              echo "FIRST_USER_CREDENTIALS =  ${FIRST_USER_CREDENTIALS}"
              echo "MY_PARAM = ${params.MY_PARAM}"
              script{
               gv.initApp()
              }
         }
     }
 }   
}
