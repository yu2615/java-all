public class í|ì‡ä÷êî {

    interface TriFunction<X, Y, Z, R> {
        R apply(X x, Y y, Z z);
    }

    interface Tak extends TriFunction<Integer, Integer, Supplier<Integer>, Integer> {}

    interface Dak extends Function<Dak, Tak> {}

    static Tak fpComb(Function<Tak, Tak> f) {
        Function<Dak, Tak> fun = d -> f.apply((x,y,z) -> d.apply(d).apply(x, y, z));
        Dak dak = d -> f.apply((x,y,z) -> d.apply(d).apply(x,y,z));
        return fun.apply(dak);
    }

    @Test
    public void tak() {
        Function<Tak, Tak> function = tak ->
                (x,y,z) ->
                        x <= y ? y : tak.apply(
                                tak.apply(x-1,y,z),
                                tak.apply(y-1,z.get(),() ->x),
                                () -> tak.apply(z.get() -1,x,() -> y));
        Tak tak = fpComb(function);
        System.out.println(tak.apply(20, 10, () -> 5));
    }
}