/**
 * 
 */
package com.promineotech.jeep.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.entity.Jeep;

/**
 * @author Blestro
 *
 */
@RestController
public class DefaultJeepSalesController implements JeepSalesController {

  @Override
  public List<Jeep> fetchJeep(String model, String trim) {
    // TODO Auto-generated method stub
    return null;
  }

}
