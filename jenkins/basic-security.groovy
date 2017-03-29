#!groovy

import jenkins.model.*
import hudson.security.*

def instance = Jenkins.getInstance()
if (!instance.isUseSecurity()) {
  println "--> creating local user 'admin'"

  def hudsonRealm = new HudsonPrivateSecurityRealm(false)
  hudsonRealm.createAccount('admin','admin')
  hudsonRealm.createAccount('swarm','swarm')
  instance.setSecurityRealm(hudsonRealm)

  def strategy = new FullControlOnceLoggedInAuthorizationStrategy()
  instance.setAuthorizationStrategy(strategy)
  instance.save()
}
