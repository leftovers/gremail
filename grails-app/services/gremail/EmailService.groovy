package gremail

class EmailService {

    static transactional = false

    def send(Map attrs) {
        sendJMSMessage("queue.email",
                [to: attrs.to,
                 from: attrs.from,
                 subject: attrs.subject,
                 view: attrs.view,
                 model: attrs.model])
    }

}
