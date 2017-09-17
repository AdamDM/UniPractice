package patterns;

public class PracticeBuilderUse {

    public PracticeBuilderUse() {

    }

    public static void main(String[] args) {
        PracticeBuilder practiceBuilder = PracticeBuilder.builder()
                .withIntVariableOne(1)
                .withIntVariableTwo(2)
                .withStringVariableOne("A string")
                .withStringVariableTwo("another string")
                .build();

        System.out.println(practiceBuilder.getStringVariableTwo());
    }
}
