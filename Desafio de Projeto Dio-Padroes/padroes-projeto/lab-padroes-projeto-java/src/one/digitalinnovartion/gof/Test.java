package one.digitalinnovartion.gof;

import one.digitalinnovartion.gof.facade.Facade;
import one.digitalinnovartion.gof.singleton.SingletonEager;
import one.digitalinnovartion.gof.singleton.SingletonLazy;
import one.digitalinnovartion.gof.singleton.SingletonLazyHolder;
import one.digitalinnovartion.gof.strategy.*;

public class Test {
    public static void main(String[] args){
        SingletonLazy lazy =SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager =SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyholder =SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
        lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Bruna", "64980000");
    }
}
