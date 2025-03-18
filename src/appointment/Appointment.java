package appointment;

public class Appointment {
    private int AppointmentID;
    private String AppointmentStart;
    private String AppointmentEnd;
    private String CustomerID;

    public Appointment(){}

    public Appointment(Builder builder) {
        this.AppointmentID = builder.AppointmentID;
        this.AppointmentStart = builder.AppointmentStart;
        this.AppointmentEnd = builder.AppointmentEnd;
        this.CustomerID = builder.CustomerID;
    }

    public int getAppointmentID() {
        return AppointmentID;
    }

    public String getAppointmentStart() {
        return AppointmentStart;
    }

    public String getAppointmentEnd() {
        return AppointmentEnd;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    @Override
    public String toString() {
        return "Appointment ID:"+AppointmentID+"\nAppointment Start date: "+AppointmentStart+"\nAppointment End date: "+AppointmentEnd+"\nCustomer ID: "+CustomerID;
    }

    public static class Builder {
        private int AppointmentID;
        private String AppointmentStart;
        private String AppointmentEnd;
        private String CustomerID;

        public Builder setAppointmentID(int appointmentID) {
            AppointmentID = appointmentID;
            return this;
        }
        public Builder setAppointmentStart(String appointmentStart) {
            AppointmentStart = appointmentStart;
            return this;
        }
        public Builder setAppointmentEnd(String appointmentEnd) {
            AppointmentEnd = appointmentEnd;
            return this;
        }
        public Builder setCustomerID(String customerID) {
            CustomerID = customerID;
            return this;
        }

        public Appointment build() { return new Appointment(this); }
    }

    public void TestAppointment(){
        Appointment.Builder builder = new Appointment.Builder();
        builder.setAppointmentID(1);
        builder.setAppointmentStart("2020-01-01");
        builder.setAppointmentEnd("2020-01-02");
        builder.setCustomerID("123");
        System.out.println(builder.build());
    }
}
