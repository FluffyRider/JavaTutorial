package exceptii;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class ExceptionTest {

    @Test
    public void methodTest() throws FileNotFoundException {
        ExceptieConcept exceptieConcept = new ExceptieConcept();
       // exceptieConcept.checkedExceptionExample();
       // exceptieConcept.uncheckedExceptionExample();
       // exceptieConcept.throwExceptionexample(20);
        //exceptieConcept.throwExceptionexample(15);
        exceptieConcept.throwsExceptionExample();

    }
}
