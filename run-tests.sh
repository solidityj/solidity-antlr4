#!/bin/bash

ANTLR_JAR="antlr4.jar"

GRAMMAR="Solidity"
START_RULE="sourceUnit"
ERROR_PATTERN="(mismatched|extraneous)"

if [ ! -e "$ANTLR_JAR" ]; then
  curl http://www.antlr.org/download/antlr-4.7-complete.jar -o "$ANTLR_JAR"
fi

alias antlr4="java -jar $ANTLR_JAR"
alias grun="java -classpath $ANTLR_JAR:. org.antlr.v4.TestRig"

antlr4 Solidity.g4
javac -classpath $ANTLR_JAR $GRAMMAR*.java

grun "$GRAMMAR" "$START_RULE" < "$1"
