public List<LocalTime> getAvailableTimes(Long doctorId, LocalDate date) {
    return new ArrayList<>();
}

public ResponseEntity<?> login(String email, String password) {
    return ResponseEntity.ok("Login successful");
}
