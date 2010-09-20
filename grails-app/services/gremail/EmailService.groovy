package gremail

import javax.mail.internet.MimeUtility

import static org.codehaus.groovy.grails.commons.ConfigurationHolder.config as config

class EmailService {

    static transactional = false

    def send(Map attrs) {

        String subject = attrs.subject
        if(config.grails.mail.subject.encoding){
            subject = MimeUtility.encodeWord(subject,config.grails.mail.subject.encoding?:'utf-8','B')
        }

        sendJMSMessage("queue.email",
                [to: attrs.to,
                 from: attrs.from,
                 subject: subject,
                 view: attrs.view,
                 model: attrs.model])
    }

}
