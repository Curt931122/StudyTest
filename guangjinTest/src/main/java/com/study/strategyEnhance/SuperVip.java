package com.study.strategyEnhance;

@TotalValidRegion(@ValidRegion(min=2000,max=3000,order=99))
class SuperVip implements CalPrice{
	
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.7;
    }

}
