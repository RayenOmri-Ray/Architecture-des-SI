AutoLock project - corrected IntelliJ run configuration

Cause:
The Java class is named AutoLockApplication (capital L) and its package is tn.esprit.autolock.
The correct fully qualified main class is:
tn.esprit.autolock.AutoLockApplication

Open this project in IntelliJ and select the AutoLockApplication run configuration.
If IntelliJ retains an old run configuration, open Run > Edit Configurations and set Main class to:
tn.esprit.autolock.AutoLockApplication

Then reload Maven and run:
  .\\mvnw.cmd clean
  .\\mvnw.cmd spring-boot:run
