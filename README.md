# Thoth Universal AI

**Thoth** is a **universal LLM interface for device-level contextual intelligence**.

It allows **any app to plug into any large language model (LLM)**—local or remote—for **context-aware task execution, automation, and assistance**.

---

## Key Features

- **Universal LLM Plugin Layer**  
  Plug **Android**, **iOS**, or **React Native** apps into **OpenAI**, **Ollama**, or **local models**.

- **Action-Oriented Output**  
  LLMs return **structured actions**, not just plain text.

- **Chrono-Scripting Support**  
  Create **time-based tasks**, delayed actions, and automations natively.

- **Context Injection**  
  Your app provides runtime context to guide the LLM responses.

- **OpenAPI-Compatible**  
  Easily connect custom endpoints and extend Thoth with new models.

---

## Contents

| Module | Description |
|---|---|
| **Android SDK** | `ThothSDK.kt` – Android interface and base classes |
| **iOS SDK** | `ThothSDK.swift` – iOS native interface |
| **React Native Bridge** | `index.ts` – Unified LLM action bridge for React Native |
| **LLM Plugins** | OpenAI, Ollama, local model support |
| **OpenAPI Spec** | API definition for external plugins |
| **UI Mockup** | Plugin Manager & Action Viewer |

---

## Monero Support

Support the project:

**Monero Address:**  
`88Ae5wwozjnjmhXRN987HXUgNZ8J8MEKBZf8gsxsMHj39HPHjCoirxZFy1UWuNSE36i3AB8ppqMAnNHiskbaut41AqGskaw`

<img src="https://github.com/niyid/niyid/blob/main/monero_wallet.png" alt="Monero Wallet" width="300" height="300">

---

## Structured Actions

Thoth interprets LLM outputs into **device-level actions** like:

```json
{
  "type": "complete_text",
  "target": "body",
  "value": "Hello there!"
}

