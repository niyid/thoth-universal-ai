#!/bin/bash
echo "Running Android Test"
echo "Simulating plugin registration and LLM call..."
curl -X POST http://localhost:5001/register -H "Content-Type: application/json" -d '{"id":"test-plugin","description":"Test"}'
