package sample

import grails.plugin.asyncmail.AsynchronousMailService

class MailController {
    AsynchronousMailService asyncMailService;

    def index() {}

    def send(){
        asyncMailService.sendMail {
            from params.from
            to params.to
            subject params.subject
            text params.body
        }

        redirect(controller: 'asynchronousMail', action: 'list')
    }
}
