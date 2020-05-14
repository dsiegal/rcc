package com.hurts;

import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class PriceRequest {
  private String customerId;
  private Date start;
  private int length;
  private Date end;
  private String tier;
  private boolean optionalInsurance;
  public List driversLicenseNumbers;
  public List driversBirthDates;
  public List names;
  private TimeZone timeZone;

  public PriceRequest(String customerId, Date start, int length, Date end, String tier, boolean optionalInsurance, List driversLicenseNumbers, List driversBirthDates, List names, TimeZone timeZone) {
    this.customerId = customerId;
    this.start = start;
    this.length = length;
    this.end = end;
    this.tier = tier;
    this.optionalInsurance = optionalInsurance;
    this.driversLicenseNumbers = driversLicenseNumbers;
    this.driversBirthDates = driversBirthDates;
    this.names = names;
    this.timeZone = timeZone;
  }

  public String getCustomerId() {
    return customerId;
  }

  public Date getStart() {
    return start;
  }

  public int getLength() {
    return length;
  }

  public Date getEnd() {
    return end;
  }

  public String getTier() {
    return tier;
  }

  public boolean isOptionalInsurance() {
    return optionalInsurance;
  }

  public List getDriversLicenseNumbers() {
    return driversLicenseNumbers;
  }

  public List getDriversBirthDates() {
    return driversBirthDates;
  }

  public List getNames() {
    return names;
  }

  public TimeZone getTimeZone() {
    return timeZone;
  }
}