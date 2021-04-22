# Arrays

+ [Best Time to Buy and Sell Stock](#Best-Time-to-Buy-and-Sell-Stock)

## Best Time to Buy and Sell Stock
 
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

---

#### [Пример](src/main/java/ru/maximen/heap/BestTimetoBuyandSellStock.java)

```java
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
```