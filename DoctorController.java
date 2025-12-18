@GetMapping("/availability")
public ResponseEntity<?> getAvailability(
        @RequestParam Long doctorId,
        @RequestParam String date,
        @RequestHeader("Authorization") String token) {
    return ResponseEntity.ok("Available slots");
}
