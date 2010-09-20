package gremail

class SendMailService {

    boolean transactional = false
    static expose = ['jms']
    static destination = "queue.email"

    def mailService

    def onMessage(message) {
        try {
            mailService.sendMail {
                to message.to
                from message.from
                subject message.subject
                body(view: message.view, model: message.model)
            }
        } catch (Exception e) {
            log.error("Failed to send email ${emailMessage}", e)
        }
        return null
    }
}
