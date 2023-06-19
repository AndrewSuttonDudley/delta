#!/bin/bash

./gradlew clean
./gradlew build
docker image build -t sleepyheadlabs-delta:latest .
docker compose up
