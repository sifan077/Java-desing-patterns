import com.sifan.factory.DatabaseLogFactory;
import com.sifan.factory.FileLogFactory;
import com.sifan.factory.LogFactory;
import com.sifan.product.Log;
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
