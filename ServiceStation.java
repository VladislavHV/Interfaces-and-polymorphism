public class ServiceStation {
    //В исправленном коде применен принцип инкапсуляции.
    //В исправленном коде применен принцип полиморфизма.
    //В исправленном коде применен принцип наследования.

    private String modelName;
    private int wheelsCount;

    public ServiceStation(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void check(Interface vehicle){
        if (vehicle != null){
            vehicle.service();
        }
    }
}