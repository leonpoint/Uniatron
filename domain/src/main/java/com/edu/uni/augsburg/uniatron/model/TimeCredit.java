package com.edu.uni.augsburg.uniatron.model;

import java.util.Date;

/**
 * @author Fabio Hellmann
 */
public interface TimeCredit {
    int getId();

    Date getTimestamp();

    int getTimeInMinutes();
}
