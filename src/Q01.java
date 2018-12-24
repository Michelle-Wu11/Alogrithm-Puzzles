
public class Q01 {
	/*
	 * ���10-1000��ʮ���ơ��˽��ơ������ƶ��ǻ�����������
	 */
	private static String reverseString2(String str) {
 
		if (str.length() == 1)
			return str;
		else {
			String subString1 = str.substring(0, str.length() - 1);
			String subString2 = str.substring(str.length() - 1);
 
			return subString2 + reverseString2(subString1);
 		}
	}

	public static void main(String[] args) {		
		for(int i = 11; i < 1000; i++) {
			if(Integer.toString(i).equals(reverseString2(Integer.toString(i))) &&
			   Integer.toOctalString(i).equals(reverseString2(Integer.toOctalString(i))) &&
			   Integer.toBinaryString(i).equals(reverseString2(Integer.toBinaryString(i))))
			{
				System.out.println(i);
			}	
		}
	}
}