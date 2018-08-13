package com.study.strategyEnhance;

@TotalValidRegion(@ValidRegion(min=3000,order=99))
class GoldVip implements CalPrice{

    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.5;
    }

}
