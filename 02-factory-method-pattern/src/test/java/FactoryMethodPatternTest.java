import com.sfian.factory.DatabaseLogFactory;
import com.sfian.factory.FileLogFactory;
import com.sfian.factory.LogFactory;
import com.sfian.product.Log;
import org.junit.Test;

public class FactoryMethodPatternTest {
    @Test
    public void testFactoryMethod() {
        LogFactory fileLogFactory = new FileLogFactory();
        Log fileLog = fileLogFactory.createLog();
        fileLog.writeLog();

        LogFactory databaseLogFactory = new DatabaseLogFactory();
        Log databaseLog = databaseLogFactory.createLog();
        databaseLog.writeLog();
    }
}
