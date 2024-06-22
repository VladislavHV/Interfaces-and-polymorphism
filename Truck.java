public class Truck extends ServiceStation implements Interface {
    //В исправленном коде применен принцип инкапсуляции.
    //В исправленном коде применен принцип полиморфизма.
    //В исправленном коде применен принцип наследования.

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    /*@Override
    public String getModelName() {
        return getModelName();
    }

    @Override
    public int getWheelsCount() {
        return getWheelsCount();
    }*/

    //В исправленном коде применена перегрузка методов.

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service(){
        System.out.println("Ослуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++){
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}
