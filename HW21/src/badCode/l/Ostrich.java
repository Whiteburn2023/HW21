package badCode.l;

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Страус не может лететь");
    }

}
