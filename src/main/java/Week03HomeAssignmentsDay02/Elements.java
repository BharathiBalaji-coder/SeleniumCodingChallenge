package Week03HomeAssignmentsDay02;

public class Elements extends Button {
    public void selectElement() {
        System.out.println("Element is selected");
    }

    public static void main(String[] args) {
        Elements element = new Elements();
        element.selectElement();
        element.click();
        element.setText();
        element.submit();


    }
}
