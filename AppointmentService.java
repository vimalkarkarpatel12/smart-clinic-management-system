public Appointment bookAppointment(Appointment appointment) {
    return appointmentRepository.save(appointment);
}

public List<Appointment> getAppointmentsForDoctor(Long doctorId, LocalDate date) {
    return appointmentRepository.findAll();
}
