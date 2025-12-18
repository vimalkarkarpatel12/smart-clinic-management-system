@PostMapping
public ResponseEntity<?> savePrescription(
        @RequestBody Prescription prescription,
        @RequestHeader("Authorization") String token) {
    return ResponseEntity.ok("Prescription saved successfully");
}
