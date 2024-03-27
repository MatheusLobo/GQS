#!/bin/bash

set -e

commits=$(git log --pretty=format:"%s")

for commit in $commits; do
  if ! echo "$commit" | grep -E '^(feat|fix|docs|style|refactor|perf|test|chore|build|ci|revert)(\(.+\))?: .{1,}' ; then
    echo "INVALID COMMIT MESSAGE: $commit"
    exit 1
  fi
done

echo "All commits are valid"