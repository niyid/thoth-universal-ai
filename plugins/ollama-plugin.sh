
#!/bin/bash
curl http://localhost:11434/api/generate -d '{
  "model": "llama3",
  "prompt": "'"$1"'",
  "stream": false
}'
