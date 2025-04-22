package SeleniumHomeAssignments.Week03HomeAssignmentsDay02;

public class APIClient {
    public void sendRequest(String endpoint) {
        System.out.println("Request sent");
    }

    public void sendRequest(String endpoint, String requestBody, String requestStatus) {
        System.out.println("Request sent");
    }

    public static void main(String[] args) {
        APIClient client = new APIClient();
        client.sendRequest("GET /api/v1/students");
        client.sendRequest("POST /api/v1/students", "{name: 'John'}", "201");

    }

}
