import java.util.ArrayList;

public class Solution{
       public static int findMinimumCoins(int amount){
            
            ArrayList<Integer> denominations = new ArrayList<Integer>();
            
            denominations.add(1);
            denominations.add(2);
            denominations.add(5);
            denominations.add(10);
            denominations.add(20);
            denominations.add(50);
            denominations.add(100);
            denominations.add(500);
            denominations.add(1000);
            
            int coinsCount = 0;
            int n = denominations.size();
            
            for(int i = n-1; i >= 0; i--){
                coinsCount = coinsCount + (amount / denominations.get(i));
                amount %= denominations.get(i);
            }
            return coinsCount;
        }
    }
