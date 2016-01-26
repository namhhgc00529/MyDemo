/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-01-08 17:48:37 UTC)
 * on 2016-01-22 at 11:48:49 UTC 
 * Modify at your own risk.
 */

package com.google.sample.mobileassistantbackend.shoppingAssistant.model;

/**
 * Model definition for PlaceInfo.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the shoppingAssistant. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PlaceInfo extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double distanceInKilometers;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeoPt location;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long placeId;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * @param address address or {@code null} for none
   */
  public PlaceInfo setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getDistanceInKilometers() {
    return distanceInKilometers;
  }

  /**
   * @param distanceInKilometers distanceInKilometers or {@code null} for none
   */
  public PlaceInfo setDistanceInKilometers(java.lang.Double distanceInKilometers) {
    this.distanceInKilometers = distanceInKilometers;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GeoPt getLocation() {
    return location;
  }

  /**
   * @param location location or {@code null} for none
   */
  public PlaceInfo setLocation(GeoPt location) {
    this.location = location;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public PlaceInfo setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getPlaceId() {
    return placeId;
  }

  /**
   * @param placeId placeId or {@code null} for none
   */
  public PlaceInfo setPlaceId(java.lang.Long placeId) {
    this.placeId = placeId;
    return this;
  }

  @Override
  public PlaceInfo set(String fieldName, Object value) {
    return (PlaceInfo) super.set(fieldName, value);
  }

  @Override
  public PlaceInfo clone() {
    return (PlaceInfo) super.clone();
  }

}
