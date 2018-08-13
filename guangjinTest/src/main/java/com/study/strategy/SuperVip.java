package com.study.strategy;

@TotalValidRegion(min=2000,max=3000)
class SuperVip implements CalPrice{
	
    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.7;
    }

}
