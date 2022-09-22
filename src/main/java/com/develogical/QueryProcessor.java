package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        // else if (query.toLowerCase().contains("yuqi")) {
        //     return "the most gorgeous lady in the world.";
        // }
        int idx = query.indexOf("largest:");
        idx += 9;
        String nums = query.substring(idx);
        String[] allNums = nums.split(",%");
        int ans = 0;
        for(int i = 0; i < allNums.length; i ++){
            if (Integer.parseInt(allNums[i]) > ans) {
                ans = Integer.parseInt(allNums[i]);
            }
        }
        return String.valueOf(ans);
        // return "New query";
    }
}
