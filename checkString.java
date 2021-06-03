/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication29;

/**
 *
 * @author carnival
 */

    
    
    
    public class checkString {
    public static boolean check(String x){
        if(x == null || x.length() == 0)
            return false;
        return x.chars().allMatch(Character::isLetter);
    }
    public static void main(String[] args) throws Exception {
        String[] strings = new String[]{
            "","test","mohamed@","3dl2%","d$%d","ss",null
        };
        for(String s : strings){
            System.out.println(
                check(s)
            );
        }
    }
}
    

