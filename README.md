
# Thoth Universal AI

Plug any app into any LLM for contextual task execution.

## Contents

- Android SDK (`ThothSDK.kt`)
- iOS SDK (`ThothSDK.swift`)
- React Native Bridge (`index.ts`)
- LLM Plugins (OpenAI, Ollama)
- OpenAPI Spec
- UI Mockup
- Monero:  88Ae5wwozjnjmhXRN987HXUgNZ8J8MEKBZf8gsxsMHj39HPHjCoirxZFy1UWuNSE36i3AB8ppqMAnNHiskbaut41AqGskaw

<img src="https://github.com/niyid/niyid/blob/main/monero_wallet.png" alt="Monero Wallet" width="300" height="300">

## Actions

Returns structured actions like:

{ "type": "complete_text", "target": "body", "value": "Hello there!" }

## Example: Chrono-Scripting Usage

```kotlin
val chronoManager = ChronoManager()

val emailAction = EmailAction(context)
chronoManager.addScript(
    ChronoScript(
        id = "email_reminder",
        description = "Send reminder email",
        action = { 
            emailAction.sendEmail(
                "someone@example.com", 
                "Reminder", 
                "This is your reminder."
            ) 
        }
    ),
    delayMillis = 60000L // Run after 1 minute
)

val smsAction = SmsAction(context)
chronoManager.addScript(
    ChronoScript(
        id = "sms_alert",
        description = "Send alert SMS",
        action = { 
            smsAction.sendSms(
                "+1234567890", 
                "This is your SMS alert."
            ) 
        }
    ),
    delayMillis = 120000L // Run after 2 minutes
)
```

