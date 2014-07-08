grails-asynchronous-mail-sample
===============================

The sample application for the Grails Asynchronous Mail plugin.

Description
-----------

The application shows how to use the Grails Asynchronous Mail plugin. It has one form for send email message and controller and views for see asynchronous messages in the DB.

I recommend to use [FakeSMTP](http://nilhcem.github.io/FakeSMTP/) as SMTP server for this example.

Branches
--------

The applications in all branches has equals functionality but uses different features of the plugin. There are 4 branches.

* `master` demonstrates usual usage of the plugin. It uses the [hibernate](http://www.grails.org/plugin/hibernate) plugin as GORM persistence provider.
* `hibernate4` uses the [hibernate4](http://www.grails.org/plugin/hibernate4) plugin as GORM persistence provider.
* `mongodb` uses the [mongodb](http://www.grails.org/plugin/mongodb) plugin as GORM persistence provider.
* `cluster` contains the Quartz configuration to use it in a cluster environment.
