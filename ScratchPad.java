package algo;

//import java.util.Arrays;

public class ScratchPad {

//	static {
//		System.out.println("Shail");
//	}
	public static void main(String[] args) {
		
//		char a = 'A';
//		System.out.println(a);
//		a= 'a';
//		System.out.println(a);
//		
//		Arrays.sort(args);
		
//		int a = 10;
//		int b = 25;
//		doSomething (a, b);
//		System.out.println(a);
//		System.out.println(b);
//		
//		int [] myArr = { 100, 200 };
//		doSomething (myArr);
//		System.out.println (myArr[0] + " " + myArr[1]);
		
		//System.out.println(lengthOfLongestSubstring("abcd"));
//		System.out.println(NQueens.solveNQueens(8));
//		System.out.println(NQueens.resList);
//		loop1();
//		loop2();
		
		String myName = "shailpanchals";
		char [] charMap = myName.toCharArray();
		int [] charFreq = new int [26];
		
		for (char c : charMap) {
			System.out.print(c);
			charFreq[c-'a']++;
		}
		
		for (int i : charFreq) System.out.println (i);
		
//		A myStudent = new A();
//		myStudent.aadhar = "283746578695";
//		myStudent.id = 1;
//		myStudent.name = "Shail";
//		
//		System.out.println(A.count);
//		
//		myStudent.count++;
//		
//		
//		int [] arr = new int[5];
//		java.util.Arrays.copyOf(arr, 0);
//		
//		A newSt = new A();
//		newSt.aadhar = "123456789098";
//		newSt.id = 2;
//		newSt.name = "Avi";
//		
//		System.out.println(A.count);
		
		//System.out.println (myStudent.name + " " + newSt.name);
		
	}
	
	public static void loop1 () {
		long t = System.currentTimeMillis(); 
		int n = 0;
		for (int i = 1; i <= 1000000; i++) n = i+i;
		System.out.println(System.currentTimeMillis() - t);
		
	}
	
	public static void loop2 () {
		long t = System.currentTimeMillis(); 
		int n = 0;
		for (int i = 1; i <= 1000000; i= i + 10) {
			n = i+i;
			n = (i+1)+(i+1);
			n = (i+2)+(i+2);
			n = (i+3)+(i+3);
			n = (i+4)+(i+4);
			n = (i+5)+(i+5);
			n = (i+6)+(i+6);
			n = (i+7)+(i+7);
			n = (i+8)+(i+8);
			n = (i+9)+(i+9);
		}
		System.out.println(System.currentTimeMillis() - t);
	}
	
	public static void doSomething (int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
	}
	
	public static int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        
        char[] str = s.toCharArray();
        int n = str.length;
        int l = 0;
        
        int maxLen = 0;
        
        boolean[] flag = new boolean[256];
        
        for (int r = 0; r < n; r++) {
            char rc = str[r];
            
            while (flag[rc]) {
                char lc = str[l++];
                flag[lc] = false;
            }
            
            flag[rc] = true;
            
            maxLen = Math.max(maxLen, r-l+1);
        }
        
        return maxLen;
    }
	
	
	public static void doSomething (int [] arr) {
		
		arr[0] = arr[0] + arr[1];
		arr[1] = arr[0] - arr[1];
		arr[0] = arr[0] - arr[1];
		
	}

}
