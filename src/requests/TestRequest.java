
package requests;

import java.time.LocalDate;

public class TestRequest {

    public static void main(String[] args) {

        Request req = new Request(
                0,
                1001,
                "A+",
                2,
                LocalDate.now(),
                "Pending",
                0
        );

        RequestManager manager = new RequestManager();

        manager.saveRequest(req);
    }
}
