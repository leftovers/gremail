package gremail

import javax.mail.internet.MimeUtility
import static org.codehaus.groovy.grails.commons.ConfigurationHolder.config as config

class SendMailController {

    def emailService

    def index = {
        //example
        String subject = 'JMS, ActiveMQ, メールプラグインでの、メール送信テスト'
        emailService.send(
            to: "sendtouser@somedomain.com",
            from: "me@youremdomain.com",
            subject: MimeUtility.encodeWord(subject,config.grails.mail.encoding?:'utf-8','B'),
            model: [greeting: "こんにちわ世界!",messages:"本日は晴天なり。コロスケなりー"],
            view: "/emails/helloWorld")

        render text:"Mail sent"
    }
}
