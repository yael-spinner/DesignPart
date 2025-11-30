public record BookCreationDTO (
        String title,         // חובה
        String isbn,          // חובה
        Long authorId,        // חובה
        int copiesAvailable   // חובה
) {}
