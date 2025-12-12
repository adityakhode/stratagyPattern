#!/usr/bin/env bash
set -euo pipefail
# Build the project and run tests; output will be in the `dist` directory per pom.xml
cd "$(dirname "$0")"
mvn -q clean package
echo "Build finished — compiled files and jar are in: $(pwd)/dist"
