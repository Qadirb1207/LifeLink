package requests;
import java.time.LocalDate;
public class Request {

 private int requestId;
    private int custId;
    private String bloodGroup;
    private int unitsRequired;
    private LocalDate requestDate;
    private String requestStatus;
    private int adminId;
    public Request(int requestId, int custId, String bloodGroup, int unitsRequired, LocalDate requestDate, String requestStatus, int adminId) {
        this.requestId = requestId;
        this.custId = custId;
        this.bloodGroup = bloodGroup;
        this.unitsRequired = unitsRequired;
        this.requestDate = requestDate;
        this.requestStatus = requestStatus;
        this.adminId = adminId;
    }
    public int getRequestId() {
        return requestId;
    }
    public int getCustId() {
        return custId;
    }
    public String getBloodGroup() {
        return bloodGroup;
    }
    public int getUnitsRequired() {
        return unitsRequired;
    }
    public LocalDate getRequestDate() {
        return requestDate;
    }
    public String getRequestStatus() {
        return requestStatus;
    }
    public int getAdminId() {
        return adminId;
    }
     public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String toString() {
        return "Request ID: " + requestId +
               ", Customer ID: " + custId +
               ", Blood Group: " + bloodGroup +
               ", Units: " + unitsRequired +
               ", Date: " + requestDate +
               ", Status: " + requestStatus;
    }
}
