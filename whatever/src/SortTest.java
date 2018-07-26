import static org.junit.Assert.*;

import org.junit.Test;

public class SortTest {

    @Test
    public void test() {
        Sort sort = new Sort();
        int[] input = {1};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[] {1},sorted);
    }
    
    @Test
    public void test2() {
        Sort sort = new Sort();
        int[] input = {1,2};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[] {1,2},sorted);
    }
    
    @Test
    public void test3() {
        Sort sort = new Sort();
        int[] input = {2,1};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[] {1,2},sorted);
    }
    @Test
    public void test4() {
        Sort sort = new Sort();
        int[] input = {1,2,3};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[] {1,2,3},sorted);
    }
    @Test
    public void test5() {
        Sort sort = new Sort();
        int[] input = {2,1,3};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[] {1,2,3},sorted);
    }
    @Test
    public void test6() {
        Sort sort = new Sort();
        int[] input = {3,1,2};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[] {1,2,3},sorted);
    }
    @Test
    public void test7() {
        Sort sort = new Sort();
        int[] input = {3,2,1};
        int[] sorted = sort.of(input);
        assertArrayEquals(new int[] {1,2,3},sorted);
    }

}
