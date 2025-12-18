## MySQL Database Schema

### Doctor
- id (INT, PK)
- name (VARCHAR)
- specialization (VARCHAR)

### Patient
- id (INT, PK)
- name (VARCHAR)
- email (VARCHAR)
- phone (VARCHAR)

### Appointment
- id (INT, PK)
- appointment_time (DATETIME)
- doctor_id (FK)
- patient_id (FK)

### Prescription
- id (INT, PK)
- notes (TEXT)
- appointment_id (FK)
