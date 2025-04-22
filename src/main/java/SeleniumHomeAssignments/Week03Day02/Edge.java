package SeleniumHomeAssignments.Week03Day02;

public class Edge extends Chrome {
    public void takeSnap() {
        System.out.println("takeSnap");
    }
    public void clearCookies() {
        System.out.println("clearCookies");
    }

    public static void main(String[] args){
        Edge edge = new Edge();
        edge.takeSnap();
        edge.clearCookies();
        //call the methods of Browser class
        edge.openURL();
        edge.closeBrowser();
        edge.navigateBack();
        //call the methods of Chrome class
        edge.openInCognito();
        edge.clearCache();




    }
}
