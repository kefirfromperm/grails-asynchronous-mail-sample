hibernate{
    cache{
        queries = false
        use_second_level_cache = true
        use_query_cache = false
	}
}

dataSource{
    pooled = true
}

environments{
    development{
        dataSource{
            jmxExport = true
            driverClassName = "org.h2.Driver"
            username = "sa"
            password = ""
            dbCreate = 'create-drop'
            url = 'jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE'
		}
	}
    test{
        dataSource{
            jmxExport = true
            driverClassName = "org.h2.Driver"
            username = "sa"
            password = ""
            dbCreate = 'update'
            url = 'jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE'
		}
	}
    production{
        dataSource{
            driverClassName = "org.postgresql.Driver"
            username = "postgres"
            password = "postgres"
            dbCreate = "update" // one of 'create', 'create-drop','update'
            url = "jdbc:postgresql://localhost:5432/gamcs"
		}
	}
}

grails{
    profile = 'web'
    codegen.defaultPackage = 'sample'
    spring.transactionManagement.proxies = false
    gorm.reactor.events = false
}
info{
    app{
        name = '@info.app.name@'
        version = '@info.app.version@'
        grailsVersion = '@info.app.grailsVersion@'
	}
}
spring {
    main.'banner-mode' = 'off'
    groovy.template.'check-template-location' = false
}

grails {
    mime {
        disable.accept.header.userAgents = ['Gecko','WebKit','Presto','Trident']
        types {
            all = '*/*'
            atom = 'application/atom+xml'
            css = 'text/css'
            csv = 'text/csv'
            form = 'application/x-www-form-urlencoded'
            html = ['text/html','application/xhtml+xml']
            js =  'text/javascript'
            json = ['application/json','text/json']
            multipartForm = 'multipart/form-data'
            pdf = 'application/pdf'
            rss = 'application/rss+xml'
            text = 'text/plain'
            hal = ['application/hal+json','application/hal+xml']
            xml = ['text/xml','application/xml']
		}
	}
    urlmapping.cache.maxsize = 1000
    controllers.defaultScope = 'singleton'
    converters.encoding = 'UTF-8'
    views {
        'default' {
            codec = 'html'
		}
        gsp{
            encoding = 'UTF-8'
            htmlcodec = 'xml'
            codecs {
                expression = 'html'
                scriptlets = 'html'
                taglib = 'none'
                staticparts = 'none'
			}
		}
	}
}

endpoints {
    enabled = false
    jmx.enabled = true
}

grails {
    mail {
        host = "127.0.0.1"
        props=["mail.transport.protocol":"smtp"]
    }
}

asynchronous.mail.default.attempt.interval = 300000l       // Five minutes
asynchronous.mail.default.max.attempts.count = 1
asynchronous.mail.send.repeat.interval = 60000l           // One minute
asynchronous.mail.expired.collector.repeat.interval = 607000l
asynchronous.mail.messages.at.once = 100
asynchronous.mail.send.immediately = true
asynchronous.mail.override = true
asynchronous.mail.clear.after.sent = false
asynchronous.mail.disable = false
asynchronous.mail.useFlushOnSave = true
asynchronous.mail.persistence.provider='hibernate'      // Possible values are 'hibernate', 'hibernate4', 'mongodb'
asynchronous.mail.gparsPoolSize = 1
asynchronous.mail.newSessionOnImmediateSend = false


environments {
    test {
        quartz {
            autoStartup = false
        }
    }
    production {
        quartz {
            autoStartup = true
            jdbcStore = true
            waitForJobsToCompleteOnShutdown = true
            exposeSchedulerInRepository = false

            props {
                scheduler.skipUpdateCheck = true
            }

            scheduler.instanceName = 'clustering_quartz'
            scheduler.instanceId = 'AUTO'

            threadPool.class = 'org.quartz.simpl.SimpleThreadPool'
            threadPool.threadCount = 5
            threadPool.threadPriority = 5

            jobStore.misfireThreshold = 60000

            jobStore.class = 'org.quartz.impl.jdbcjobstore.JobStoreTX'
            jobStore.driverDelegateClass = 'org.quartz.impl.jdbcjobstore.PostgreSQLDelegate'

            jobStore.useProperties = false
            jobStore.tablePrefix = 'QRTZ_'
            jobStore.isClustered = true
            jobStore.clusterCheckinInterval = 5000

            plugin.shutdownhook.class = 'org.quartz.plugins.management.ShutdownHookPlugin'
            plugin.shutdownhook.cleanShutdown = true
        }
    }
}
