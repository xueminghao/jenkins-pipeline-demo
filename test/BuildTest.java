import com.demo.models.Param;
import com.demo.tasks.Build;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BuildTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void run() {
        Param param = new Param();
        param.setName("iOS");
        param.setRepo("iOS-repo");
        Build builder = new Build();
        int ret = (int) builder.run(param);
        assert ret == 1;
    }
}