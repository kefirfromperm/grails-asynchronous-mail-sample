package sample

class MailController {

    def index() {}

    def send(){
        sendMail {
            from params.from
            to params.to
            subject params.subject
            text params.body
        }

        redirect(controller: 'asynchronousMail', action: 'list')
    }
}
