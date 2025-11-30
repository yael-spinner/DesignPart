public record PatronCreationDTO (
        String name,          // חובה
        String email,         // חובה
        String phoneNumber    // לא חובה
) {}
