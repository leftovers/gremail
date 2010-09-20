package gremail

import static org.codehaus.groovy.grails.commons.ConfigurationHolder.config as config

class SendMailController {

    def emailService

    def index = {
        //example
        emailService.send(
            to: config.grails.mail.test.sendto,
            from: config.grails.mail.test.from,
            subject: 'JMS, ActiveMQ, メールプラグインでの、メール送信テスト',
            model: [greeting: "こんにちわ世界!",messages:"本日は晴天なり。コロスケなりー"],
            view: "/emails/helloWorld")

        render text:"Mail sent"
    }
}
