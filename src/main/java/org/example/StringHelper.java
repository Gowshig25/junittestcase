package org.example;

public class StringHelper {
    public String removeFirstTwoA(String name){
        String ans="";
        if(name.isEmpty()){
            return name;
        }
        if(name.length()==1 && name.charAt(0)=='A'){
            return "";
        }
        if(name.length()>2){
            for(int i=0;i<name.length();i++){
                if(name.charAt(i)!='A' || i>=2){
                    ans+=name.charAt(i);
                }
            }
            return ans;
        }

        return name;
    }
}
