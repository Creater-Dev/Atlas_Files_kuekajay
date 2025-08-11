import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> components = new ArrayList<>();
    private String groupName;

    public Composite(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void brandName() {
        System.out.println("Group: " + groupName);
        for (Component comp : components) {
            comp.brandName();
        }
    }

    public void add(Component subComponent) {
        components.add(subComponent);
    }

    public void remove(Component subComponent) {
        components.remove(subComponent);
    }
}
