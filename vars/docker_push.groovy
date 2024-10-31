def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'docker-cred', passwordVariable: 'dockerHubPass' , usernameVariable: 'dockerHubUser')])
  sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
}
sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"


