package org.example.design_patterns;

public class Pattern1 {

        private static Pattern1 instance;

        private Pattern1(){}

        public static Pattern1 getInstance() {
            if (instance == null) {
                instance = new Pattern1();
            }
            return instance;
        }
}
