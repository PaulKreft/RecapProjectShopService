package de.neuefische.PaulKreft;

import java.util.UUID;

public record Product(
        UUID uuid,
        String name,
        int price
) {
}
