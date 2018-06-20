# Spotbugs bugs

## Expected

When running `mvn verify` I expect spotbugs to find all three unused private fields.

## Actual

Spotbug only finds two unused private fields. The on in `C` is not detected.

