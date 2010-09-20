package gremail

class SendMailController {

    def emailService

    def index = {
        //example
        emailService.send(
            to: "mottsnite@gmail.com",
            from: "info@xmldo.net",
            subject: "Test HTML mail using JMS, ActiveMQ, and the Grails Mail plugin",
            model: [greeting: "こんにちわ世界!",messages:"本日は晴天なり。コロスケなりー"],
            view: "/emails/helloWorld")

        render text:"Mail sent"
    }
}
