package com.study.strategyEnhance;

@OnceValidRegion(@ValidRegion(min=2000,order=40))
class TwotDFourH implements CalPrice{
    
    public Double calPrice(Double originalPrice) {
        return originalPrice - 400;
    }
    
}
