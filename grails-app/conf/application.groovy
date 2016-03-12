hibernate{
    cache{
        queries = false
        use_second_level_cache = true
        use_query_cache = false
        region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory'
	}
}

dataSource{
    pooled = true
    jmxExport = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}

environments{
    development{
        mongodb {
            host = "localhost"
            port = 27017
//            username = "blah"
//            password = "blah"
//            databaseName = "foo"
        }
	}
    test{
	}
    production{
	}
}

grails{
    profile = 'web'
    codegen.defaultPackage = 'sample'
    spring.transactionManagement = false
}
info{
    app{
        name = '@info.app.name@'
        version = '@info.app.version@'
        grailsVersion = '@info.app.grailsVersion@'
	}
}
spring.groovy.template.'check-template-location' = false

grails{
    mime{
        disable.accept.header.userAgents = ['Gecko','WebKit','Presto','Trident']
        types{
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
    views{
        'default'{
            codec = 'html'
		}
        gsp{
            encoding = 'UTF-8'
            htmlcodec = 'xml'
            codecs{
                expression = 'html'
                scriptlets = 'html'
                taglib = 'none'
                staticparts = 'none'
			}
		}
	}
}

endpoints.jmx.'unique-names' = true

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
asynchronous.mail.persistence.provider='mongodb'      // Possible values are 'hibernate', 'hibernate4', 'mongodb'
asynchronous.mail.gparsPoolSize = 1
asynchronous.mail.newSessionOnImmediateSend = false

quartz.jdbcStore = false