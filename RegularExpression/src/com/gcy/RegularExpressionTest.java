package com.gcy;

public class RegularExpressionTest {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		//1.表示一个字符串有一个a后面跟着零个或若干个b。（"a", "ab", "abbb",……）；
		/*String reg = "ab*";
		String str = "abbbbbc";*/
		
		//2.以"abc"开始，以"de"结束，中间有任意多个任意字符
		/*String reg = "^abc.*de$";
		String str = "abcaas12342341234dfsadfsde";*/
		
		
		/**
		 * 3.1 . 表示任意字符，？表示字符数是一个或0个，+表示1个或多个
		 * 3.2 用大括号里的一个数字表示：指定字符重复的次数。如ab{2},表示a后面跟着两个b
		 */
		/*String reg = "..?abc.b{2}";
		String str = "11abc1bb";*/
		
		
		/**
		 * 
		 * 4.1 "ab{2}"：表示一个字符串有一个a跟着2个b（"abb"）；
		 * 4.2 "ab{2,}"：表示一个字符串有一个a跟着至少2个b；
		 * 4.3 "ab{3,5}"：表示一个字符串有一个a跟着3到5个b。
		 * 4.4  其实*就相当于{0,}，+就相当于{1,}，？就相当于{0,1}
		 */
		/*String reg = "ab{2,5}";
		String str = "abbbbbb";*/
		
		/**
		 * 5.1 | 表示或
		 */
		/*
		String reg = "(hi|hello)*c"; //表示一个字符串里有任意个hi或hello后面接一个字符c
		String str = "hellohihelloc";
		String str2 = "hic";
		System.out.println(str2.matches(reg));
		System.out.println(str.matches(reg)); */
		
		/**
		 * 6.1
		 */
		/*
		String reg = "a.[0-9]"; //表示一个字符串是a接着一个任意字符然后接着一个数字
		String str = "ab2";
		System.out.println(str.matches(reg)); */
		
		
		/**
		 * 7.1
		 */
		/*String reg = ".{3}"; //表示一个字符串是3个任意字符组成
		String str = "ab2";
		System.out.println(str.matches(reg));*/
		
		
		/**
		 * 8.1
		 */
		/*String reg = "[ab]"; //相当于"a|b"
		String str = "ab";
		System.out.println(str.matches(reg));*/
		
		/**
		 * 9.1
		 */
		/*String reg = "[a-z]"; //表示由字符‘a’到字符‘z’组成
		String str = "a";
		System.out.println(str.matches(reg));*/
		
		
		/**
		 * 10.1
		 */
		/*String reg = "%.*[^a-z]%"; //表示百分号中不应该出现字母
		String str = "%1a%";
		System.out.println(str.matches(reg));*/
		
		/**
		 * 10.1
		 */
		/*String reg="\\[(\\[([0-9]+,)*[0-9]+\\],)+\\[([0-9]+,)*[0-9]+\\]\\]";
		//String str="[[27552,108],[7132],[6022],]]]";
		String str="[[309],[25330,27132],[26495,5831,6229],[6783,7068,6271]]";
		System.out.println(str.matches(reg));*/
		
		/**
		 * 11
		 * []里是可选字符集
		 * {}里是字符的重复字数
		 * 
		 * 12
		 * \w用于匹配字母数字和下划线
		 * 
		 * 13
		 * \d用于匹配从0到9的数字；
		 * 
		 * 14
		 * [\u4E00-\u9FA5]中文字符集
		 * 
		 * 15
		 * 为了逐字表达，你必须在"^.$()¦*+?{\"这些字符前加上转移字符'\'
		 * 
		 */
		
		//String reg = "([\u4E00-\u9FA5]{2,}|[a-zA-Z]{2,})"; //1.2中或2英
		
		/*String reg = "[\u4E00-\u9FA5]+·?[\u4E00-\u9FA5]+|[a-zA-Z]+(\\s?[a-zA-Z]+)*"; */
		/*
		String reg = "[\u4E00-\u9FA5]+·?[\u4E00-\u9FA5]+|[a-zA-Z]+(\\s?[a-zA-Z]+)*";
		String str = "郭朝永——";
		
		System.out.println(str.matches(reg));*/
		
		
		/**项目中有用**/
		/*String reg = "([\u4E00-\u9FA5a-zA-Z0-9]+——)+[\u4E00-\u9FA5a-zA-Z0-9]+";
		String str = "郭23asdf朝永asdf123——郭a1朝永——黄果树qwe1";
		System.out.println(str.matches(reg));		*/
		
		
		
		/*String reg = "WX_(JSAPI|NATIVE|APP)";
		String str = "WX_APP";
		System.out.println(str.matches(reg));*/
		
		
		String reg = "^[\u4E00-\u9FA5a-zA-Z0-9]+(——|[\u4E00-\u9FA5a-zA-Z0-9])?$";
		String str = "你好——";
		System.out.println(str.matches(reg));	
		
		
		
	}
}
