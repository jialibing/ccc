package com.tencent.mr;

public class hello {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=100;i<=1000;i++) {
			int j;
			for(j=2;j<=(int)(Math.sqrt(i)+1);j++) {
				if(i%j==0) {
					break;
				}
				if(j>(int)Math.sqrt(i)) {
					System.out.println("i="+i);
				}
			}
		}
	}

}
