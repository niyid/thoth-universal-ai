#!/bin/bash
echo "Running iOS Test"
echo "Simulating LLM call using OpenAPI spec..."
curl -X POST http://localhost:5001/query -H "Content-Type: application/json" -d '{"prompt":"Hello"}'
