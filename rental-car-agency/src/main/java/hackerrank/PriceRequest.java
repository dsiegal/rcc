package hackerrank;

import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PriceRequest {
  private String customerId;
  private Date start;
  private int length;
  private Date end;
  private String tier;
  private boolean optionalInsurance;
  List driversLicenseNumbers;
  List driversBirthDates;
  List names;
  TimeZone timeZone;

}
