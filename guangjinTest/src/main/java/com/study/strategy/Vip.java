package com.study.strategy;

@TotalValidRegion(min=1000,max=2000)
class Vip implements CalPrice{

    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.8;
    }

}
