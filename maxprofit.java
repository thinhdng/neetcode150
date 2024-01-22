public class maxprofit {
    public static void main(String[] args) {
        
    }

    public int maxProfit(int[] prices) {
        int low = 0;
        int high = low + 1;
        int profit = 0;
        int currProfit = 0;
        while((low < high) && (high < prices.length)){
            if(prices[low] > prices[high]){
                low = high;
                high++;
            }
            else{
                currProfit = prices[high] - prices[low];
                if(profit < currProfit)
                    profit = currProfit;
                ++high;
            }
        }

        return profit;
    }
}

//using sliding window technique. time complexity = O(n)
//only 1 loop -> traverse once


