package oop.step2.exam.task5;

public class Notebook implements Accessories {
    @Override
    public Object videocard(Produce p) {
        return setName(p);
    }

    @Override
    public Object processor(Produce p) {
        return setName(p);
    }

    @Override
    public Object matherboard(Produce p) {
        return setName(p);
    }

    @Override
    public Object memory(Produce p) {
        return setName(p);
    }

    private String setName(Produce p){
        switch (p){
            case SONY: return "SONY";
            case INTEL: return "INTEL";
            case SAMSUNG: return "SAMSUNG";
            case TOSHIBA: return "TOSHIBA";
            default: return "%unexpected value%";
        }
    }
}
