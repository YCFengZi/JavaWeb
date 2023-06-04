package net.zjitc.Utils;

import org.junit.Test;

/**
 * @Author：YCFengZi
 * @Date：2023/6/1 16:08
 */
public class selectIdTest {
    selectId selectId = new selectId();
    @Test
    public void findById() {
        int id = selectId.FindById("YCFengZi");
        System.out.println(id);
    }
}