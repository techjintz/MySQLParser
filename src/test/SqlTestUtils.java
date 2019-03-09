package test;

import net.yeah.zhouyou.mickey.mysql.MySQLParserUtils;

public class SqlTestUtils {

	public static void test(String sql) {
		System.out.println("before  : " + sql);
		System.out.println("after   : " + MySQLParserUtils.addPressSufixToSqlNoCache(sql, "_press"));
		System.out.println();
	}

}
