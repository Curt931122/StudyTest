package com.study.strategy;

@TotalValidRegion(min=3000)
class GoldVip implements CalPrice{

    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.5;
    }

}
