package com.java.fileIO;

public class ExtractCdata {

	public static void main(String args) {
		// TODO Auto-generated method stub
		
		String sample1 = "00050000000EACED0005770800005AF3116EFB950000004AACED00057372000D6A6176612E73716C2E4461746514FA46683F3566970200007872000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800000129485AD800780000004AACED00057372000D6A6176612E73716C2E4461746514FA46683F3566970200007872000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800004EB9F6DD1400780000000AACED00057704000000010000000159";
		String sample2 = "00010000000EACED000577080000000000000064";
		String sample3 = "00010000000EACED00057708000110F0815CF89A";
		String sample4 = "00010000000EACED00057708000110F07AF4DFE6";
		String sample5 = "00010000000EACED00057708000110F0815CF89B" ;
		String sample6 = "00010000000EACED00057708000110F0815CF8A0";
		
		
		String cdata = sample6;
		//System.out.println(cdata.substring(0,4));
		int totalKeys = Integer.parseInt(cdata.substring(0,4));
		System.out.println(totalKeys);
		
		int i = 0, currentIndex = 4;
		
		while(i < totalKeys){
			//System.out.println("Printing key "+i);
			System.out.println(cdata.substring(4,12));
			System.out.println(cdata.substring(12,24));

			if("0000000E".equals(cdata.substring(currentIndex,currentIndex+8)) && "ACED00057708".equals(cdata.substring(currentIndex+8,currentIndex+20))){
				System.out.println("Before conversion : "+cdata.substring(currentIndex+20,currentIndex+36));
				System.out.println("Id is "+hex2decimal(cdata.substring(currentIndex+20,currentIndex+36)));
				break;
			}
			else {
				currentIndex = (int)hex2decimal(cdata.substring(currentIndex,currentIndex+8))*2;
			}
			
			i++;
			
		}

	}
	
	public static void main1(String[] args){
		String sample1 = "00050000000EACED0005770800005AF3116EFB950000004AACED00057372000D6A6176612E73716C2E4461746514FA46683F3566970200007872000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800000129485AD800780000004AACED00057372000D6A6176612E73716C2E4461746514FA46683F3566970200007872000E6A6176612E7574696C2E44617465686A81014B5974190300007870770800004EB9F6DD1400780000000AACED00057704000000010000000159";
		String sample2 = "00010000000EACED000577080000000000000064";
		String sample3 = "00010000000EACED00057708000110F0815CF89A";
		String sample4 = "00010000000EACED00057708000110F07AF4DFE6";
		String sample5 = "00010000000EACED00057708000110F0815CF89B" ;
		String sample6 = "00010000000EACED00057708000110F0815CF8A0";
		
		System.out.println(extractKey(sample6));
	}
	public static long extractKey(String cdata){
		System.out.println("Id is "+hex2decimal(cdata.substring(24,40)));
		
		return hex2decimal(cdata.substring(24,40));
	}
	
    public static long hex2decimal(String s)
    {
             String digits = "0123456789ABCDEF";
             s = s.toUpperCase();
             long val = 0;
             for (int i = 0; i < s.length(); i++)
             {
                 char c = s.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             return val;
    }
    
    
	public static void main(String[] args){
		String str = "testamadsdfd:12321321";
		String[] objs = str.split(":");
		 
		System.out.println(objs[0]);
		System.out.println(objs[1]);
		
	}


}
