package gremail

class SendMailController {

    def emailService

    def index = {
        //example
        emailService.send(
            to: "mottsnite@gmail.com",
            from: "tyama@xmldo.net",
            subject: 'JMS, ActiveMQ, メールプラグインでの、メール送信テスト',
            model: [greeting: "こんにちわ世界!",messages:"本日は晴天なり。コロスケなりー"],
            view: "/emails/helloWorld")

        render text:"Mail sent"
    }
}
