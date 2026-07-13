def call(String url, String branch){
  echo "Cloning git repo"
  git url: "${url}", branch:"${branch}"
  echo "Clonign Successfully!!!"
}
