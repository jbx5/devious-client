package net.runelite.client.plugins.jrcbirdhouses.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Delegate;
import lombok.extern.slf4j.Slf4j;
import net.unethicalite.client.Static;

import java.time.Duration;
import java.time.Instant;

@AllArgsConstructor
@Slf4j
public class BirdHouse
{
    private static final int BIRD_HOUSE_DURATION = (int) Duration.ofMinutes(55).toSeconds(); //Adds 5 minute grace period.

    @Delegate
    @Getter
    private BirdHouseLocation location;

    @Getter
    @Setter
    private BirdHouseState state;

    public boolean isComplete()
    {
        return getCompletionTimestamp().isBefore(Instant.now());
    }

    public Instant getBuildTimestamp()
    {
        String configValue = Static.getConfigManager().getRSProfileConfiguration(
                "timetracking",
                String.format("birdhouse.%s", location.getVarp().getId())
        );

        if (configValue == null)
        {
            return Instant.EPOCH;
        }

        String[] split = configValue.split(":");
        if (split.length < 2)
        {
            return Instant.EPOCH;
        }

        return Instant.ofEpochSecond(Long.parseLong(split[1]));
    }

    public Instant getCompletionTimestamp()
    {
        return getBuildTimestamp().plusSeconds(BIRD_HOUSE_DURATION);
    }

    public Duration getTimeLeft()
    {
        return Duration.between(Instant.now(), getCompletionTimestamp());
    }

    @Override
    public String toString()
    {
        return String.format(
                "%s, State: %s %s | Time: %s",
                location.toString(),
                state, isComplete() ? "COMPLETED" : "IN_PROGRESS",
                getTimeLeft().toMinutes() + "m " + getTimeLeft().toSecondsPart() + "s"
        );
    }
}
