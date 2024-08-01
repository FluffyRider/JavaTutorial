package exceptii;

import org.testng.annotations.Test;

public class ExceptionTest {

    @Test
    public void methodTest(){
        ExceptieConcept exceptieConcept = new ExceptieConcept();
       // exceptieConcept.checkedExceptionExample();
       // exceptieConcept.uncheckedExceptionExample();
       // exceptieConcept.throwExceptionexample(20);
        //exceptieConcept.throwExceptionexample(15);
        exceptieConcept.throwsExceptionExample();

    }
}
