Patient findByEmail(String email);

@Query("SELECT p FROM Patient p WHERE p.email = :value OR p.phone = :value")
Patient findByEmailOrPhone(@Param("value") String value);
