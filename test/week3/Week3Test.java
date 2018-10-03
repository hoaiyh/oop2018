package week3;
import org.junit.Assert;
import org.junit.Test;
public class Week3Test{
    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax() {
        Assert.assertEquals(4,Week3.max(4,3));
        Assert.assertEquals(0,Week3.max(0,-6));
        Assert.assertEquals(1,Week3.max(1,-1));
        Assert.assertEquals(3,Week3.max(3,1));
        Assert.assertEquals(4,Week3.max(4,4));

    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int[] a1 = {-1,0,5,4,6,7,3,2,1,0};
        Assert.assertEquals(-1,Week3.minOfArray(a1));
        int[] a2 = {0,1,2,3,-1,-2,5,1,-6};
        Assert.assertEquals(-6,Week3.minOfArray(a2));
        int[] a3 = {5,4,6,1,2,3,8,9};
        Assert.assertEquals(1, Week3.minOfArray(a3));
        int[] a4 = {0,7,1,2,3};
        Assert.assertEquals(0,Week3.minOfArray(a4));
        int[] a5 = {2,3,4,7,6,3,4};
        Assert.assertEquals(2,Week3.minOfArray(a5));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI(){
        Assert.assertEquals("Thieu can",Week3.calculateBMI(38,1.49));
        Assert.assertEquals("Binh Thuong",Week3.calculateBMI(56,1.6));
        Assert.assertEquals("Thieu can",Week3.calculateBMI(52,1.7));
        Assert.assertEquals("Beo phi",Week3.calculateBMI(120,1.5));
        Assert.assertEquals("Thua Can",Week3.calculateBMI(48,1.4));
    }

}