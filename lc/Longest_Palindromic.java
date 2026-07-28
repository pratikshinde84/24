package lc;

import java.util.Arrays;

public class Longest_Palindromic {
    public String smallestPalindrome(String s) {

        int ar[]=new int[26];
        int n=s.length();
        int mid=n/2;
        for(int i=0;i<mid;i++){
            ar[s.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(ar));
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            while(ar[i]-->0){
                sb.append((char)('a'+i));
            }
        }
        String ans=sb.toString();
        if(n%2!=0){
            ans+=s.charAt(mid);
        }
        ans+=sb.reverse();
        System.out.println(ans);
        return "";
    }
    public static void main(String[] args) {
        Longest_Palindromic lc=new Longest_Palindromic();
        System.out.println(lc.smallestPalindrome("z"));
    }
}
