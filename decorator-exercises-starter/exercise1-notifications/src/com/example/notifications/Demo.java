package com.example.notifications;

/**
 * Starter demo that uses only the existing Email notifier.
 * TODOs guide you to add decorators and compose them.
 */
public class Demo {
    public static void main(String[] args) {
        Notifier base = new EmailNotifier("user@example.com");

        // Baseline behavior (already works)
        base.notify("Baseline email only.");

        // === YOUR TASKS ===
        // 1) Create a base decorator class: NotifierDecorator implements Notifier and wraps another Notifier.
        // 2) Create concrete decorators:
        //      - SmsDecorator (adds SMS send)
        //      - WhatsAppDecorator (adds WhatsApp send)
        //      - SlackDecorator (adds Slack send)
        // 3) Compose at runtime to achieve these combinations:
        //      a) Email + SMS
        //      b) Email + WhatsApp
        //      c) Email + Slack
        //      d) Email + WhatsApp + Slack
        //
        // Example (after you implement):
        // Notifier smsAndEmail = new SmsDecorator(base, "+91-99999-11111");
        // smsAndEmail.notify("Build green ✅");
        //
        // Notifier full = new SlackDecorator(new WhatsAppDecorator(base, "user_wa"), "deployments");
        // full.notify("Deployment completed 🚀");

        // a) Email + SMS
        Notifier emailAndSms = new SmsDecorator(base, "+91-99999-11111");
        emailAndSms.notify("Email + SMS notification");

        // b) Email + WhatsApp
        Notifier emailAndWa = new WhatsAppDecorator(base, "user_wa");
        emailAndWa.notify("Email + WhatsApp notification");

        // c) Email + Slack
        Notifier emailAndSlack = new SlackDecorator(base, "general");
        emailAndSlack.notify("Email + Slack notification");

        // d) Email + WhatsApp + Slack
        Notifier emailWaSlack = new SlackDecorator(new WhatsAppDecorator(base, "user_wa"), "deployments");
        emailWaSlack.notify("Email + WhatsApp + Slack notification");
    }
}
