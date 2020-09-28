# -*- coding: utf-8 -*-
"""
Created on Mon Sep 28 23:53:19 2020

@author: 30480
"""

class Solution:
    def numWaterBottles(numBottles: int, numExchange: int) :
        bottle, ans = numBottles, numBottles
        while bottle >= numExchange:
            bottle -= numExchange
            ans += 1
            bottle += 1
        return ans
    
    numBottles=int(input("请输入购买几瓶酒"))
    numExchange=int(input("请输入几个空瓶能换一瓶"))
    print("能喝到",numWaterBottles(numBottles, numExchange),"瓶酒")
