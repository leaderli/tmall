package tmall.test;

import org.apache.commons.lang.StringUtils;

/**
 * Created by li on 5/30/17.
 */
public class TestCase{
    public static void main(String[] args) {
        System.out.println(StringUtils.substringBetween("aa_bb_cc","_","_"));
        System.out.println(StringUtils.substringAfterLast("/forehome","/fore"));
    }
}
