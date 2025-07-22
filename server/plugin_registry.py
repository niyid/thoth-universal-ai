from flask import Flask, jsonify, request

app = Flask(__name__)

PLUGINS = [
    {"id": "email", "description": "Send Emails"},
    {"id": "sms", "description": "Send SMS"},
    {"id": "llm-complete", "description": "LLM Text Completion"}
]

@app.route('/plugins', methods=['GET'])
def get_plugins():
    return jsonify(PLUGINS)

@app.route('/register', methods=['POST'])
def register_plugin():
    data = request.json
    PLUGINS.append(data)
    return jsonify({"status": "registered", "plugin": data})

if __name__ == "__main__":
    app.run(port=5001)
