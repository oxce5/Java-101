public class Appointment {
  int id, status;
  String date, time, purpose;
  Appointment(int id, String date, String time, String purpose, int status) {
    this.id = id;
    this.date = date;
    this.time = time;
    this.purpose = purpose;
    this.status = status;
  }
  public Appointment getAppointment() {
    return this;
  }

  public static Appointment makeAppointment(int id, String date, String time, String purpose, int status) {
    return new Appointment(id, date, time, purpose, status);
  }
}


