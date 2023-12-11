package de.neuefische.PaulKreft;

import java.util.UUID;

public record Order(
        UUID uuid,
        Product product
) {
}
