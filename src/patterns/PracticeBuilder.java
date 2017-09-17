package patterns;

public class PracticeBuilder {

    int intVariableOne;
    int intVariableTwo;
    String stringVariableOne;
    String stringVariableTwo;

    private PracticeBuilder() {
        // empty to prevent instantiation
    }

    private PracticeBuilder(Builder builder) {
        this.intVariableOne = builder.getIntVariableOne();
        this.intVariableTwo = builder.getIntVariableTwo();
        this.stringVariableOne = builder.getStringVariableOne();
        this.stringVariableTwo = builder.getStringVariableTwo();
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getIntVariableOne() {
        return intVariableOne;
    }

    public int getIntVariableTwo() {
        return intVariableTwo;
    }

    public String getStringVariableOne() {
        return stringVariableOne;
    }

    public String getStringVariableTwo() {
        return stringVariableTwo;
    }

    public static class Builder {

        int intVariableOne;
        int intVariableTwo;
        String stringVariableOne;
        String stringVariableTwo;

        private Builder() { }

        public PracticeBuilder build() {
            return new PracticeBuilder(this);
        }

        public Builder withIntVariableOne(int intVariableOne) {
            this.intVariableOne = intVariableOne;
            return this;
        }

        public Builder withIntVariableTwo(int intVariableTwo) {
            this.intVariableTwo = intVariableTwo;
            return this;
        }

        public Builder withStringVariableOne(String stringVariableOne) {
            this.stringVariableOne = stringVariableOne;
            return this;
        }

        public Builder withStringVariableTwo(String stringVariableTwo) {
            this.stringVariableTwo = stringVariableTwo;
            return this;
        }

        public int getIntVariableOne() {
            return intVariableOne;
        }

        public int getIntVariableTwo() {
            return intVariableTwo;
        }

        public String getStringVariableOne() {
            return stringVariableOne;
        }

        public String getStringVariableTwo() {
            return stringVariableTwo;
        }
    }
}
