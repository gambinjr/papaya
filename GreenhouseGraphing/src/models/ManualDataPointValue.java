package models;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: matthallman
 * Date: 11/7/13
 * Time: 2:30 PM
 * Represents an actual point value for manual data. Similar to the pointValues table for sensors.
 */
public class ManualDataPointValue {
    int id;
    int manualDataPointId;
    int userId; // The user who inserted this data point value.
    Double pointValue;
    BigInteger ts;


}