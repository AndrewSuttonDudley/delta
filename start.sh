#!/bin/bash

docker compose down
./gradlew clean
./gradlew build
docker image build -t sleepyheadlabs-delta:latest .
echo "start"
docker compose build --pull --no-cache
echo "stop"
docker compose up
