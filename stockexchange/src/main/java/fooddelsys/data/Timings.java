package fooddelsys.data;

import java.time.LocalDateTime;

public class Timings {
    private final LocalDateTime openTime;
    private final LocalDateTime closeTime;

    public Timings(LocalDateTime openTime, LocalDateTime closeTime) {
        this.openTime = openTime;
        this.closeTime = closeTime;
    }
}
