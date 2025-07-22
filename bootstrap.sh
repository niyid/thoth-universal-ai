#!/bin/bash
set -e

echo "Generating LLM clients..."
bash script1.sh

echo "Generating UI polish..."
bash script2.sh

echo "Generating build files..."
bash script3.sh

echo "Generating Remote Plugin Registry API..."
bash script4.sh

echo "Generating OpenAPI Spec..."
bash script5.sh

echo "Generating Test Scripts..."
bash scrip6.sh

echo "Packaging full project..."
bash script7.sh

echo "✅ All steps complete. Your final zip is thoth-universal-ai-full.zip"

