package cn.com.jd.test;

/**
 * Created by jihaixiao on 2016/11/6.
 */
public class ArrayTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        for (int i =0;i<1000000;i++){
//            StringBuilder sb = new StringBuilder();
//            sb.append("select * from xxx where 1=1 ");
//            sb.append("and id=? and name=?");
//            sb.append(" order by name desc");
//            String sql = sb.toString();
//        }

        for (int i = 0;i<1000000;i++){
            String sql = "select * from xxx where 1=1"
                    + " and id=? and name=? "
                    + " order by name desc";
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
