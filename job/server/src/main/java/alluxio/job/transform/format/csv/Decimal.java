/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.job.transform.format.csv;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * Logical decimal type in Parquet.
 */
public class Decimal {
  private static final Logger LOG = LoggerFactory.getLogger(Decimal.class);

  private final int mPrecision;
  private final int mScale;

  /**
   * @param type the type definition, like "decimal(10, 2)"
   */
  public Decimal(String type) {
    String param = type.substring(8, type.length() - 1);
    String[] params = param.split(",");
    mPrecision = Integer.parseInt(params[0].trim());
    mScale = Integer.parseInt(params[1].trim());
  }

  /**
   * @return the precision
   */
  public int getPrecision() {
    return mPrecision;
  }

  /**
   * @return the scale
   */
  public int getScale() {
    return mScale;
  }

  /**
   * @param v the string value
   * @return the decimal with the expected scale
   */
  private BigDecimal toBigDecimal(String v) {
    int pointIndex = v.indexOf('.');
    int fractionLen = 0;
    if (pointIndex != -1) {
      fractionLen = v.length() - pointIndex - 1;
    } else {
      v += ".";
    }

    if (fractionLen >= mScale) {
      v = v.substring(0, v.length() - (fractionLen - mScale));
    } else {
      v = StringUtils.rightPad(v, v.length() + (mScale - fractionLen), '0');
    }
    return new BigDecimal(v);
  }

  /**
   * @param v the string value
   * @return the encoded bytes to write to parquet
   */
  public byte[] toParquetBytes(String v) {
    return toBigDecimal(v).unscaledValue().toByteArray();
  }
}
