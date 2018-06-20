package de.mvitz.spotbugs;

final class C extends AbstractMethodError {

    private String foo = "bar";

    public static void main(String[] args) {
        new C();
    }

}
