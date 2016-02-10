package sample

import grails.plugin.asyncmail.AsynchronousMailService

class MailController {
    AsynchronousMailService asynchronousMailService;


    def index() {}

    def send(){
        asynchronousMailService.sendAsynchronousMail {
            from params.from
            to params.to
            subject params.subject
            text params.body
        }

        redirect(controller: 'asynchronousMail', action: 'list')
    }
}
