import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class Data {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class BindingListener implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("New value: " + evt.getNewValue());
    }
}

public class SimpleDataBindingExample {
    public static void main(String[] args) {
        Data data = new Data();
        BindingListener listener = new BindingListener();

        data.addPropertyChangeListener("value", listener);

        data.setValue("Hello, world!");
        data.setValue("Data binding example");
    }
}
