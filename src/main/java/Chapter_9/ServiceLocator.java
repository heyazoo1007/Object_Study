package Chapter_9;

import Chapter_2.DiscountPolicy;

public class ServiceLocator {

    private static ServiceLocator soleInstance = new ServiceLocator();
    private DiscountPolicy discountPolicy;

    public static DiscountPolicy discountPolicy(){
        return soleInstance.discountPolicy;
    }

    public static void provide(DiscountPolicy discountPolicy){
        soleInstance.discountPolicy=discountPolicy;
    }

    //기본 생성자
    private ServiceLocator(){

    }
}
