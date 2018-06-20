# Spotbugs bugs

## Expected

When running `mvn verify` I expect spotbugs to find all three unused private fields.

## Actual

Spotbug only finds two unused private fields. The one in `C` is not detected. However some other errors for `C` are thrown.

