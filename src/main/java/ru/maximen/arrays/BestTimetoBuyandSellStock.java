package ru.maximen.arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {
      log.info(String.valueOf(getBestTimetoBuyandSellStock(new int[]{1,2,32,4,6,4,2,2})));




    }

    public static int getBestTimetoBuyandSellStock(int[] in){
        if ((in == null) || (in.length == 0)) return 0;
        int minPrice = in[0];
        int maxProfit = 0;

        for (int i = 0; i < in.length; i++){
            if (in[i] < minPrice) {
                minPrice = in[i];
            } else if (in[i] - minPrice > maxProfit){
                maxProfit = in[i] - minPrice;
            }
        }
        return maxProfit;
    }




}
