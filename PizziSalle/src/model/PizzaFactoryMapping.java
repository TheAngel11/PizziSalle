package model;

import model.enumerations.PizzaName;
import model.pizzas.*;

public class PizzaFactoryMapping {
    public static PizzaFactory getFactory(PizzaName pizzaName) {
        return switch (pizzaName) {
            case MARGHERITA -> new MargheritaPizzaFactory();
            case HAWAIIAN -> new HawaiianPizzaFactory();
            case BACON_CRISPY -> new BaconCrispyPizzaFactory();
            case AMERICAN -> new AmericanPizzaFactory();
            case TRAVIATA -> new TraviataPizzaFactory();
            case BURGER -> new BurgerPizzaFactory();
            case CASTELLERA -> new CastelleraPizzaFactory();
            case COWBOY -> new CowboyPizzaFactory();
            case TEXAS -> new TexasPizzaFactory();
            case COAST -> new CoastPizzaFactory();
            case BBQ -> new BBQPizzaFactory();
            case DIABLO -> new DiabloPizzaFactory();
            case CARBONARA -> new CarbonaraPizzaFactory();
            case SPANISH -> new SpanishPizzaFactory();
            case FOUR_CHEESES -> new FourCheesesPizzaFactory();
            case PEPPERONI -> new PepperoniPizzaFactory();
            case VEGETAL -> new VegetalPizzaFactory();
            case BARCELONA -> new BarcelonaPizzaFactory();
            case GIRONA -> new GironaPizzaFactory();
            case TARRAGONA -> new TarragonaPizzaFactory();
            case LLEIDA -> new LleidaPizzaFactory();
            case SIX_CHEESES -> new SixCheesesPizzaFactory();
            case MALLORCA -> new MallorcaPizzaFactory();
            case CARBONARA_DELUXE -> new CarbonaraDeluxePizzaFactory();
        };
    }
}
