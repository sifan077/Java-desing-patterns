import com.sifan.Singleton;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class TestSingleton {

    @Test
    public void testSingleton() throws InterruptedException {
        SingletonThread thread1 = new SingletonThread();
        SingletonThread thread2 = new SingletonThread();
        SingletonThread thread3 = new SingletonThread();
        SingletonThread thread4 = new SingletonThread();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
    }
}

class SingletonThread extends Thread {
    @Override
    public void run() {
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        assertSame(s, s2);
    }
}