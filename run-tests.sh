#!/bin/bash

ANTLR_JAR="antlr4.jar"

GRAMMAR="Solidity"
START_RULE="sourceUnit"
ERROR_PATTERN="(mismatched|extraneous)"

if [ ! -e "$ANTLR_JAR" ]; then
  curl http://www.antlr.org/download/antlr-4.7-complete.jar -o "$ANTLR_JAR"
fi

java -jar $ANTLR_JAR Solidity.g4
javac -classpath $ANTLR_JAR $GRAMMAR*.java

java -classpath $ANTLR_JAR:. org.antlr.v4.TestRig "$GRAMMAR" "$START_RULE" < "$1"
