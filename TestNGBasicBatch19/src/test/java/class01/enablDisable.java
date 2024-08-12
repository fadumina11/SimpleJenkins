package class01;

import org.testng.annotations.Test;

public class enablDisable {
    @Test
    public void ATest(){
        System.out.println(" i am a test");
    }

    @Test (enabled = false)
    public void Btest(){
        System.out.println(" i am b test");
    }
}
