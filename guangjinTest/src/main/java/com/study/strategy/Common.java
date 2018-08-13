package com.study.strategy;

@TotalValidRegion(max=1000)//设置普通的在0-1000生效，以下类似，不再注释
class Common implements CalPrice{

    public Double calPrice(Double originalPrice) {
        return originalPrice;
    }

}
