import jenkins.security.s2m.*
import jenkins.model.*

Jenkins.instance.injector.getInstance(AdminWhitelistRule.class)
    .setMasterKillSwitch(false);
Jenkins.instance.save()
