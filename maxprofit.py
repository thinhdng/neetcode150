class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        low = 0
        high = low + 1
        profit = 0
        currProfit = 0
        while low < high < len(prices):
            if prices[low] > prices[high]:
                low = high
                high+=1
            else:
                currProfit = prices[high] - prices[low] 
                if profit < currProfit:
                    profit = currProfit
                high+=1
        
        return profit