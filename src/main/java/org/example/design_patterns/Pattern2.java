package org.example.design_patterns;

public class Pattern2 {
    private final String a;
    private final int b;
    //private constructor
    private Pattern2(Config config) {
        this.a = config.a;
        this.b = config.b;
    }
    // static inner class
    public static class Config {
        private String a;
        private int b;
        private boolean c;

        public Config a(String a) { this.a = a; return this; }
        public Config b(int b) { this.b = b; return this; }
        public Pattern2 build() { return new Pattern2(this); }
    }

    @Override
    public String toString() {
        return "a='" + a + "', b=" + b;
    }

    // main method for testing this design pattern
    public static void main(String[] args) {
        // Create an instance of MyObject using the Config class
        Pattern2 obj = new Pattern2.Config()
                .a("example value")
                .b(100)
                .build();
        System.out.println(obj);
    }
}