import com.sifan.builder.KFCMealBuilder;
import com.sifan.builder.MCDMealBuilder;
import com.sifan.builder.MealBuilder;
import com.sifan.director.Waiter;
import com.sifan.product.Meal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBuilderPattern {

    @Test
    public void testKFCMealBuilder() {
        MealBuilder kfcMealBuilder = new KFCMealBuilder();
        Waiter waiter = new Waiter(kfcMealBuilder);
        Meal kfcMeal = waiter.getMeal();
        assertEquals("可乐", kfcMeal.getDrink());
        assertEquals("汉堡", kfcMeal.getFood());
    }

    @Test
    public void testMCDMealBuilder() {
        MealBuilder mcdMealBuilder = new MCDMealBuilder();
        Waiter waiter = new Waiter(mcdMealBuilder);
        Meal mcdMeal = waiter.getMeal();
        assertEquals("雪碧", mcdMeal.getDrink());
        assertEquals("薯条", mcdMeal.getFood());
    }
}