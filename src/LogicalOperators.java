public class LogicalOperators {
    public void testOperators() {

        int boy, girl;
        boy = 18;
        girl = 68;

        //Double ampersand(&&): Test on both sides have to be true for the first statement/ code to execute
        //Or Double pipes(||): One of the test have to be true to execute the first statement
        //When working with the multiple test in the java program
        if(boy > 18 && girl < 4){
            System.out.println("You can enter");
        }else{
            System.out.println("You are young");
        }
    }
}
