package callback;

/**
 * Created by Eric on 2/3/2016.
 */

/**
 * 测试类
 *
 * @author xiaanming
 */
public class Test {
    public static void main(String[] args) {
        /**
         * new 一个小李
         */
        Li li = new Li();

        /**
         * new 一个小王
         */
        Wang wang = new Wang(li);

        /**
         * 小王问小李问题
         */
        wang.askQuestion("1 + 1 = ?");
    }
}

//  http://blog.csdn.net/xiaanming/article/details/8703708