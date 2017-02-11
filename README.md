Grails Asynchronous Mail Sample
===============================

[![Build Status](https://travis-ci.org/kefirfromperm/grails-asynchronous-mail-sample.svg?branch=mongodb)](https://travis-ci.org/kefirfromperm/grails-asynchronous-mail-sample)

The sample application for the Grails Asynchronous Mail plugin.

Description
-----------

The application shows how to use the Grails Asynchronous Mail plugin. It has one form for sending email message and controller and views for seeing asynchronous messages in the DB.

I recommend to use [FakeSMTP](http://nilhcem.github.io/FakeSMTP/) as SMTP server for this example.

Branches
--------

The applications in all branches has equal functionality but uses different features of the plugin. There are 4 branches.

* `master` demonstrates a general usage of the plugin. It uses the [hibernate5](http://plugins.grails.org/plugin/grails/hibernate5) plugin as GORM persistence provider.
* `mongodb` uses the [mongodb](http://plugins.grails.org/plugin/grails/mongodb) plugin as GORM persistence provider.
* `hibernate4` is not used now.
* `cluster` demonstrates a usage the plugin in cluster.
